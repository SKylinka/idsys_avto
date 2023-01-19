package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class CreationDocTest extends TestBase {

  @Test(enabled = false)
  public void testDocCreation() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.goTo().fnsPage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();

    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //Zdps before = app.zdp().all();
    //int before = app.getZdpHelper().getDocCount(); //подсчет количества запросов до создания


    //Вспомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().create(zdp);

    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    //Zdps after = app.zdp().all();


    //int after = app.getZdpHelper().getDocCount(); //подсчет количества запросов после создания
    //assertThat(after.size(), equalTo(before.size() +1)); //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after.size() ,before.size() + 1); //сравнение колличества для цикла

    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    /*
     */
  }

  @Test(enabled = true)
  public void testBadDocCreation() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.goTo().fnsPage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
    //формирование коллекции в переменную before
    Zdps before = app.db().zdps();
    //Вспомогательный метод - создание запроса через переменную zdp
    ZdpData zdp = new ZdpData().withInn("1234567890");
    app.zdp().create(zdp);
    //формирование коллекции в переменную after
    Zdps after = app.db().zdps();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    //assertThat(app.zdp().count(), equalTo(before.size() + 1)); //сравнение колличества для коллекции(списка)
    //assertThat(after.size(), equalTo(before.size())); //сравнение колличества для коллекции(списка)
    Assert.assertEquals(after.size() ,before.size() + 1);
    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
    /*
     */
  }

}
