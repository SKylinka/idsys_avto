package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;


public class CreationDocTest extends TestBase {

  /**
   * �������� �� ���������� ������:
   * 1) ��������� ������� �������� � �� � ���� �� ������ ����, �� ��� �������
   * 2) ������� � ������ ���
   * 3) ������� � ������ ���
   * @throws InterruptedException
   * @throws SQLException
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException, SQLException {
    if (app.db().zdps().size() > 3) {
      app.db().deleteAllDoc();
    }
    app.goTo().fns();
    app.goTo().zdpPage();
  }

  /**
   * ���� ���� �� �������� ������� ��:
   * 1) ������������ ������ ������ �������� �� �� � ���������� before
   * 2) ������������ ������� ����� ���������� zdp
   * 3) �������� ������� ����� ���������� zdp
   * 4) ������������ ������ ������ �������� �� �� � ���������� after
   * 5) ������ ������ - �������� ������
   * 6) ��������� �������� ���������� before � after
   * @throws Exception
   */
  @Test(enabled = true)
  public void testDocCreationFL() throws Exception {
    Zdps before = app.db().zdps();
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().create(zdp);
    Zdps after = app.db().zdps();
    app.zdp().refreshPage();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

  /**
   * ���� ���� �� �������� ������� ��:
   * 1) ������������ ������ ������ �������� �� �� � ���������� before
   * 2) ������������ ������� ����� ���������� zdp
   * 3) �������� ������� ����� ���������� zdp
   * 4) ������������ ������ ������ �������� �� �� � ���������� after
   * 5) ������ ������ - �������� ������
   * 6) ��������� �������� ���������� before � after
   * @throws Exception
   */
  @Test(enabled = true)
  public void testDocCreationUL() throws Exception {
    Zdps before = app.db().zdps();
    ZdpData zdp = new ZdpData().withInn("1234567890");
    app.zdp().create(zdp);
    Zdps after = app.db().zdps();
    app.zdp().refreshPage();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

  /**
   * ���� ���� �� �������� ������� ���:
   * 1) ������������ ������ ������ �������� �� �� � ���������� before
   * 2) ������������ ������� ����� ���������� zdp
   * 3) �������� ������� ����� ���������� zdp
   * 4) ������������ ������ ������ �������� �� �� � ���������� after
   * 5) ������ ������ - �������� ������
   * 6) ��������� �������� ���������� before � after
   * @throws Exception
   */
  @Test(enabled = true)
  public void testDocCreationKIO() throws Exception {
    Zdps before = app.db().zdps();
    ZdpData zdp = new ZdpData().withInn("12345");
    app.zdp().create(zdp);
    Zdps after = app.db().zdps();
    app.zdp().refreshPage();
    Assert.assertEquals(after.size(), before.size() + 1);

  }

  /**
   * ���� ���� �� �������� ������� � �� ����������� �������:
   * 1) ������������ ������ ������ �������� �� �� � ���������� before
   * 2) ������������ ������� ����� ���������� zdp
   * 3) �������� ������� ����� ���������� zdp
   * 4) ������������ ������ ������ �������� �� �� � ���������� after
   * 5) ������ ������ - �������� ������
   * 6) ��������� �������� ���������� before � after
   * @throws Exception
   */
  @Test(enabled = true)
  public void testDocCreationBad() throws Exception {
    Zdps before = app.db().zdps();
    ZdpData zdp = new ZdpData().withInn("1234567");
    app.zdp().create(zdp);
    Zdps after = app.db().zdps();
    app.zdp().refreshPage();
    Assert.assertEquals(after.size(), before.size());
  }

  /**
   * ���� ���� �� �������� ������� � ������� �������:
   * 1) ������������ ������ ������ �������� �� �� � ���������� before
   * 2) ������������ ������� ����� ���������� zdp
   * 3) �������� ������� ����� ���������� zdp
   * 4) ������������ ������ ������ �������� �� �� � ���������� after
   * 5) ������ ������ - �������� ������
   * 6) ��������� �������� ���������� before � after
   * @throws Exception
   */
  @Test(enabled = true)
  public void testDocCreationNull() throws Exception {
    Zdps before = app.db().zdps();
    ZdpData zdp = new ZdpData().withInn("");
    app.zdp().create(zdp);
    Zdps after = app.db().zdps();
    app.zdp().refreshPage();
    Assert.assertEquals(after.size(), before.size());
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
