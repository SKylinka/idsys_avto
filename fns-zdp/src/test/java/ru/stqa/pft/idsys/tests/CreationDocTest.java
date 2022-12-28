package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;


public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.getNavigationHelper().gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.getNavigationHelper().gotoZDPpage();
    //��������������� ����� - ���� �� ������ "�������"
    app.getZdpHelper().creationDoc();

    //�������
    timeout(2);


    //��������������� ����� - ���� �� ������ ������ "���"
    app.getZdpHelper().fillBik();

    //��������������� ����� - ��������� ����������(�������) �������
    app.getZdpHelper().selectBik();
    //��������������� ����� - ���� �� ������ "�������"
    app.getZdpHelper().complite();

    //��������������� ����� - ���� �� ������ "���" � ���� "���"
    app.getZdpHelper().fillINN(new ZdpData("123456789000"));
    //��������������� ����� - ���� �� ������ "���������"
    app.getZdpHelper().sumbitDoc();
    //��������������� ����� - ������� ������ "�����"
    app.getNavigationHelper().exit();
    /*
     */

  }
}
