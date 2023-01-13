package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.List;


public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //¬спомогательный метод - переход в раздел "‘Ќ—"
    app.goTo().fnsPage();
    //¬спомогательный метод - переход в раздел "—ведени€ о приостановлении"
    app.goTo().zdpPage();
    //формирование коллекции в переменную before
    List<ZdpData> before = app.zdp().list();
    //int before = app.getZdpHelper().getDocCount(); //подсчет количества запросов до создани€
    //¬спомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData("123456789000");
    app.zdp().create(zdp);
    //формирование коллекции в переменную after
    List<ZdpData> after = app.zdp().list();
    //int after = app.getZdpHelper().getDocCount(); //подсчет количества запросов после создани€
    Assert.assertEquals(after.size(), before.size() + 1); //сравнение колличества дл€ коллекции(списка)
    //Assert.assertEquals(after, before + 1); //сравнение колличества дл€ цикла

    //before.add(zdp);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    //¬спомогательный метод - нажатие кнопки "¬ыход"
    app.goTo().exit();
    /*
     */
  }
}
