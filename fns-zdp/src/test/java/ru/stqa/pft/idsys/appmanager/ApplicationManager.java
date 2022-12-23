package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.fail;

//класс вспомогательных функций
public class ApplicationManager {

  //инициализация драйвера
  protected WebDriver wd;

  //декларация помощников
  private NavigationHelper navigationHelper;
  private ZdpHelper zdpHelper;
  private SessionHelper sessionHelper;


  public void init() {

    System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
    wd = new ChromeDriver();

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
  public ZdpHelper getZdpHelper() {
    return zdpHelper;
  }
  //декларация помощников
  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
  //декларация помощников
  public SessionHelper sessionHelper() {
    return sessionHelper;
  }
}
