package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.HashSet;
import java.util.List;


public class CreationDocTest extends TestBase{
  @Test
  public void testDocCreation() throws Exception {
    //¬спомогательный метод - переход в раздел "‘Ќ—"
    app.getNavigationHelper().gotoFNSpage();
    //¬спомогательный метод - переход в раздел "—ведени€ о приостановлении"
    app.getNavigationHelper().gotoZDPpage();
    //формирование коллекции в переменную before
    List<ZdpData> before = app.getZdpHelper().getZdpList();
    //int before = app.getZdpHelper().getDocCount(); //подсчет количества запросов до создани€
    //¬спомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData("123456789000");
    app.getZdpHelper().createDoc(zdp);
    //формирование коллекции в переменную after
    List<ZdpData> after = app.getZdpHelper().getZdpList();
    //int after = app.getZdpHelper().getDocCount(); //подсчет количества запросов после создани€
    Assert.assertEquals(after.size(), before.size() + 1); //сравнение колличества дл€ коллекции(списка)
    //Assert.assertEquals(after, before + 1); //сравнение колличества дл€ цикла


    int max = 0;
    for (ZdpData z : after) {
    if (z.getId() > max){
      max = z.getId();
    }
    }
    zdp.setId(max);
    before.add(zdp);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    //¬спомогательный метод - нажатие кнопки "¬ыход"
    app.getNavigationHelper().exit();
    /*
     */
  }
}
