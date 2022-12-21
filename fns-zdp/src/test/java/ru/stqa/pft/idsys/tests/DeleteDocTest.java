package ru.stqa.pft.idsys.tests;

import org.testng.annotations.*;

public class DeleteDocTest extends TestBase {

  @Test
  public void testDeleteDoc() throws Exception {

    //Вспомогательный метод - переход в раздел "ФНС"
    gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    gotoZDPpage();
    //Вспомогательный метод - выделение случайного(первого) запроса
    selectDoc();
    //Вспомогательный метод - клик по кнопке "Удалить"
    selectDelete();
    //подтверждение удаления(нажатие кнопки "ДА")
    comitDelete();
    //таймаут для тестирования 5 сек
    timeout5sec();
  }

}
