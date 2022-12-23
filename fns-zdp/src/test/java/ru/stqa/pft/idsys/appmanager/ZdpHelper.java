package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.idsys.model.ZdpData;
import java.time.Duration;

//класс помощник для работы в ЗДП
public class ZdpHelper {

  //инициализация драйвера
  private WebDriver wd;

  //присвоение переданного значения в качестве параметра в конструкторе метода в апп
  public ZdpHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void sumbitDoc() {
    wd.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[3]")).click();
  }

  public void fillINN(ZdpData zdpData) {

    type(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div"), zdpData.getInn());
  }

  private void type(By locator, String inn) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]")).sendKeys(inn);
  }

  public void creationDoc() {
    wd.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]")).click();
  }

  public void timeout5sec() {
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  public void comitDelete() {
    wd.findElement(By.xpath("//span[text()='Да']/../../../div")).click();//работает только в кодировке win-1251
  }

  public void selectDelete() {
    wd.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[5]")).click();
  }

  public void selectDoc() {
    wd.findElement(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div")).click();
  }
}
