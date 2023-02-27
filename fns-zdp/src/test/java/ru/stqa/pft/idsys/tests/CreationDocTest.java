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
   * 1) Формирование списка данных запросов из БД в переменную before
   * 2) Формирование запроса через переменную zdp
   * 3) Создание запроса через переменную zdp
   * 4) Формирование списка данных запросов из БД в переменную after
   * 5) Нажать кнопку - обновить список
   * 6) Сравнение размеров переменных before и after
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
   * Тест кейс по созданию запроса ЮЛ:
   * 1) Формирование списка данных запросов из БД в переменную before
   * 2) Формирование запроса через переменную zdp
   * 3) Создание запроса через переменную zdp
   * 4) Формирование списка данных запросов из БД в переменную after
   * 5) Нажать кнопку - обновить список
   * 6) Сравнение размеров переменных before и after
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
   * Тест кейс по созданию запроса КИО:
   * 1) Формирование списка данных запросов из БД в переменную before
   * 2) Формирование запроса через переменную zdp
   * 3) Создание запроса через переменную zdp
   * 4) Формирование списка данных запросов из БД в переменную after
   * 5) Нажать кнопку - обновить список
   * 6) Сравнение размеров переменных before и after
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
   * Тест кейс по созданию запроса с не правильными данными:
   * 1) Формирование списка данных запросов из БД в переменную before
   * 2) Формирование запроса через переменную zdp
   * 3) Создание запроса через переменную zdp
   * 4) Формирование списка данных запросов из БД в переменную after
   * 5) Нажать кнопку - обновить список
   * 6) Сравнение размеров переменных before и after
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
   * Тест кейс по созданию запроса с пустыми данными:
   * 1) Формирование списка данных запросов из БД в переменную before
   * 2) Формирование запроса через переменную zdp
   * 3) Создание запроса через переменную zdp
   * 4) Формирование списка данных запросов из БД в переменную after
   * 5) Нажать кнопку - обновить список
   * 6) Сравнение размеров переменных before и after
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
   * Операции после выполнения тестов:
   * 1) Нажатие кнопки "Выход"
   */
  @AfterTest()
  public void exit() {
    app.goTo().exit();
  }
}
