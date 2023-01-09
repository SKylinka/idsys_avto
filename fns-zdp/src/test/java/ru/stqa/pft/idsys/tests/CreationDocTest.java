package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.List;


public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    //������������ ���������
    List<ZdpData> before = app.getZdpHelper().getZdpList();
    //int before = app.getZdpHelper().getDocCount(); //������� ���������� �������� �� ��������
    //��������������� ����� - �������� �������
    app.getZdpHelper().createDoc(new ZdpData("123456789000"));
    List<ZdpData> after = app.getZdpHelper().getZdpList();
    //int after = app.getZdpHelper().getDocCount(); //������� ���������� �������� ����� ��������
    Assert.assertEquals(after.size(), before.size() + 1); //��������� ����������� ������
    //Assert.assertEquals(after, before + 1); //��������� ����������� ���
    //��������������� ����� - ������� ������ "�����"
    app.getNavigationHelper().exit();
    /*
     */
  }
}
