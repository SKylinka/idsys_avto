package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.List;

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
    //формирование коллекции в переменную before
    List<ZdpData> before = app.getZdpHelper().getZdpList();
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
    app.getZdpHelper().timeout5sec();
    //формирование коллекции в переменную after
    List<ZdpData> after = app.getZdpHelper().getZdpList();
    Assert.assertEquals(after.size(), before.size() - 1); //сравнение колличества для коллекции(списка)

    //удаление элемента из списка
    before.remove(before.size() - 1);
    app.getZdpHelper().timeout5sec();
    //цикл проверки
    Assert.assertEquals(before,after);

  }
}
