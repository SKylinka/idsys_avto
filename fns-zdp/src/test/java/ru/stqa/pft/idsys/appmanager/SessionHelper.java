package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//����� �������� ������
public class SessionHelper extends HelperBase {


  public SessionHelper(WebDriver wd) {
//���������� ����������� �������� � �������� ��������� � ������������ ������ � ���
    super(wd);// ��������� � ������������ �������� ������
  }

  public void login(String username, String password) {
    type(By.id("LOGIN-USERNAME"), username);
    type(By.id("LOGIN-PASSWORD"),password);
    click(By.id("BTN-OK"));
  }
}
