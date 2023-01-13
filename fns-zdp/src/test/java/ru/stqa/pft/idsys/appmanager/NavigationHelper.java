package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс помощник навигации по разделам
public class NavigationHelper extends HelperBase{

  //присвоение переданного значения в качестве параметра в конструкторе метода в апп
  public NavigationHelper(WebDriver wd) {
    super(wd);// обращение к конструктору базового класса
  }

  public void zdpPage() {
    click(By.xpath("//*[@id=\"gwt-uid-12\"]"));
  }

  public void fnsPage() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div[1]/div"));
  }

  public void exit() {
    click(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/div[3]/div"));
  }
}
