package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;

public class CopyDocTest extends TestBase{

  @Test
  public void testCopyDoc() throws Exception{

    //Вспомогательный метод - переход в раздел "ФНС"
    app.getNavigationHelper().gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.getNavigationHelper().gotoZDPpage();
    //Вспомогательный метод - выделение случайного(первого) запроса
    app.getZdpHelper().selectDoc();
    //Вспомогательный метод - клик по кнопке "Создать c копированием"
    app.getZdpHelper().copyDoc();
    //Вспомогательный метод - клик по кнопке "Сохранить"
    app.getZdpHelper().sumbitDoc();
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.getNavigationHelper().exit();


  }
}
