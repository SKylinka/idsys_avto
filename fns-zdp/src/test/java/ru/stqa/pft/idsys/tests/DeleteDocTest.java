package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.idsys.model.ZdpData;

public class DeleteDocTest extends TestBase {

  @Test
  public void testDeleteDoc() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.getNavigationHelper().gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.getNavigationHelper().gotoZDPpage();
    //проверка есть ли запрос в интерфейсе
    if (! app.getZdpHelper().isThereADoc()) {
      app.getZdpHelper().createDoc(new ZdpData("123456789000"));
    }
    int before = app.getZdpHelper().getDocCount(); //подсчет количества запросов до создания
    //Вспомогательный метод - выделение случайного(первого) запроса
    app.getZdpHelper().selectDoc(0); //выбор последнего элемента before - 1 - передача параметра
    //Вспомогательный метод - клик по кнопке "Удалить"
    app.getZdpHelper().selectDelete();
    //подтверждение удаления(нажатие кнопки "ДА")
    app.getZdpHelper().comitDelete();
    //таймаут для тестирования 5 сек
    //app.getZdpHelper().timeout5sec();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.getZdpHelper().refreshPage();
    int after = app.getZdpHelper().getDocCount(); //подсчет количества запросов после создания
    Assert.assertEquals(after, before - 1); //сравнение колличества

  }

}
