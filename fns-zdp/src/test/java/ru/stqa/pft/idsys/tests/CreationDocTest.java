package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;

public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    gotoZDPpage();
    //��������������� ����� - ���� �� ������ "�������"
    creationDoc();
    //��������������� ����� - ���� �� ������ "���" � ���� "���"
    fillINN(new ZdpData("123456789000"));
    //��������������� ����� - ���� �� ������ "���������"
    sumbitDoc();
    /*
     */

  }
}
