package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.fail;

//����� ��������������� �������
public class ApplicationManager {

  //������������� ��������
  protected WebDriver wd;

  //���������� ����������
  private NavigationHelper navigationHelper;
  private ZdpHelper zdpHelper;
  private SessionHelper sessionHelper;


  public void init() {

    System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
    wd = new ChromeDriver();

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
  public ZdpHelper getZdpHelper() {
    return zdpHelper;
  }
  //���������� ����������
  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
  //���������� ����������
  public SessionHelper sessionHelper() {
    return sessionHelper;
  }
}
