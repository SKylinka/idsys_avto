package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;

public class CopyDocTest extends TestBase {

  /**
   * Операции до выполнения тестов:
   * 1) Переход в раздел ФНС
   * 2) Переход в раздел ЗДП
   * 3) Проверить наличие запросов в БД и если их нет, то создать один
   * @throws InterruptedException
   * @throws SQLException
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException, SQLException {
    app.goTo().fns();
    app.goTo().zdpPage();
    if (app.db().zdps().size() == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
  }

  /**
   * Тест кейс по копированию запроса с изменением данными:
   * 1) Формирование списка данных запросов из БД в переменную before
   * 2) Обьявление переменной index для размера
   * 3) Формирование запроса через переменную zdp
   * 4) Копирование последнего запроса с указанием данных
   * 5) Нажать кнопку - обновить список
   * 6) Формирование списка данных запросов из БД в переменную after
   * 7) Сравнение размеров переменных before и after
   * 8) Проверка данных из БД с тем что в интерфейсе(важное услвоие ид первые столбец, инн второй)
   * @throws Exception
   */
  @Test
  public void testCopyDoc() throws Exception {
    Zdps before = app.db().zdps();
    int index = before.size() - 1;
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().copy(index, zdp);
    app.zdp().refreshPage();
    app.zdp().timeout();
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size(), index + 2);
    verifyZdpListInUI();
  }

  /**
   * Тест кейс по копированию запроса без изменений данных:
   * 1) Формирование списка данных запросов из БД в переменную before
   * 2) Обьявление переменной index для размера
   * 3) Формирование запроса через переменную zdp
   * 4) Копирование последнего запроса с указанием данных
   * 5) Нажать кнопку - обновить список
   * 6) Формирование списка данных запросов из БД в переменную after
   * 7) Сравнение размеров переменных before и after
   * 8) Проверка данных из БД с тем что в интерфейсе(важное услвоие ид первые столбец, инн второй)
   * @throws Exception
   */
  @Test
  public void testCopyDocNoChange() throws Exception {
    Zdps before = app.db().zdps();
    int index = before.size() - 1;
    ZdpData zdp = null;
    app.zdp().copy(index, zdp);
    app.zdp().refreshPage();
    app.zdp().timeout();
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size(), index + 2);
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


