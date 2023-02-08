package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class FilterZdpTest extends TestBase{

  @BeforeTest
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //��������������� ����� - �������� ������� ������� ���
    app.goTo().fns();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //��������������� ����� - ������� ��� �������
    app.db().deleteAll();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    //�������� ���� �� ������ � ��
    if (app.db().zdps().size() == 0) {
      //��������������� ����� - �������� ��������
      app.zdp().create(new ZdpData().withInn("123456789111"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789222"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789333"));
    }
  }

  @Test
  public void testFilterZdp() throws SQLException {
    int sortCount = app.db().count();


    //������������ ��������� � ���������� before
    int before = app.db().zdps().size();



    //������������ ��������� � ���������� after
    int after = app.db().zdps().size();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after, before);
  }

}
