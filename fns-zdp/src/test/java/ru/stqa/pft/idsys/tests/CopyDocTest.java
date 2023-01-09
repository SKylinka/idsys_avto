package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

public class CopyDocTest extends TestBase{

  @Test
  public void testCopyDoc() throws Exception{

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
    app.getZdpHelper().selectDoc(0); //����� ������� ��������
    //��������������� ����� - ���� �� ������ "������� c ������������"
    app.getZdpHelper().copyDoc();
    //��������������� ����� - ���� �� ������ "���������"
    app.getZdpHelper().sumbitDoc();
    //��������������� ����� - ���� �� ������ �������� �����(�������)
    app.getZdpHelper().close();

    int after = app.getZdpHelper().getDocCount(); //������� ���������� �������� ����� ��������
    Assert.assertEquals(after, before + 1); //��������� �����������
    //��������������� ����� - ������� ������ "�����"
    app.getNavigationHelper().exit();
  }
}
