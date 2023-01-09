package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.List;


public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.getNavigationHelper().gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.getNavigationHelper().gotoZDPpage();
    //формирование коллекции
    List<ZdpData> before = app.getZdpHelper().getZdpList();
    //int before = app.getZdpHelper().getDocCount(); //подсчет количества запросов до создания
    //Вспомогательный метод - создание запроса
    app.getZdpHelper().createDoc(new ZdpData("123456789000"));
    List<ZdpData> after = app.getZdpHelper().getZdpList();
    //int after = app.getZdpHelper().getDocCount(); //подсчет количества запросов после создания
    Assert.assertEquals(after.size(), before.size() + 1); //сравнение колличества списка
    //Assert.assertEquals(after, before + 1); //сравнение колличества для
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.getNavigationHelper().exit();
    /*
     */
  }
}
