package ru.stqa.pft.idsys.tests;

import org.testng.annotations.*;

public class DeleteDocTest extends TestBase {

  @Test
  public void testDeleteDoc() throws Exception {

    //��������������� ����� - ������� � ������ "���"
    gotoFNSpage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    gotoZDPpage();
    //��������������� ����� - ��������� ����������(�������) �������
    selectDoc();
    //��������������� ����� - ���� �� ������ "�������"
    selectDelete();
    //������������� ��������(������� ������ "��")
    comitDelete();
    //������� ��� ������������ 5 ���
    timeout5sec();
  }

}
