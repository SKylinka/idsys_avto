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
   * Операции до выполнения тестов:
   * 1) Проверить наличие запросов в БД и если их больше трех, то все удалить
   * 2) Переход в раздел ФНС
   * 3) Переход в раздел ЗДП
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
   * Тест кейс по созданию запроса ФЛ:
   * 1) Создание запроса через веб сервис
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
   * Тест кейс по созданию запроса ЮЛ:
   * 1) Создание запроса через веб сервис
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
   * Тест кейс по созданию запроса КИО:
   * 1) Создание запроса через веб сервис
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
   * Тест кейс по созданию некорректного:
   * 1) Создание запроса через веб сервис
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
   * Тест кейс по созданию запроса с пустым значением ИНН:
   * 1) Создание запроса через веб сервис
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
