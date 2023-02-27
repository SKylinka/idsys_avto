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

import static ru.stqa.pft.idsys.appmanager.ZdpHelper.resultAnswer;

public class SendDocTest extends TestBase {

  /**
   * Операции до выполнения тестов:
   * 1) Проверка и очистка всего что связано с эмуляцией
   * 2) Переход в раздел ФНС
   * 3) Переход в раздел ЗДП
   * 4) Проверка колличества запросов в интерфейсе. Если их больше 5, то очищаем модуль и создаем новые 3шт.
   * Исключения:
   *
   * @throws InterruptedException - таймаут
   * @throws SQLException         - подключение к БД
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException, SQLException {
    app.db().clearBd();
    app.goTo().fns();
    app.goTo().zdpPage();
    if (app.db().zdps().size() > 5) {
      app.db().deleteAllDoc();
      TimeUnit.SECONDS.sleep(2);
      app.zdp().create(new ZdpData().withInn("123456789111"));
      app.zdp().create(new ZdpData().withInn("123456789222"));
      app.zdp().create(new ZdpData().withInn("123456789333"));
    }
  }

  /**
   * Тест кейс по отправке и получению ошибки:
   * 1) Поиск в БД первого запроса на статусе "Новый" и передача его идентификатора в переменную idDoc
   * 2) Проверка - найден ли такой запрос. Если не найден, то создаем его и передаем его в переменную idDoc
   * 3) Нахождение запроса в интерфейсе по его идентификатору
   * 4) Нажатие ПКМ на этот запрос для получения контекстного окна
   * 5) Нажатие на отправить
   * 6) Изменить messageid запроса, на тот что в эмуляторе
   * 7) Нажатие кнопки "Выход"
   * 8) Логин из под УЗ Администратора SYSDBA
   * 9) Переход в раздел адаптеров
   * 10) Выделение адаптера по его идентификатору
   * 11) Возбудить адаптер
   * 12) Нажатие кнопки "Выход"
   * 13) Логин из под обычной УЗ ФНС
   * 14) Переход в раздел ФНС
   * 15) Переход в раздел ЗДП
   * 16) Нахождение запроса в интерфейсе по его идентификатору
   * 17) Переход внутрь запроса
   * 18) Переход на вкладку "Ответ"
   * 19) Проверка статуса запроса
   * 20) Сравнение ошибок из БД и интерфейса
   * 21) Выход из документа
   * Исключения:
   *
   * @throws InterruptedException       - таймаут
   * @throws SQLException               - подключение к БД
   * @throws IOException                - DataFlavor получения из буфера
   * @throws UnsupportedFlavorException - DataFlavor получения из буфера
   */
  @Test(enabled = true)
  public void testSendDocResultError() throws InterruptedException, SQLException, UnsupportedFlavorException, IOException {
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocRight();
    app.zdp().sendDoc();
    TimeUnit.SECONDS.sleep(2);
    app.db().changeMessageId("eff05f01-aeb3-11ed-a3b4-52540084a2ea", idDoc);
    app.goTo().exit();
    app.loginAdm();
    app.goTo().pageAdapters();
    app.zdp().selectDoc(app.zdp().chooseDocForId(73));
    app.zdp().pullAdapter();
    TimeUnit.SECONDS.sleep(2);
    app.goTo().exit();
    app.loginUser();
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    TimeUnit.SECONDS.sleep(1);
    app.goTo().pageAnswer();
    int status = app.db().checkStatus(idDoc);
    if (status == 98) {
      String fromDB = app.db().returnError(idDoc);
      String fromUI = app.zdp().returnError();
      Assert.assertEquals(fromDB, fromUI);
      System.out.println("Тест выполнился успешно");
    } else {
      System.out.println("Что-то пошло не так тест хуйня давай по новой");
    }
    app.zdp().close();
    TimeUnit.SECONDS.sleep(1);
  }

  /**
   * Тест кейс по отправке и получению положительного результата:
   * 1) Поиск в БД первого запроса на статусе "Новый" и передача его идентификатора в переменную idDoc
   * 2) Проверка - найден ли такой запрос. Если не найден, то создаем его и передаем его в переменную idDoc
   * 3) Нахождение запроса в интерфейсе по его идентификатору
   * 4) Нажатие ПКМ на этот запрос для получения контекстного окна
   * 5) Нажатие на отправить
   * 6) Изменить messageid запроса, на тот что в эмуляторе
   * 7) Нажатие кнопки "Выход"
   * 8) Логин из под УЗ Администратора SYSDBA
   * 9) Переход в раздел адаптеров
   * 10) Выделение адаптера по его идентификатору
   * 11) Возбудить адаптер
   * 12) Нажатие кнопки "Выход"
   * 13) Логин из под обычной УЗ ФНС
   * 14) Переход в раздел ФНС
   * 15) Переход в раздел ЗДП
   * 16) Нахождение запроса в интерфейсе по его идентификатору
   * 17) Переход внутрь запроса
   * 18) Переход на вкладку "Ответ"
   * 19) Проверка статуса запроса
   * 20) Сравнение результатов из БД и интерфейса
   * 21) Переход в раздел "Действующие приостановления"
   * 22) Подсчет количества найденных документов
   * 23) Выход из документа
   * Исключения:
   *
   * @throws InterruptedException       - таймаут
   * @throws SQLException               - подключение к БД
   * @throws IOException                - DataFlavor получения из буфера
   * @throws UnsupportedFlavorException - DataFlavor получения из буфера
   */
  @Test(enabled = true)
  public void testSendDocResultTrue() throws SQLException, InterruptedException, IOException, UnsupportedFlavorException {
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    app.zdp().selectNew();
    app.zdp().sendDocInDoc();
    TimeUnit.SECONDS.sleep(3);
    app.db().changeMessageId("0e3036e0-b10f-11ed-8005-005056b92721", idDoc);
    app.goTo().exit();
    app.loginAdm();
    app.goTo().pageAdapters();
    app.zdp().selectDoc(app.zdp().chooseDocForId(73));
    app.zdp().pullAdapter();
    TimeUnit.SECONDS.sleep(2);
    app.goTo().exit();
    app.loginUser();
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    TimeUnit.SECONDS.sleep(1);
    app.goTo().pageAnswer();
    int status = app.db().checkStatus(idDoc);
    if (status == 152) {
      String fromDB = resultAnswer.get(app.db().result(idDoc));
      String fromUI = app.zdp().result();
      Assert.assertEquals(fromDB, fromUI);
    } else {
      System.out.println("Что-то пошло не так тест хуйня давай по новой");
    }
    app.goTo().pageActiveSuspensions();
    TimeUnit.SECONDS.sleep(1);
    int skolko = app.zdp().skolko();
    if (skolko == 24) {
      System.out.println("Тест выполнился успешно");
    } else {
      System.out.println("Что-то пошло не так тест хуйня давай по новой 2");
    }
    app.zdp().close();
    TimeUnit.SECONDS.sleep(1);
  }

  /**
   * Тест кейс по отправке и получению отрицательного результата:
   * 1) Поиск в БД первого запроса на статусе "Новый" и передача его идентификатора в переменную idDoc
   * 2) Проверка - найден ли такой запрос. Если не найден, то создаем его и передаем его в переменную idDoc
   * 3) Нахождение запроса в интерфейсе по его идентификатору
   * 4) Нажатие ПКМ на этот запрос для получения контекстного окна
   * 5) Нажатие на отправить
   * 6) Изменить messageid запроса, на тот что в эмуляторе
   * 7) Нажатие кнопки "Выход"
   * 8) Логин из под УЗ Администратора SYSDBA
   * 9) Переход в раздел адаптеров
   * 10) Выделение адаптера по его идентификатору
   * 11) Возбудить адаптер
   * 12) Нажатие кнопки "Выход"
   * 13) Логин из под обычной УЗ ФНС
   * 14) Переход в раздел ФНС
   * 15) Переход в раздел ЗДП
   * 16) Нахождение запроса в интерфейсе по его идентификатору
   * 17) Переход внутрь запроса
   * 18) Переход на вкладку "Ответ"
   * 19) Проверка статуса запроса
   * 20) Сравнение результатов из БД и интерфейса
   * 21) Переход в раздел "Действующие приостановления"
   * 22) Подсчет количества найденных документов
   * 23) Выход из документа
   * Исключения:
   *
   * @throws InterruptedException       - таймаут
   * @throws SQLException               - подключение к БД
   * @throws IOException                - DataFlavor получения из буфера
   * @throws UnsupportedFlavorException - DataFlavor получения из буфера
   */
  @Test(enabled = true)
  public void testSendDocResultFalse() throws SQLException, InterruptedException, IOException, UnsupportedFlavorException {
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    app.zdp().selectNew();
    app.zdp().sendDocInDoc();
    TimeUnit.SECONDS.sleep(3);
    app.db().changeMessageId("c862d720-b10f-11ed-8005-005056b92721", idDoc);
    app.goTo().exit();
    app.loginAdm();
    app.goTo().pageAdapters();
    app.zdp().selectDoc(app.zdp().chooseDocForId(73));
    app.zdp().pullAdapter();
    TimeUnit.SECONDS.sleep(2);
    app.goTo().exit();
    app.loginUser();
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    TimeUnit.SECONDS.sleep(1);
    app.goTo().pageAnswer();
    int status = app.db().checkStatus(idDoc);
    if (status == 152) {
      String fromDB = resultAnswer.get(app.db().result(idDoc));
      String fromUI = app.zdp().result();
      Assert.assertEquals(fromDB, fromUI);
    } else {
      System.out.println("Что-то пошло не так тест хуйня давай по новой");
    }
    app.goTo().pageActiveSuspensions();
    TimeUnit.SECONDS.sleep(1);
    int skolko = app.zdp().skolko();
    if (skolko == 0) {
      System.out.println("Тест выполнился успешно");
    } else {
      System.out.println("Что-то пошло не так тест хуйня давай по новой 2");
    }
    app.zdp().close();
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
