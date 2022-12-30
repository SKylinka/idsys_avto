package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class DeleteDocTest extends TestBase {

  @Test
  public void testDeleteDoc() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.getNavigationHelper().gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.getNavigationHelper().gotoZDPpage();
    int before = app.getZdpHelper().getDocCount(); //подсчет количества запросов до создания
    //Вспомогательный метод - выделение случайного(первого) запроса
    app.getZdpHelper().selectDoc();
    //Вспомогательный метод - клик по кнопке "Удалить"
    app.getZdpHelper().selectDelete();
    //подтверждение удаления(нажатие кнопки "ДА")
    app.getZdpHelper().comitDelete();
    //таймаут для тестирования 5 сек
    app.getZdpHelper().timeout5sec();
    int after = app.getZdpHelper().getDocCount(); //подсчет количества запросов после создания
    Assert.assertEquals(after, before - 1); //сравнение колличества

  }

}
