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


//�������� ����� ��������������� �������
public class ApplicationManager {
  //
  private final Properties properties;

  //������������� ��������
  protected WebDriver wd;

  //���������� ����������
  private NavigationHelper navigationHelper;
  private ZdpHelper zdpHelper;
  private SessionHelper sessionHelper;
  private Browser browser;
  private DbHelper dbHelper;
  private SoapHelper soupHelper;

  //����������� �������� � ���������� browser � � ��������
  public ApplicationManager(Browser browser) {
    this.browser = browser;
    properties = new Properties();
  }


  public void init() throws IOException {
    //���������� ���������� ����� ����
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
    //������������� ������ ����������� � ��
    dbHelper = new DbHelper();
    //������������� ������ ����������� ����� soap
    soupHelper = new SoapHelper();
    // ���������� ��� ���������� ��������� � �����
    if (browser.equals(Browser.CHROME)) {  //equals ��������� ��� ��������
      wd = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
    } else  if (browser.equals(Browser.IE)) {
      wd = new InternetExplorerDriver();
    } else if (browser.equals(Browser.FIREFOX)) {
      wd = new FirefoxDriver();
    }


    //����� � ���������
    wd.get(properties.getProperty("web.baseURL"));

    //������������� ������� 3��
    zdpHelper = new ZdpHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);


    //������� 2���
    zdpHelper.timeOut(2);

    //����� � ���������
    sessionHelper.login(properties.getProperty("web.Login"), properties.getProperty("web.Password"));
    zdpHelper.timeOut(2);
  }

  // ����� ��� �� ������
  public void loginAdm() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    sessionHelper.login(properties.getProperty("adm.Login"), properties.getProperty("adm.Password"));
  }

  // ����� ��� ��
  public void loginUser() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    sessionHelper.login(properties.getProperty("web.Login"), properties.getProperty("web.Password"));
  }



  public void stop() {
    wd.quit();
  }

  //���������� ���������� - �����������
  public ZdpHelper zdp() {
    return zdpHelper;
  }
  //���������� ����������
  public NavigationHelper goTo() {
    return navigationHelper;
  }
  //���������� ����������
  public SessionHelper sessionHelper() {
    return sessionHelper;
  }
  //���������� ����������
  public DbHelper db() {
    return dbHelper;
  }
  //���������� ����������
  public SoapHelper soap() { return soupHelper;}
}
