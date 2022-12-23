package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//����� �������� ������
public class SessionHelper {

//������������� ��������
  private WebDriver wd;

  public SessionHelper(WebDriver wd) {
//���������� ����������� �������� � �������� ��������� � ������������ ������ � ���
    this.wd = wd;
  }

  public void login(String username, String password) {
    wd.findElement(By.id("LOGIN-USERNAME")).click();
    wd.findElement(By.id("LOGIN-USERNAME")).clear();
    wd.findElement(By.id("LOGIN-USERNAME")).sendKeys(username);
    wd.findElement(By.id("LOGIN-PASSWORD")).click();
    wd.findElement(By.id("LOGIN-PASSWORD")).clear();
    wd.findElement(By.id("LOGIN-PASSWORD")).sendKeys(password);
    wd.findElement(By.id("BTN-OK")).click();
  }
}
