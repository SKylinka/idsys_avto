package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;

public class ModificationDocTest extends TestBase {

  @BeforeMethod
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //Вспомогательный метод - проверка наличия раздела ЗДП
    app.goTo().fns();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
    //проверка есть ли запрос в БД
    if (app.db().zdps().size() == 0) {
      //Вспомогательный метод - создание запроса
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
  }

  @Test
  public void testModificationDoc() throws Exception {
    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //обьявление переменной для выбора первого элемента(0)
    int index = 0;
    //переменная zdp для ввода инн
    ZdpData zdp = new ZdpData().withInn("123456789000");
    //Вспомогательный метод - копировать документ выбрав последний в списке
    app.zdp().modify(index, zdp);
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    app.zdp().timeout();
    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after.size() , before.size());
    //проверка данных из БД с тем что в интерфейсе(важное услвоие ид первые столбец, инн второй)
    verifyZdpListInUI();
  }


  @AfterTest()
  public void exit() {
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    /*
     */
  }
}
