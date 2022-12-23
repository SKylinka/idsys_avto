package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//����� �������� ��������� �� ��������
public class NavigationHelper {

  //������������� ��������
  private WebDriver wd;

  //���������� ����������� �������� � �������� ��������� � ������������ ������ � ���
  public NavigationHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void gotoZDPpage() {
    wd.findElement(By.xpath("//*[@id=\"gwt-uid-12\"]")).click();
  }

  public void gotoFNSpage() {
    wd.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div[1]/div")).click();
  }
}
