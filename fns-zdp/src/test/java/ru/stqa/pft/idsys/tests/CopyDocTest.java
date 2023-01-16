package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.List;

public class CopyDocTest extends TestBase {

  @BeforeMethod
  //проверка до выполнения теста
  public void ensurePreconditions() throws InterruptedException {
    //Вспомогательный метод - переход в раздел "ФНС"
    app.goTo().fnsPage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.goTo().zdpPage();
    //проверка есть ли запрос в интерфейсе
    if (app.zdp().list().size() == 0) {
      //Вспомогательный метод - создание запроса
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
  }


  @Test
  public void testCopyDoc() throws Exception {
    //формирование коллекции в переменную before
    List<ZdpData> before = app.zdp().list();
    //обьявление переменной для размера
    int index = before.size() - 1;
    //переменная zdp для ввода инн
    ZdpData zdp = new ZdpData().withInn("123456789000");
    //Вспомогательный метод - копировать документ
    app.zdp().copy(index, zdp);
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.zdp().refreshPage();
    app.zdp().timeout5sec();
    //формирование коллекции в переменную after
    List<ZdpData> after = app.zdp().list();
    Assert.assertEquals(after.size() , index + 2); //сравнение колличества для коллекции(списка)

    //сравнение двух списков(коллекции) и преобразование из упорядоченного(списка) в неупорядоченные(множества)
    //before.remove(before.size() - 1);
    //before.add(zdp);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));


    //Вспомогательный метод - нажатие кнопки "Выход"
    app.goTo().exit();
  }
}


