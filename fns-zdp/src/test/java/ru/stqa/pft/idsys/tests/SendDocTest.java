package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;

public class SendDocTest extends TestBase{

  @Test
  public void testSendDoc() {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.getNavigationHelper().gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.getNavigationHelper().gotoZDPpage();
    //Вспомогательный метод - выделение случайного(первого) запроса
    app.getZdpHelper().selectDoc(0); //0 - первый запрос
    //Вспомогательный метод - выделение случайного(первого) запроса и вызов контекстного меню отправки на пкм
    app.getZdpHelper().selectDocRight();
    //Вспомогательный метод - нажатие отправка
    app.getZdpHelper().sendDoc();
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.getNavigationHelper().exit();
    //

  }
}
