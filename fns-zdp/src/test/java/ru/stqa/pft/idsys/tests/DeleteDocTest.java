package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class DeleteDocTest extends TestBase {

  @Test
  public void testDeleteDoc() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    int before = app.getZdpHelper().getDocCount(); //������� ���������� �������� �� ��������
    //��������������� ����� - ��������� ����������(�������) �������
    app.getZdpHelper().selectDoc();
    //��������������� ����� - ���� �� ������ "�������"
    app.getZdpHelper().selectDelete();
    //������������� ��������(������� ������ "��")
    app.getZdpHelper().comitDelete();
    //������� ��� ������������ 5 ���
    app.getZdpHelper().timeout5sec();
    int after = app.getZdpHelper().getDocCount(); //������� ���������� �������� ����� ��������
    Assert.assertEquals(after, before - 1); //��������� �����������

  }

}
