package ru.stqa.pft.idsys.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class SendDocTest extends TestBase{

  @BeforeMethod
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //проверка есть ли запросы в БД
    if (app.db().zdps().size() > 3) {
      //Вспомогательный метод - удаление всего
      app.db().deleteAll();
      TimeUnit.SECONDS.sleep(1);
      //Вспомогательный метод - создание запросов
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
    //Вспомогательный метод - проверка наличия раздела ЗДП
    app.goTo().fns();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
  }

  @Test
  public void testSendDoc() throws InterruptedException, SQLException {
    //Вспомогательный метод поиск в БД первого запроса на статусе "новый".
    long id = app.db().chooseFirstNew();
    //Проверка есть ли запрос на статусе "Новый"
    if (id == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      id = app.db().chooseFirstNew();
    }

    //Вспомогательный метод - выделение запроса по ид
    app.zdp().selectDoc(app.zdp().chooseDocForId(id)); //0 - первый запрос
    //Вспомогательный метод - выделение случайного(первого) запроса и вызов контекстного меню отправки на пкм
    app.zdp().selectDocRight();
    //Вспомогательный метод - нажатие отправка
    app.zdp().sendDoc();
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    //

  }
}
