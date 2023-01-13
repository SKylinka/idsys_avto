package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.List;


public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.goTo().fnsPage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //������������ ��������� � ���������� before
    List<ZdpData> before = app.zdp().list();
    //int before = app.getZdpHelper().getDocCount(); //������� ���������� �������� �� ��������
    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData("123456789000");
    app.zdp().create(zdp);
    //������������ ��������� � ���������� after
    List<ZdpData> after = app.zdp().list();
    //int after = app.getZdpHelper().getDocCount(); //������� ���������� �������� ����� ��������
    Assert.assertEquals(after.size(), before.size() + 1); //��������� ����������� ��� ���������(������)
    //Assert.assertEquals(after, before + 1); //��������� ����������� ��� �����

    //before.add(zdp);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    /*
     */
  }
}
