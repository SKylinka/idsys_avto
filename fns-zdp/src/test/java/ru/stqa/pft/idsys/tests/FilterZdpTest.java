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
  public void testFilterZdp() throws SQLException {
    int sortCount = app.db().count();


    //формирование коллекции в переменную before
    int before = app.db().zdps().size();



    //формирование коллекции в переменную after
    int after = app.db().zdps().size();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after, before);
  }

}
