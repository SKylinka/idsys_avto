package ru.stqa.pft.idsys.tests;

import org.testng.annotations.*;

public class DeleteDocTest extends TestBase {

  @Test
  public void testDeleteDoc() throws Exception {

    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    //��������������� ����� - ��������� ����������(�������) �������
    app.getZdpHelper().selectDoc();
    //��������������� ����� - ���� �� ������ "�������"
    app.getZdpHelper().selectDelete();
    //������������� ��������(������� ������ "��")
    app.getZdpHelper().comitDelete();
    //������� ��� ������������ 5 ���
    app.getZdpHelper().timeout5sec();
  }

}
