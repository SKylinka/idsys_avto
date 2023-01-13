package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;


//основной класс вспомогательных функций
public class ApplicationManager {

  //инициализация драйвера
  protected WebDriver wd;

  //декларация помощников
  private NavigationHelper navigationHelper;
  private ZdpHelper zdpHelper;
  private SessionHelper sessionHelper;
  private String browser;

  //конструктор браузера с переменной browser и её передача
  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void init() {
    // переменная для управления браузером и выбор
    if (browser.equals(BrowserType.CHROME)) {  //equals сравнение для объектов
      wd = new ChromeDriver();
    } else  if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    }


    //Логин в интерфейс
    wd.get("http://192.168.1.211:8080/bank_client/");

    //инициализации методов 3шт
    zdpHelper = new ZdpHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);

    //таймаут 5сек
    zdpHelper.timeout5sec();

    //Логин в интерфейс
    sessionHelper.login("AVTOTEST", "123456");
  }


  public void stop() {
    wd.quit();
  }

  //декларация помощников
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
}
