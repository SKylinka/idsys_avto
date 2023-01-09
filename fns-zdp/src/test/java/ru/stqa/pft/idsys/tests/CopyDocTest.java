package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

public class CopyDocTest extends TestBase{

  @Test
  public void testCopyDoc() throws Exception{

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
    app.getZdpHelper().selectDoc(0); //выбор первого элемента
    //Вспомогательный метод - клик по кнопке "Создать c копированием"
    app.getZdpHelper().copyDoc();
    //Вспомогательный метод - клик по кнопке "Сохранить"
    app.getZdpHelper().sumbitDoc();
    //Вспомогательный метод - клик по кнопке закрытия формы(крестик)
    app.getZdpHelper().close();

    int after = app.getZdpHelper().getDocCount(); //подсчет количества запросов после создания
    Assert.assertEquals(after, before + 1); //сравнение колличества
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.getNavigationHelper().exit();
  }
}
