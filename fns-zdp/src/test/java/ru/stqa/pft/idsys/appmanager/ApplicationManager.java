package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;


//�������� ����� ��������������� �������
public class ApplicationManager {

  //������������� ��������
  protected WebDriver wd;

  //���������� ����������
  private NavigationHelper navigationHelper;
  private ZdpHelper zdpHelper;
  private SessionHelper sessionHelper;
  private String browser;

  //����������� �������� � ���������� browser � � ��������
  public ApplicationManager(String browser) {
    this.browser = browser;
  }


  public void init() {
    // ���������� ��� ���������� ��������� � �����
    if (browser.equals(BrowserType.CHROME)) {  //equals ��������� ��� ��������
      wd = new ChromeDriver();
    } else  if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    }


    //����� � ���������
    wd.get("http://192.168.1.211:8080/bank_client/");

    //������������� ������� 3��
    zdpHelper = new ZdpHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);

    //������� 5���
    zdpHelper.timeout5sec();

    //����� � ���������
    sessionHelper.login("AVTOTEST", "123456");
  }


  public void stop() {
    wd.quit();
  }

  //���������� ����������
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
}
