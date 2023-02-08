package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeleteDocTest extends TestBase {

  @BeforeMethod
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.goTo().fnsPage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
    //проверка есть ли запрос в интерфейсе
    if (app.zdp().list().size() == 0) {
      //Вспомогательный метод - создание запроса
      app.zdp().create(new ZdpData().withInn("123456789000"));
    }
  }

  @Test
  public void testDeleteDoc() throws Exception {
    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //переменная для
    int index = before.size() - 1;
    app.zdp().delete(index);
    //таймаут для тестирования 5 сек
    //app.getZdpHelper().timeout5sec();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    TimeUnit.SECONDS.sleep(2);
    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    TimeUnit.SECONDS.sleep(2);
    //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after.size(), index);
    verifyZdpListInUI();
  }


}
