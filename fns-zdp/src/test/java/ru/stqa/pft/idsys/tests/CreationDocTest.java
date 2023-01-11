package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.HashSet;
import java.util.List;


public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    //������������ ��������� � ���������� before
    List<ZdpData> before = app.getZdpHelper().getZdpList();
    //int before = app.getZdpHelper().getDocCount(); //������� ���������� �������� �� ��������
    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData("123456789000");
    app.getZdpHelper().createDoc(zdp);
    //������������ ��������� � ���������� after
    List<ZdpData> after = app.getZdpHelper().getZdpList();
    //int after = app.getZdpHelper().getDocCount(); //������� ���������� �������� ����� ��������
    Assert.assertEquals(after.size(), before.size() + 1); //��������� ����������� ��� ���������(������)
    //Assert.assertEquals(after, before + 1); //��������� ����������� ��� �����


    int max = 0;
    for (ZdpData z : after) {
    if (z.getId() > max){
      max = z.getId();
    }
    }
    zdp.setId(max);
    before.add(zdp);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    //��������������� ����� - ������� ������ "�����"
    app.getNavigationHelper().exit();
    /*
     */
  }
}
