package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


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
  private Browser browser;
  private DbHelper dbHelper;
  private SoapHelper soupHelper;

  //конструктор браузера с переменной browser и её передача
  public ApplicationManager(Browser browser) {
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
    if (browser.equals(Browser.CHROME)) {  //equals сравнение для объектов
      wd = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
    } else  if (browser.equals(Browser.IE)) {
      wd = new InternetExplorerDriver();
    } else if (browser.equals(Browser.FIREFOX)) {
      wd = new FirefoxDriver();
    }


    //Логин в интерфейс
    wd.get(properties.getProperty("web.baseURL"));

    //инициализации методов 3шт
    zdpHelper = new ZdpHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);


    //таймаут 2сек
    zdpHelper.timeOut(2);

    //Логин в интерфейс
    sessionHelper.login(properties.getProperty("web.Login"), properties.getProperty("web.Password"));
    zdpHelper.timeOut(2);
  }

  // логин под УЗ админа
  public void loginAdm() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    sessionHelper.login(properties.getProperty("adm.Login"), properties.getProperty("adm.Password"));
  }

  // логин под УЗ
  public void loginUser() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    sessionHelper.login(properties.getProperty("web.Login"), properties.getProperty("web.Password"));
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
