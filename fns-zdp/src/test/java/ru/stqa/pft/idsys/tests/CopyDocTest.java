package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.HashSet;
import java.util.List;

public class CopyDocTest extends TestBase{

  @Test
  public void testCopyDoc() throws Exception{

    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    //�������� ���� �� ������ � ����������
    if (! app.getZdpHelper().isThereADoc()) {
      app.getZdpHelper().createDoc(new ZdpData("123456789111"));
    }
    //������������ ��������� � ���������� before
    List<ZdpData> before = app.getZdpHelper().getZdpList();
    //��������������� ����� - ��������� ����������(�������) �������
    app.getZdpHelper().selectDoc(before.size() - 1); //����� ��������
    //��������������� ����� - ���� �� ������ "������� c ������������"
    app.getZdpHelper().copyDoc();
    //��������������� ����� - ������� ���� ���
    app.getZdpHelper().clearINN();
    //���������� zdp ��� ����� ���
    ZdpData zdp = new ZdpData( "987654321000");
    //��������������� ����� - ���� ������ ��� ����� ����������
    app.getZdpHelper().fillINN(zdp);
    //��������������� ����� - ���� �� ������ "���������"
    app.getZdpHelper().sumbitDoc();
    //��������������� ����� - ���� �� ������ �������� �����(�������)
    app.getZdpHelper().close();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.getZdpHelper().refreshPage();
    app.getZdpHelper().timeout5sec();
    //������������ ��������� � ���������� after
    List<ZdpData> after = app.getZdpHelper().getZdpList();
    Assert.assertEquals(after.size(), before.size() + 1); //��������� ����������� ��� ���������(������)

    //��������� ���� �������(���������) � �������������� �� ��������������(������) � ���������������(���������)
    //before.remove(before.size() - 1);
    //before.add(zdp);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));


    //��������������� ����� - ������� ������ "�����"
    app.getNavigationHelper().exit();
  }
}
