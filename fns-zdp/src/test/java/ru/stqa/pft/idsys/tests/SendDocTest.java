package ru.stqa.pft.idsys.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SendDocTest extends TestBase{

  @BeforeMethod
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //проверка есть ли запросы в БД
    if (app.db().zdps().size() > 5) {
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
  public void testSendDoc() throws InterruptedException, SQLException, IOException {
    //Вспомогательный метод поиск в БД первого запроса на статусе "новый".
    long id = app.db().chooseFirstNew(Integer.parseInt("1"));
    //Проверка есть ли запрос на статусе "Новый"
    if (id == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      id = app.db().chooseFirstNew(Integer.parseInt("1"));
    }

    //Вспомогательный метод - выделение запроса по ид
    app.zdp().selectDoc(app.zdp().chooseDocForId(id)); //0 - первый запрос
    //Вспомогательный метод - выделение случайного(первого) запроса и вызов контекстного меню отправки на пкм
    app.zdp().selectDocRight();
    //Вспомогательный метод - нажатие отправка
    app.zdp().sendDoc();
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    // логин под УЗ админа
    /*
    final Properties properties;
    properties = new Properties();
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
    String lg = properties.getProperty("adm.Login");
    String pswd = properties.getProperty("adm.Password");
    //
     */
    app.loginAdm();
    //переход в раздел Системные объекты
    app.goTo().sysObject();
    //переход в раздел обмен данными
    app.goTo().dataExchange();
    //переход в раздел адаптеров
    app.goTo().adapters();




    //Проверка статуса запроса
    int status =  app.db().checkStatus(id);
    if (status == 820) {

    }
  }


  @AfterTest()
  public void exit() {
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    /*
     */
  }
}
