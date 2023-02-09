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
  public void testFilterStatusZdp() throws SQLException, InterruptedException {
    //������� ����������� �������� �� ������� ����� � �� � ���������� before
    int before = app.db().count();
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

  @Test
  public void testFilterCreateDateZdp() throws SQLException, InterruptedException {
    //������� ����������� �������� �� ������� ����� � �� � ���������� before
    int before = app.db().count();
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


  @Test
  public void testFilterInnZdp() throws SQLException, InterruptedException {
    //������� ����������� �������� �� ������� ����� � �� � ���������� before
    int before = app.db().count();
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
}
