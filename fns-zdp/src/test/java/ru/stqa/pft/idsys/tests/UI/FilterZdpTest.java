package ru.stqa.pft.idsys.tests.UI;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.tests.TestBase;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class FilterZdpTest extends TestBase {

  /**
   * �������� �� ���������� ������:
   * 1) ������� � ������ ���
   * 2) ������� � ������ ���
   * 3) ������� ��� ��������� ������� �� ��
   * 4) �������� ������ ��������
   * 5) ��������� ������� �������� � �� � ���� �� ��� ������� ��� �����
   * @throws InterruptedException
   * @throws SQLException
   */
  @BeforeTest
  public void ensurePreconditions() throws InterruptedException, SQLException {
    app.goTo().fns();
    app.goTo().zdpPage();
    app.db().deleteAllDoc();
    app.zdp().refreshPage();
    if (app.db().zdps().size() == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789222"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789333"));
    }
  }

  /**
   * ���� ���� �� ���������� ������� "������":
   * 1) ������� ����������� �������� �� ������� "1 - �����" �� �� � ���������� before
   * 2) ������ ������ - �������� �������
   * 3) ������� � ������� ������ "1 - �����" � ������ ������ "���������"
   * 4) ������� ���������� �������� � ���������� ����� �������� ������� � ���������� after
   * 5) ��������� ���������� before � after
   * 6) ������ ������ - �������� �������
   * @throws SQLException
   * @throws InterruptedException
   */
  @Test(enabled = true)
  public void testFilterStatusZdp() throws SQLException, InterruptedException {
    int before = app.db().countStatus(1);
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    app.zdp().changeStatusFilter("�����");
    int after = app.zdp().count();
    Assert.assertEquals(after, before);
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }

  /**
   * ���� ���� �� ���������� ������� "���� � ����� �������� � - ��":
   * 1) ������� ����������� �������� �� ������������ ����(� 30.06.2019 00:00:00 �� ������� ����� +5 �����) �� �� � ���������� before
   * 2) ������ ������ - �������� �������
   * 3) ������� � ������� ���� �������� � - �� � ������ ������ "���������"
   * 4) ������� ���������� �������� � ���������� ����� �������� ������� � ���������� after
   * 5) ��������� ���������� before � after
   * 6) ������ ������ - �������� �������
   * @throws SQLException
   * @throws InterruptedException
   * @throws ParseException
   */
  @Test(enabled = false)
  public void testFilterCreateDateZdp() throws SQLException, InterruptedException, ParseException {
    int before = app.db().countCreateDate();
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    app.zdp().changeCreateDateFilter();
    int after = app.zdp().count();
    Assert.assertEquals(after, before);
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }

  /**
   * ���� ���� �� ���������� ������� "���":
   * 1) ������� ����������� �������� � �������� ��� �� �� � ���������� before
   * 2) ������ ������ - �������� �������
   * 3) ������� � ������� ��� � ������ ������ "���������"
   * 4) ������� ���������� �������� � ���������� ����� �������� ������� � ���������� after
   * 5) ��������� ���������� before � after
   * 6) ������ ������ - �������� �������
   * @throws SQLException
   * @throws InterruptedException
   */
  @Test(enabled = false)
  public void testFilterInnZdp() throws SQLException, InterruptedException {
    int before = app.db().countInn("123456789111");
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    app.zdp().changeInn("123456789111");
    int after = app.zdp().count();
    Assert.assertEquals(after, before);
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }

  /**
   * �������� ����� ���������� ������:
   * 1) ������� ������ "�����"
   */
  @AfterTest()
  public void exit() {
    app.goTo().exit();
  }
}
