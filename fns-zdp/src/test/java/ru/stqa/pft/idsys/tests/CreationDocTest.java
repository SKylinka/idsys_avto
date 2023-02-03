package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;

import static org.hamcrest.MatcherAssert.assertThat;


public class CreationDocTest extends TestBase {

  @BeforeMethod
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //проверка есть ли запрос в БД
    if (app.db().zdps().size() > 3) {
      //Вспомогательный метод - создание запроса
      app.db().deleteAll();
    }
    //Вспомогательный метод - проверка наличия раздела ЗДП
    app.goTo().fns();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
  }

  @Test(enabled = true)
  public void testDocCreationFL() throws Exception {
    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //Вспомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().create(zdp);
    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    //сравнение колличества для цикла
    Assert.assertEquals(after.size() ,before.size() + 1);
  }

  @Test(enabled = true)
  public void testDocCreationUL() throws Exception {
    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //Вспомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData().withInn("1234567890");
    app.zdp().create(zdp);
    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after.size() ,before.size() + 1);
  }


  @Test(enabled = true)
  public void testDocCreationKIO() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.goTo().fnsPage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //Вспомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData().withInn("12345");
    app.zdp().create(zdp);
    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after.size() ,before.size() + 1);

  }

  @Test(enabled = true)
  public void testDocCreationBad() throws Exception {
    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //Вспомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData().withInn("1234567");
    app.zdp().create(zdp);
    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after.size() ,before.size());
  }

  @Test(enabled = true)
  public void testDocCreationNull() throws Exception {
    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //Вспомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData().withInn("");
    app.zdp().create(zdp);
    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after.size() ,before.size());
  }


  @AfterTest()
  public void exit() {
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    /*
     */
  }
}
