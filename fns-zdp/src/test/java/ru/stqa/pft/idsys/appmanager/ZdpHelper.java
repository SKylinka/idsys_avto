package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.idsys.model.ZdpData;

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

  public void sumbitDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[3]"));
  }

  public void fillINN(ZdpData zdpData) {

    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"));
    type(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]"), zdpData.getInn());
  }

  public void creationDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]"));
  }

  public void timeout5sec() {

    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
  }

  public void comitDelete() {
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

  public void copyDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[3]"));
  }

  public void createDoc(ZdpData zdpData) throws InterruptedException {
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
    fillINN(new ZdpData("123456789000"));
    //Вспомогательный метод - клик по кнопке "Сохранить"
    sumbitDoc();
    //Вспомогательный метод - клик по кнопке "Закрыть".
    closeDoc();
  }

  private void closeDoc() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[5]"));
  }


  public boolean isThereADoc() {
    return isElementPresent(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div"));
  }

  public int getDocCount() {
   return wd.findElements(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr")).size();
  }

  public void close() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div[2]"));
  }

  public void refreshPage() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]"));
  }



  //Метод создания коллекции(списка) из которого получаются данные в интерфейсе
  public List<ZdpData> getZdpList() {
    List<ZdpData> zdps = new ArrayList<ZdpData>();  //создание списка и передача его в переменную zdps
    List<WebElement> elements = wd.findElements(By.xpath("//table[@class='v-table-table']/tbody/tr/td[2]"));
    /*
    пока я не нашел правильного пути для того что бы читать только инн(при наличии всех столбцов), поэтому регулирую это столбцами в интерфейсе(убираю все лишнее)
     */
    for (WebElement element : elements) {
      int id = Integer.parseInt(element.findElement(By.xpath("//table[@class='v-table-table']/tbody/tr/td[1]")).getAttribute("id")); //получение идентификатора + преобразование его в инт
      String inn = element.getText();
      ZdpData zdp = new ZdpData(id, inn);
      zdps.add(zdp);
    }
    return zdps;
  }

  public void clearINN() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"));
    clear(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]"));
  }
}
