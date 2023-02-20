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
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //Вспомогательный метод - проверка наличия раздела ЗДП
    app.goTo().fns();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();

    /*
     */

    //Вспомогательный метод - удалить все запросы
    app.db().deleteAllDoc();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    //проверка есть ли запрос в БД
    if (app.db().zdps().size() == 0) {
      //Вспомогательный метод - создание запросов
      app.zdp().create(new ZdpData().withInn("123456789111"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789222"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789333"));
    }


  }

  @Test(enabled = true)
  public void testFilterStatusZdp() throws SQLException, InterruptedException {
    //подсчет колличества запросов на статусе новый в БД в переменную before
    int before = app.db().countStatus();
    //Вспомогательный метод - нажатие на кнопку Сбросить фильтры
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    //Вспомогательный метод - выбор статуса в фильтре
    app.zdp().changeStatusFilter();
    //формирование коллекции в переменную after
    int after = app.zdp().count();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after, before);
    //Вспомогательный метод - нажатие на кнопку Сбросить фильтры
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }

  @Test(enabled = true)
  public void testFilterCreateDateZdp() throws SQLException, InterruptedException, ParseException {
    //подсчет колличества запросов за определенную дату в БД в переменную before
    int before = app.db().countCreateDate();
    //Вспомогательный метод - нажатие на кнопку Сбросить фильтры
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    //Вспомогательный метод - выбор статуса в фильтре
    app.zdp().changeCreateDateFilter();
    //формирование коллекции в переменную after
    int after = app.zdp().count();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after, before);
    //Вспомогательный метод - нажатие на кнопку Сбросить фильтры
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }


  @Test(enabled = true)
  public void testFilterInnZdp() throws SQLException, InterruptedException {
    //подсчет колличества запросов с указанным ИНН в БД в переменную before
    int before = app.db().countInn("123456789111");
    //Вспомогательный метод - нажатие на кнопку Сбросить фильтры
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
    //Вспомогательный метод - выбор статуса в фильтре
    app.zdp().changeInn("123456789111");
    //формирование коллекции в переменную after
    int after = app.zdp().count();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after, before);
    //Вспомогательный метод - нажатие на кнопку Сбросить фильтры
    app.zdp().clearFilter();
    TimeUnit.SECONDS.sleep(1);
  }

  @AfterTest()
  public void exit() {
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    /*
     */
  }
}
