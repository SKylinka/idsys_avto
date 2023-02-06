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
  private String browser;
  private DbHelper dbHelper;
  private SoapHelper soupHelper;

  //����������� �������� � ���������� browser � � ��������
  public ApplicationManager(String browser) {
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
    if (browser.equals(BrowserType.CHROME)) {  //equals ��������� ��� ��������
      wd = new ChromeDriver();
    } else  if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    }


    //����� � ���������
    wd.get(properties.getProperty("web.baseURL"));

    //������������� ������� 3��
    zdpHelper = new ZdpHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);


    //������� 2���
    zdpHelper.timeout();

    //����� � ���������
    sessionHelper.login(properties.getProperty("web.Login"), properties.getProperty("web.Password"));
    zdpHelper.timeout();
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
