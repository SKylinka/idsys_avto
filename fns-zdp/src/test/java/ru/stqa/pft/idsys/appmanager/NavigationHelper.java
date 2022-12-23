package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс помощник навигации по разделам
public class NavigationHelper {

  //инициализация драйвера
  private WebDriver wd;

  //присвоение переданного значения в качестве параметра в конструкторе метода в апп
  public NavigationHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void gotoZDPpage() {
    wd.findElement(By.xpath("//*[@id=\"gwt-uid-12\"]")).click();
  }

  public void gotoFNSpage() {
    wd.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div[1]/div")).click();
  }
}
