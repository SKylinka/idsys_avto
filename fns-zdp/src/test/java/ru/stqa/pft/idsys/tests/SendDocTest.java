package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;

public class SendDocTest extends TestBase{

  @Test
  public void testSendDoc() throws InterruptedException {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.goTo().fnsPage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
    //Вспомогательный метод - выделение случайного(первого) запроса
    app.zdp().selectDoc(0); //0 - первый запрос
    //Вспомогательный метод - выделение случайного(первого) запроса и вызов контекстного меню отправки на пкм
    app.zdp().selectDocRight();
    //Вспомогательный метод - нажатие отправка
    app.zdp().sendDoc();
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    //

  }
}
