package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;

public class SendDocTest extends TestBase{

  @Test
  public void testSendDoc() throws InterruptedException {
    //��������������� ����� - ������� � ������ "���"
    app.goTo().fnsPage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //��������������� ����� - ��������� ����������(�������) �������
    app.zdp().selectDoc(0); //0 - ������ ������
    //��������������� ����� - ��������� ����������(�������) ������� � ����� ������������ ���� �������� �� ���
    app.zdp().selectDocRight();
    //��������������� ����� - ������� ��������
    app.zdp().sendDoc();
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    //

  }
}
