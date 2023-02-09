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
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //Вспомогательный метод - проверка наличия раздела ЗДП
    app.goTo().fns();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
    //Вспомогательный метод - удалить все запросы
    app.db().deleteAll();
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

  @Test
  public void testFilterStatusZdp() throws SQLException, InterruptedException {
    //подсчет колличества запросов на статусе новый в БД в переменную before
    int before = app.db().count();
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

  @Test
  public void testFilterCreateDateZdp() throws SQLException, InterruptedException {
    //подсчет колличества запросов на статусе новый в БД в переменную before
    int before = app.db().count();
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


  @Test
  public void testFilterInnZdp() throws SQLException, InterruptedException {
    //подсчет колличества запросов на статусе новый в БД в переменную before
    int before = app.db().count();
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
}
