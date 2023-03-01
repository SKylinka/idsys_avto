package ru.stqa.pft.idsys.tests.UI;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;
import ru.stqa.pft.idsys.tests.TestBase;

import java.sql.SQLException;

public class ModificationDocTest extends TestBase {

  /**
   * Операции до выполнения тестов:
   * 1) Переход в раздел ФНС
   * 2) Переход в раздел ЗДП
   * 3) Удалить все имеющиеся запросы из БД
   * 4) Обновить список запросов
   * 5) Проверить наличие запросов в БД и если их нет создать один
   * @throws InterruptedException
   * @throws SQLException
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException, SQLException {
    app.goTo().fns();
    app.goTo().zdpPage();
    app.db().deleteAllDoc();
    app.zdp().refreshPage();
    if (app.db().zdps().size() == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
  }

  /**
   * Тест кейс модификации клиента с изменением поля ИНН
   * 1) Формирование коллекции запросов в переменную before(сбор данных запросов из БД)
   * 2) Объявление перенной index, отвечающую за номер выбранного запроса 0 - первый запрос
   * 3) Создание нового запроса и присвоение его в переменную zdp
   * 4) Модификация запроса на основании ранее указанных данных
   * 5) Нажатие на кнопку обновить список
   * 6) формирование коллекции в переменную after(сбор данных запросов из БД)
   * 7) Сравнение размера коллекции(списков) из переменных before и after
   * 8) Проверка данных из БД с тем что в интерфейсе(важное услвоие ид первый столбец, инн второй)
   * @throws Exception
   */
  @Test
  public void testModificationDoc() throws Exception {
    Zdps before = app.db().zdps();
    int index = 0;
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().modify(index, zdp);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
    verifyZdpListInUI();
  }

  /**
   * Тест кейс модификации клиента без изменения поля ИНН
   * 1) Формирование коллекции запросов в переменную before(сбор данных запросов из БД)
   * 2) Объявление перенной index, отвечающую за номер выбранного запроса 0 - первый запрос
   * 3) Модификация запроса на основании ранее указанных данных
   * 4) Нажатие на кнопку обновить список
   * 5) формирование коллекции в переменную after(сбор данных запросов из БД)
   * 6) Сравнение размера коллекции(списков) из переменных before и after
   * 7) Проверка данных из БД с тем что в интерфейсе(важное услвоие ид первый столбец, инн второй)
   * @throws Exception
   */
  @Test
  public void testNotModificationDoc() throws Exception {
    Zdps before = app.db().zdps();
    int index = 0;
    app.zdp().modify(index, null);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
    verifyZdpListInUI();
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
