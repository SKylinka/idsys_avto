package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class FilterZdpTest extends TestBase{

  @BeforeTest
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //��������������� ����� - �������� ������� ������� ���
    app.goTo().fns();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();

    /*
     */

    //��������������� ����� - ������� ��� �������
    app.db().deleteAllDoc();
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

  @Test(enabled = true)
  public void testFilterStatusZdp() throws SQLException, InterruptedException {
    //������� ����������� �������� �� ������� ����� � �� � ���������� before
    int before = app.db().countStatus();
    //��������������� ����� - ������� �� ������ �������� �������
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    //��������������� ����� - ����� ������� � �������
    app.zdp().changeStatusFilter();
    //������������ ��������� � ���������� after
    int after = app.zdp().count();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after, before);
    //��������������� ����� - ������� �� ������ �������� �������
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }

  @Test(enabled = true)
  public void testFilterCreateDateZdp() throws SQLException, InterruptedException, ParseException {
    //������� ����������� �������� �� ������������ ���� � �� � ���������� before
    int before = app.db().countCreateDate();
    //��������������� ����� - ������� �� ������ �������� �������
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    //��������������� ����� - ����� ������� � �������
    app.zdp().changeCreateDateFilter();
    //������������ ��������� � ���������� after
    int after = app.zdp().count();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after, before);
    //��������������� ����� - ������� �� ������ �������� �������
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }


  @Test(enabled = true)
  public void testFilterInnZdp() throws SQLException, InterruptedException {
    //������� ����������� �������� � ��������� ��� � �� � ���������� before
    int before = app.db().countInn("123456789111");
    //��������������� ����� - ������� �� ������ �������� �������
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    //��������������� ����� - ����� ������� � �������
    app.zdp().changeInn("123456789111");
    //������������ ��������� � ���������� after
    int after = app.zdp().count();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after, before);
    //��������������� ����� - ������� �� ������ �������� �������
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }

  @AfterTest()
  public void exit() {
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    /*
     */
  }
}
