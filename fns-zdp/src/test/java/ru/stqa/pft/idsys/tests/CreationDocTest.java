package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;


public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    int before = app.getZdpHelper().getDocCount(); //������� ���������� �������� �� ��������
    //��������������� ����� - �������� �������
    app.getZdpHelper().createDoc(new ZdpData("123456789000"));
    int after = app.getZdpHelper().getDocCount(); //������� ���������� �������� ����� ��������
    Assert.assertEquals(after, before + 1); //��������� �����������
    //��������������� ����� - ������� ������ "�����"
    app.getNavigationHelper().exit();
    /*
     */
  }
}
