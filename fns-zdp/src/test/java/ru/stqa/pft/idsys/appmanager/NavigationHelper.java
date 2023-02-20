package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

//класс помощник навигации по разделам
public class NavigationHelper extends HelperBase{

  //присвоение переданного значения в качестве параметра в конструкторе метода в апп
  public NavigationHelper(WebDriver wd) {
    super(wd);// обращение к конструктору базового класса
  }

  public void zdpPage() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='Сведения о приостановлении']/../../div"));
  }

  //Вспомогательный метод - проверка наличия раздела ЗДП
  public void fns() throws InterruptedException {
    if(!wd.findElement(By.xpath("//span[text()='Сведения о приостановлении']/../../div")).isDisplayed()) {
      //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
      fnsPage();
    } else {
      //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
      zdpPage();
    }
  }


  public void fnsPage() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div[1]/div"));
  }

  public void exit() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/div[3]/div"));
  }

  //переход в раздел Системные объекты
  public void sysObject() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//div[text()='Системные объекты']"));
  }
  //переход в раздел обмен данными
  public void dataExchange() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='Обмен данными']/../../div"));
  }
  //переход в раздел адаптеров
  public void adapters() throws InterruptedException {
    TimeUnit.SECONDS.sleep(1);
    click(By.xpath("//span[text()='Адаптеры']/../../div"));
  }
  //комбинирование перехода в раздел адаптеров
  public void pageAdapters() throws InterruptedException {
    sysObject();
    dataExchange();
    adapters();
  }

  //переход на вкладку "Ответ"
  public void pageAnswer() {
    click(By.xpath("//div[text()='Ответ']"));
  }


}
