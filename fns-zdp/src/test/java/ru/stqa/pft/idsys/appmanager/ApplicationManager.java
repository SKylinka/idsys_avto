package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


//основной класс вспомогательных функций
public class ApplicationManager {
  //
  private final Properties properties;

  //инициализация драйвера
  protected WebDriver wd;

  //декларация помощников
  private NavigationHelper navigationHelper;
  private ZdpHelper zdpHelper;
  private SessionHelper sessionHelper;
  private String browser;
  private DbHelper dbHelper;
  private SoapHelper soupHelper;

  //конструктор браузера с переменной browser и её передача
  public ApplicationManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }


  public void init() throws IOException {
    //управление настройкой через файл
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
    //инициализация метода подключения к БД
    dbHelper = new DbHelper();
    //инициализация метода подключения через soap
    soupHelper = new SoapHelper();
    // переменная для управления браузером и выбор
    if (browser.equals(BrowserType.CHROME)) {  //equals сравнение для объектов
      wd = new ChromeDriver();
    } else  if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    }


    //Логин в интерфейс
    wd.get(properties.getProperty("web.baseURL"));

    //инициализации методов 3шт
    zdpHelper = new ZdpHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);


    //таймаут 2сек
    zdpHelper.timeout();

    //Логин в интерфейс
    sessionHelper.login(properties.getProperty("web.Login"), properties.getProperty("web.Password"));
    zdpHelper.timeout();
  }


  public void stop() {
    wd.quit();
  }

  //декларация помощников - возвращение
  public ZdpHelper zdp() {
    return zdpHelper;
  }
  //декларация помощников
  public NavigationHelper goTo() {
    return navigationHelper;
  }
  //декларация помощников
  public SessionHelper sessionHelper() {
    return sessionHelper;
  }
  //декларация помощников
  public DbHelper db() {
    return dbHelper;
  }
  //декларация помощников
  public SoapHelper soap() { return soupHelper;}
}
