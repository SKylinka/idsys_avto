package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//класс помощник для работы в ЗДП
public class ZdpHelper extends HelperBase{

  //присвоение переданного значения в качестве параметра в конструкторе метода в апп
  public ZdpHelper(WebDriver wd) {
    super(wd);// образещение к конструктору базового класса
  }

  public void sumbitDoc() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[3]"));
  }

  public void fillINN(ZdpData zdpData) {

    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"));
    type(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]"), zdpData.getInn());
  }

  public void creationDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]"));
  }

  public void timeout() {

    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
  }

  public void comitDelete() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='Да']/../../../div"));
  }

  public void selectDelete() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[5]"));
  }

  //
  public void selectDoc(int index) {
    wd.findElements(By.xpath("//table[@class='v-table-table']/tbody/tr")).get(index).click();
  }

  public void selectDocRight() {
    clickR(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div"));
  }

  public void sendDoc() {
    click(By.xpath("//*[@id='bankclient-538598663-overlays']/div[2]/div/div/div/div[2]"));
  }

  public void fillBik() {
    click(By.xpath("//*[contains(@class, 'vn-reference-button v-widget')]"));
  }

  public void complite() {
    click(By.xpath("//span[text()='Выбрать']/../../../div"));
  }

  public void selectBik() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[1]"));
  }

  public void copy() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]"));
  }

  public void create(ZdpData zdpData) throws InterruptedException {
    //Вспомогательный метод - клик по кнопке "Создать"
    creationDoc();
    //таймаут
    TimeUnit.SECONDS.sleep(2);
    //Вспомогательный метод - клик по кнопке выбора "БИК"
    fillBik();
    //Вспомогательный метод - выделение случайного(первого) запроса
    selectBik();
    //Вспомогательный метод - клик по кнопке "Выбрать"
    complite();
    //Вспомогательный метод - клик по строке "ИНН" и ввод "ИНН"
    fillINN(zdpData);
    //Вспомогательный метод - клик по кнопке "Сохранить" + проверка на всплывающее окно
    sumbitDoc();
    if (isElementPresent(By.xpath("//span[text()='OK']/../../../div"))) {
      //Вспомогательный метод - клик по кнопке ОК
      pressOk();
      //Вспомогательный метод - клик по кнопке закрытия формы(крестик)
      close();
      //Вспомогательный метод - клик по кнопке Нет
      pressNo();
    } else {
      //Вспомогательный метод - клик по кнопке "Закрыть".
      closeDoc();
    }
    zdpCache = null;
  }




  public void copy(int index, ZdpData zdp) throws InterruptedException {
    //Вспомогательный метод - выделение случайного(первого) запроса
    selectDoc(index); //выбор элемента
    //Вспомогательный метод - клик по кнопке "Создать c копированием"
    copy();
    TimeUnit.SECONDS.sleep(2);
    //условие проверки что в переменную zdp пришло значение
    if (zdp != null) {
      //Вспомогательный метод - очистка поля ИНН
      clearINN();
      //Вспомогательный метод - ввод нового ИНН через переменную
      fillINN(zdp);
    }
    //Вспомогательный метод - клик по кнопке "Сохранить"
    sumbitDoc();
    //Вспомогательный метод - клик по кнопке закрытия формы(крестик)
    close();
    zdpCache = null;
  }

  public void modify(int index, ZdpData zdp) throws InterruptedException {
    //Вспомогательный метод - выделение случайного(первого) запроса
    selectDoc(index); //выбор элемента
    //Вспомогательный метод - клик по кнопке "Редактировать"
    modification();
    TimeUnit.SECONDS.sleep(1);
    //условие проверки что в переменную zdp пришло значение
    if (zdp != null) {
      //Вспомогательный метод - нажтие кнопки "Редактировать
      modifyDoc();
      //Вспомогательный метод - очистка поля ИНН
      clearINN();
      //Вспомогательный метод - ввод нового ИНН через переменную
      fillINN(zdp);
    }
    //Вспомогательный метод - клик по кнопке "Сохранить"
    sumbitDoc();
    //Вспомогательный метод - клик по кнопке закрытия формы(крестик)
    close();
    zdpCache = null;
  }

  private void modifyDoc() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='Редактировать']/../../../div"));
  }

  //Метод получения названия кнопки по идентификатору
  public String getNameButton() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    List<WebElement> elements = wd.findElements(By.xpath("//div[@class='vn-s-button v-widget']"));
    for (WebElement element : elements) {
      String buttonName = element.getAttribute("id");
      int index1 = buttonName.indexOf("BTN-FRAME-EDIT"); //поиск по элементу, если находит то показывает место в символе, иначе возвращает 0
      if (index1 == 0) {
       return buttonName;
      }
    }
    return null;
  }

  //Метод нажатия на кнопку, значение которого пришло в переменную %s
  private void modification() throws InterruptedException {
    click(By.xpath(String.format("//div[@id='%s']", getNameButton())));
  }

  public void delete(int index) throws InterruptedException {
    //Вспомогательный метод - выделение случайного(первого) запроса
    selectDoc(index); //выбор последнего элемента before - 1 - передача параметра
    //Вспомогательный метод - клик по кнопке "Удалить"
    selectDelete();
    //подтверждение удаления(нажатие кнопки "ДА")
    comitDelete();
    zdpCache = null;
  }


  public void pressOk() {
    click(By.xpath("//span[text()='OK']/../../../div"));
  }

  private void pressNo() {
    click(By.xpath("//span[text()='Нет']/../../../div"));
  }

  private void closeDoc() {
    click(By.xpath("//span[text()='Закрыть']/../../../div"));
  }


  public boolean isThereADoc() {
    return isElementPresent(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div"));
  }

  public int count() {
   return wd.findElements(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr")).size();
  }

  public void close() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div[2]"));
  }

  public void refreshPage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]"));
  }



  //Метод создания коллекции(списка) из которого получаются данные в интерфейсе
  public List<ZdpData> list() {
    List<ZdpData> zdps = new ArrayList<ZdpData>();  //создание списка и передача его в переменную zdps
    List<WebElement> elements = wd.findElements(By.xpath("//tr[@style]")); //tr[@style] //table[@class='v-table-table']/tbody/tr/td[2]/div
    /*
    пока я не нашел правильного пути для того что бы читать только инн(при наличии всех столбцов), поэтому регулирую это столбцами в интерфейсе(убираю все лишнее)
     */
    for (WebElement element : elements) { //цикл получения элементов из листа
      //String id = element.findElement(By.tagName("td")).getAttribute("id"); //получение идентификатора из элемента + преобразование его в инт
      //String id = wd.findElement(By.xpath(String.format("//table[@class='v-table-table']/tbody/tr/..//td[1]")))
      String inn = element.getText();
      zdps.add(new ZdpData().withInn(inn));
    }
    return zdps;
  }

  public void clearINN() throws InterruptedException {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"));
    TimeUnit.SECONDS.sleep(1);
    clear(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]"));
  }

  //кеш
  private Zdps zdpCache = null;

  public Zdps all() {
    if (zdpCache != null) {
      return new Zdps(zdpCache);
    }
   //Метод создания коллекции(списка) из которого получаются данные в интерфейсе через хомяка(hamcrest)
    zdpCache = new Zdps();
    List<WebElement> elements = wd.findElements(By.xpath("//table[@class='v-table-table']/tbody/tr"));
    for (WebElement element : elements) {
      Long id = Long.parseLong(element.findElement(By.xpath("td[1]")).getText());
      String inn = element.findElement(By.xpath("td[2]")).getText();
      zdpCache.add(new ZdpData().withId(id).withInn(inn));
    }
    return new Zdps(zdpCache);
  }
}
