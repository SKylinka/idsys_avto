package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

//����� �������� ��������� �� ��������
public class NavigationHelper extends HelperBase{

  //���������� ����������� �������� � �������� ��������� � ������������ ������ � ���
  public NavigationHelper(WebDriver wd) {
    super(wd);// ��������� � ������������ �������� ������
  }

  //��������������� ����� - ������� � ������ "�������� � ���������������"
  public void zdpPage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='�������� � ���������������']/../../div"));
  }

  //��������������� ����� - �������� ������� ������� ���
  public void fns() throws InterruptedException {
    if(!wd.findElement(By.xpath("//span[text()='�������� � ���������������']/../../div")).isDisplayed()) {
      //��������������� ����� - ������� � ������ "�������� � ���������������"
      fnsPage();
    } else {
      //��������������� ����� - ������� � ������ "�������� � ���������������"
      zdpPage();
    }
  }


  public void fnsPage() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div[1]/div"));
  }

  //��������������� ����� - ������� ������ "�����"
  public void exit() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/div[3]/div"));
  }

  //������� � ������ ��������� �������
  public void sysObject() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[text()='��������� �������']"));
  }
  //������� � ������ ����� �������
  public void dataExchange() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='����� �������']/../../div"));
  }
  //������� � ������ ���������
  public void adapters() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='��������']/../../div"));
  }
  //�������������� �������� � ������ ���������     // ������� � ������ ���������
  public void pageAdapters() throws InterruptedException {
    sysObject();
    dataExchange();
    adapters();
  }

  //������� �� ������� "�����"
  public void pageAnswer() {
    click(By.xpath("//div[text()='�����']"));
  }

  //��������������� ����� - ������� � ������ "����������� ���������������
  public void pageActiveSuspensions() {
    click(By.xpath("//div[text()='����������� ���������������']"));
  }
}
