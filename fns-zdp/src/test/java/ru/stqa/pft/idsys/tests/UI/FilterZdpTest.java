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
   * Операции до выполнения тестов:
   * 1) Переход в раздел ФНС
   * 2) Переход в раздел ЗДП
   * 3) Удалить все имеющиеся запросы из БД
   * 4) Обновить список запросов
   * 5) Проверить наличие запросов в БД и если их нет создать три штуки
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
   * Тест кейс по применению фильтра "Статус":
   * 1) Подсчет колличества запросов на статусе "1 - новый" из БД в переменную before
   * 2) Нажать кнопку - очистить фильтры
   * 3) Выбрать в фильтре статус "1 - Новый" и нажать кнопку "Применить"
   * 4) Подсчет количества запросов в интерфейсе после примения фильтра в переменную after
   * 5) Сравнение переменных before и after
   * 6) Нажать кнопку - очистить фильтры
   * @throws SQLException
   * @throws InterruptedException
   */
  @Test(enabled = true)
  public void testFilterStatusZdp() throws SQLException, InterruptedException {
    int before = app.db().countStatus(1);
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    app.zdp().changeStatusFilter("Новый");
    int after = app.zdp().count();
    Assert.assertEquals(after, before);
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }

  /**
   * Тест кейс по применению фильтра "Дата и время создания с - по":
   * 1) Подсчет колличества запросов за определенную дату(с 30.06.2019 00:00:00 по текущее время +5 минут) из БД в переменную before
   * 2) Нажать кнопку - очистить фильтры
   * 3) Выбрать в фильтре дату создания с - по и нажать кнопку "Применить"
   * 4) Подсчет количества запросов в интерфейсе после примения фильтра в переменную after
   * 5) Сравнение переменных before и after
   * 6) Нажать кнопку - очистить фильтры
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
   * Тест кейс по применению фильтра "ИНН":
   * 1) Подсчет колличества запросов с заданным ИНН из БД в переменную before
   * 2) Нажать кнопку - очистить фильтры
   * 3) Указать в фильтре ИНН и нажать кнопку "Применить"
   * 4) Подсчет количества запросов в интерфейсе после примения фильтра в переменную after
   * 5) Сравнение переменных before и after
   * 6) Нажать кнопку - очистить фильтры
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
   * Операции после выполнения тестов:
   * 1) Нажатие кнопки "Выход"
   */
  @AfterTest()
  public void exit() {
    app.goTo().exit();
  }
}
