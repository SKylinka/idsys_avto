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
    //��������������� ����� - ���� �� ������ "���" � ���� "���"
    app.getZdpHelper().fillINN(new ZdpData("123456789000"));
    //��������������� ����� - ���� �� ������ "���������"
    app.getZdpHelper().sumbitDoc();
    /*
     */

  }
}
