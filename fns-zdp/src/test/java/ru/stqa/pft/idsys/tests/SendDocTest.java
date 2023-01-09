package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;

public class SendDocTest extends TestBase{

  @Test
  public void testSendDoc() {
    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    //��������������� ����� - ��������� ����������(�������) �������
    app.getZdpHelper().selectDoc(0); //0 - ������ ������
    //��������������� ����� - ��������� ����������(�������) ������� � ����� ������������ ���� �������� �� ���
    app.getZdpHelper().selectDocRight();
    //��������������� ����� - ������� ��������
    app.getZdpHelper().sendDoc();
    //��������������� ����� - ������� ������ "�����"
    app.getNavigationHelper().exit();
    //

  }
}
