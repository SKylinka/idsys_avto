package ru.stqa.pft.idsys.tests.WS;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.LookupCustomersRqData;
import ru.stqa.pft.idsys.model.Zdps;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.LookupCustomersErr;
import ru.stqa.pft.idsys.tests.TestBase;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;


public class CreatWsDocTest extends TestBase {

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
   * 1) �������� ������� ����� ��� ������
   * @throws LookupCustomersErr
   * @throws SQLException
   * @throws InterruptedException
   */
  @Test(enabled = false)
  public void testFlCreation() throws LookupCustomersErr, SQLException, InterruptedException, UnsupportedEncodingException {
    Zdps before = app.db().zdps();
    LookupCustomersRqData lookupCustomersRqData = new LookupCustomersRqData()
            .withInn("123456789000");
    app.soap().createLookupCustomersRq(lookupCustomersRqData);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
    verifyZdpListInUI();
  }

  /**
   * ���� ���� �� �������� ������� ��:
   * 1) �������� ������� ����� ��� ������
   * @throws LookupCustomersErr
   * @throws SQLException
   * @throws InterruptedException
   */
  @Test(enabled = false)
  public void testUlCreation() throws LookupCustomersErr, SQLException, InterruptedException, UnsupportedEncodingException {
    Zdps before = app.db().zdps();
    LookupCustomersRqData lookupCustomersRqData = new LookupCustomersRqData()
            .withInn("1234567890");
    app.soap().createLookupCustomersRq(lookupCustomersRqData);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
    verifyZdpListInUI();
  }

  /**
   * ���� ���� �� �������� ������� ���:
   * 1) �������� ������� ����� ��� ������
   * @throws LookupCustomersErr
   * @throws SQLException
   * @throws InterruptedException
   */
  @Test(enabled = false)
  public void testKioCreation() throws LookupCustomersErr, SQLException, InterruptedException, UnsupportedEncodingException {
    Zdps before = app.db().zdps();
    LookupCustomersRqData lookupCustomersRqData = new LookupCustomersRqData()
            .withInn("12345");
    app.soap().createLookupCustomersRq(lookupCustomersRqData);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
    verifyZdpListInUI();
  }

  /**
   * ���� ���� �� �������� �������������:
   * 1) �������� ������� ����� ��� ������
   * @throws LookupCustomersErr
   * @throws SQLException
   * @throws InterruptedException
   */
  @Test(enabled = false)
  public void testBadCreation() throws LookupCustomersErr, SQLException, InterruptedException, UnsupportedEncodingException {
    Zdps before = app.db().zdps();
    LookupCustomersRqData lookupCustomersRqData = new LookupCustomersRqData()
            .withInn("1234567");
    app.soap().createLookupCustomersRq(lookupCustomersRqData);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
    verifyZdpListInUI();
  }

  /**
   * ���� ���� �� �������� ������� � ������ ��������� ���:
   * 1) �������� ������� ����� ��� ������
   * @throws LookupCustomersErr
   * @throws SQLException
   * @throws InterruptedException
   */
  @Test(enabled = false)
  public void testNullCreation() throws LookupCustomersErr, SQLException, InterruptedException, UnsupportedEncodingException {
    Zdps before = app.db().zdps();
    LookupCustomersRqData lookupCustomersRqData = new LookupCustomersRqData()
            .withInn("");
    app.soap().createLookupCustomersRq(lookupCustomersRqData);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
    verifyZdpListInUI();
  }
}
