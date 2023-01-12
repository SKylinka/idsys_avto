package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.util.HashSet;
import java.util.List;

public class CopyDocTest extends TestBase{

  @Test
  public void testCopyDoc() throws Exception{

    //Вспомогательный метод - переход в раздел "ФНС"
    app.getNavigationHelper().gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    app.getNavigationHelper().gotoZDPpage();
    //проверка есть ли запрос в интерфейсе
    if (! app.getZdpHelper().isThereADoc()) {
      app.getZdpHelper().createDoc(new ZdpData("123456789111"));
    }
    //формирование коллекции в переменную before
    List<ZdpData> before = app.getZdpHelper().getZdpList();
    //Вспомогательный метод - выделение случайного(первого) запроса
    app.getZdpHelper().selectDoc(before.size() - 1); //выбор элемента
    //Вспомогательный метод - клик по кнопке "Создать c копированием"
    app.getZdpHelper().copyDoc();
    //Вспомогательный метод - очистка поля ИНН
    app.getZdpHelper().clearINN();
    //переменная zdp для ввода инн
    ZdpData zdp = new ZdpData( "987654321000");
    //Вспомогательный метод - ввод нового ИНН через переменную
    app.getZdpHelper().fillINN(zdp);
    //Вспомогательный метод - клик по кнопке "Сохранить"
    app.getZdpHelper().sumbitDoc();
    //Вспомогательный метод - клик по кнопке закрытия формы(крестик)
    app.getZdpHelper().close();
    //Вспомогательный метод - клик по кнопке "Обновить список"
    app.getZdpHelper().refreshPage();
    app.getZdpHelper().timeout5sec();
    //формирование коллекции в переменную after
    List<ZdpData> after = app.getZdpHelper().getZdpList();
    Assert.assertEquals(after.size(), before.size() + 1); //сравнение колличества для коллекции(списка)

    //сравнение двух списков(коллекции) и преобразование из упорядоченного(списка) в неупорядоченные(множества)
    //before.remove(before.size() - 1);
    //before.add(zdp);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));


    //Вспомогательный метод - нажатие кнопки "Выход"
    app.getNavigationHelper().exit();
  }
}
