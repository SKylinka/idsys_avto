package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;

public class CopyDocTest extends TestBase{

  @Test
  public void testCopyDoc() throws Exception{

    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    //��������������� ����� - ��������� ����������(�������) �������
    app.getZdpHelper().selectDoc();
    //��������������� ����� - ���� �� ������ "������� c ������������"
    app.getZdpHelper().copyDoc();
    //��������������� ����� - ���� �� ������ "���������"
    app.getZdpHelper().sumbitDoc();
    //��������������� ����� - ������� ������ "�����"
    app.getNavigationHelper().exit();


  }
}
