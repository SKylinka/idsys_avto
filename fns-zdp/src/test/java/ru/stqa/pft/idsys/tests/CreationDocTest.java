package ru.stqa.pft.idsys.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.getNavigationHelper().gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.getNavigationHelper().gotoZDPpage();
    //Вспомогательный метод - клик по кнопке "Создать"
    app.getZdpHelper().creationDoc();
    //Вспомогательный метод - клик по строке "ИНН" и ввод "ИНН"
    app.getZdpHelper().fillINN(new ZdpData("123456789000"));
    //Вспомогательный метод - клик по кнопке "Сохранить"
    app.getZdpHelper().sumbitDoc();
    /*
     */

  }
}
