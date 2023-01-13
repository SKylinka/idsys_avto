package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeleteDocTest extends TestBase {

  @BeforeMethod
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException {
    //��������������� ����� - ������� � ������ "���"
    app.goTo().fnsPage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //�������� ���� �� ������ � ����������
    if (app.zdp().list().size() == 0) {
      //��������������� ����� - �������� �������
      app.zdp().create(new ZdpData("123456789000"));
    }
  }

  @Test
  public void testDeleteDoc() throws Exception {
    //������������ ��������� � ���������� before
    List<ZdpData> before = app.zdp().list();
    //���������� ���
    int index = before.size() - 1;
    app.zdp().delete(index);
    //������� ��� ������������ 5 ���
    //app.getZdpHelper().timeout5sec();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    TimeUnit.SECONDS.sleep(2);
    //������������ ��������� � ���������� after
    List<ZdpData> after = app.zdp().list();
    TimeUnit.SECONDS.sleep(2);
    Assert.assertEquals(after.size(), index); //��������� ����������� ��� ���������(������)

    //�������� �������� �� ������
    //before.remove(before.size() - 1);
    //app.getZdpHelper().timeout5sec();
    //���� ��������
    //Assert.assertEquals(before,after);

  }


}
