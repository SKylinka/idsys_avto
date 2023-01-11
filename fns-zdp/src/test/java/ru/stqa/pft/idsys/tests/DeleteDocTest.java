package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.List;

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
    //������������ ��������� � ���������� before
    List<ZdpData> before = app.getZdpHelper().getZdpList();
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
    app.getZdpHelper().timeout5sec();
    //������������ ��������� � ���������� after
    List<ZdpData> after = app.getZdpHelper().getZdpList();
    Assert.assertEquals(after.size(), before.size() - 1); //��������� ����������� ��� ���������(������)

    //�������� �������� �� ������
    before.remove(before.size() - 1);
    app.getZdpHelper().timeout5sec();
    //���� ��������
    Assert.assertEquals(before,after);

  }
}
