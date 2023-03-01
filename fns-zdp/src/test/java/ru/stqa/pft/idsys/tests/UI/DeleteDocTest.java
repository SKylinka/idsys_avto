package ru.stqa.pft.idsys.tests.UI;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;
import ru.stqa.pft.idsys.tests.TestBase;

import java.util.concurrent.TimeUnit;

public class DeleteDocTest extends TestBase {

  /**
   * Операции до выполнения тестов:
   * 1) Переход в раздел ФНС
   * 2) Переход в раздел ЗДП
   * 3) Проверить наличие запросов в БД и если их нет создать три
   * @throws InterruptedException
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    if (app.zdp().list().size() == 0) {
      app.zdp().create(new ZdpData().withInn("123456789000"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789111"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789222"));
    }
  }

  /**
   * Тест кейс по удалению запроса:
   * 1) Формирование коллекции(списка текущих запросов) в переменную before
   * 2) Создание переменной index для упращения значения
   * 3) Удаление запроса(последнего из списка)
   * 4) Нажатие на кнопку обновить список
   * 5) Формирование коллекции в переменную after
   * 6) Сравнение переменных before и after
   * 7) Проверка данных из БД с тем что в интерфейсе(важное услвоие ид первый столбец, инн второй)
   *
   * @throws Exception
   */
  @Test
  public void testDeleteDoc() throws Exception {
    Zdps before = app.db().zdps();
    int index = before.size() - 1;
    app.zdp().delete(index);
    app.zdp().refreshPage();
    TimeUnit.SECONDS.sleep(2);
    Zdps after = app.db().zdps();
    TimeUnit.SECONDS.sleep(2);
    Assert.assertEquals(after.size(), index);
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
