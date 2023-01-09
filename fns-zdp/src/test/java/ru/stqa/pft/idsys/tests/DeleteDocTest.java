package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.idsys.model.ZdpData;

public class DeleteDocTest extends TestBase {

  @Test
  public void testDeleteDoc() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    //�������� ���� �� ������ � ����������
    if (! app.getZdpHelper().isThereADoc()) {
      app.getZdpHelper().createDoc(new ZdpData("123456789000"));
    }
    int before = app.getZdpHelper().getDocCount(); //������� ���������� �������� �� ��������
    //��������������� ����� - ��������� ����������(�������) �������
    app.getZdpHelper().selectDoc(0); //����� ���������� �������� before - 1 - �������� ���������
    //��������������� ����� - ���� �� ������ "�������"
    app.getZdpHelper().selectDelete();
    //������������� ��������(������� ������ "��")
    app.getZdpHelper().comitDelete();
    //������� ��� ������������ 5 ���
    //app.getZdpHelper().timeout5sec();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.getZdpHelper().refreshPage();
    int after = app.getZdpHelper().getDocCount(); //������� ���������� �������� ����� ��������
    Assert.assertEquals(after, before - 1); //��������� �����������

  }

}
