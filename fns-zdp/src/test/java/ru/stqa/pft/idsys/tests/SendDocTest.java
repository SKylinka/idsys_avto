package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class SendDocTest extends TestBase{

  @BeforeMethod
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //Метод очистки остатков эмуляции
    app.db().clearBd();
    //Вспомогательный метод - проверка наличия раздела ЗДП
    app.goTo().fns();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
    //проверка есть ли запросы в БД
    if (app.db().zdps().size() > 5) {
      //Вспомогательный метод - удаление всех запросов
      app.db().deleteAllDoc();
      TimeUnit.SECONDS.sleep(2);
      //Вспомогательный метод - создание запросов
      app.zdp().create(new ZdpData().withInn("123456789111"));
      app.zdp().create(new ZdpData().withInn("123456789222"));
      app.zdp().create(new ZdpData().withInn("123456789333"));
    }
  }

  @Test(enabled = false)
  public void testSendDocResultError() throws InterruptedException, SQLException, IOException, UnsupportedFlavorException {
    //Вспомогательный метод поиск в БД первого запроса на статусе "новый".
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    //Проверка есть ли запрос на статусе "Новый"
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    //Вспомогательный метод - выделение запроса по ид
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc)); //0 - первый запрос
    //Вспомогательный метод - выделение случайного(первого) запроса и вызов контекстного меню отправки на пкм
    app.zdp().selectDocRight();
    //Вспомогательный метод - нажатие отправка
    app.zdp().sendDoc();
    TimeUnit.SECONDS.sleep(2);
    //Вспомогательный метод - смена messageid запроса, на тот что в эмуляторе
    app.db().changeMessageId(idDoc);
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    // логин под УЗ админа
    app.loginAdm();
    // Переход в раздел Адаптеров
    app.goTo().pageAdapters();
    //Вспомогательный метод - выделение адаптера по ид из списка(в данный момент здп адаптер имеет ид 73)
    app.zdp().selectDoc(app.zdp().chooseDocForId(73));
    //Вспомогательный метод - возбудить адаптер
    app.zdp().pullAdapter();
    TimeUnit.SECONDS.sleep(2);
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    // логин под УЗ
    app.loginUser();
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    //Вспомогательный метод - выделение запроса по ид
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc)); //0 - первый запрос
    //Вспомогательный метод - переход внутрь двойным кликом
    app.zdp().selectDocDouble();
    TimeUnit.SECONDS.sleep(1);
    //Переход на вкладку "Ответ"
    app.goTo().pageAnswer();
    //Проверка статуса запроса
    int status =  app.db().checkStatus(idDoc);
    if (status == 98) {
      String fromDB = app.db().returnError(idDoc);
      String fromUI = app.zdp().returnError();
      Assert.assertEquals(fromDB, fromUI);
      System.out.println("Тест выполнился успешно");
        } else {
      System.out.println("Что-то пошло не так тест хуйня давай по новой");
    }
  }

  @Test
  public void testSendDocResultTrue() throws SQLException, InterruptedException {
    //Вспомогательный метод поиск в БД первого запроса на статусе "новый".
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    //Проверка есть ли запрос на статусе "Новый"
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    //Вспомогательный метод - выделение запроса по ид
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc)); //0 - первый запрос
    //Вспомогательный метод - переход внутрь двойным кликом
    app.zdp().selectDocDouble();
    //Вспомогательный метод - нажатие кнопки "Новый" для отправки
    app.zdp().selectNew();
    //Вспомогательный метод - нажатие отправка внутри документа
    app.zdp().sendDocInDoc();

  }



  @AfterTest()
  public void exit() {
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    /*
     */
  }
}
