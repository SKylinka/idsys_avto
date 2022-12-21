package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;

public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    gotoZDPpage();
    //Вспомогательный метод - клик по кнопке "Создать"
    creationDoc();
    //Вспомогательный метод - клик по строке "ИНН" и ввод "ИНН"
    fillINN(new ZdpData("123456789000"));
    //Вспомогательный метод - клик по кнопке "Сохранить"
    sumbitDoc();
    /*
     */

  }
}
