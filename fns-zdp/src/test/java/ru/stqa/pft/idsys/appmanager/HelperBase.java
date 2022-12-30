package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


//базовый класс для всех помощников
public class HelperBase {


  //инициализация драйвера
  protected WebDriver wd;

    public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  //метод для клика(ЛКМ)
  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  //метод для клика(ДаблЛКМ)
  protected void clickDabl(By locator) {
    Actions action = new Actions(wd).doubleClick(wd.findElement(locator));
    action.build().perform();
  }

  //метод для клика(ПКМ)
  protected void clickR(By locator) {
    Actions action = new Actions(wd).contextClick(wd.findElement(locator));
    action.build().perform();
  }




  //метод ввода данных
  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {  //проверка заполнения значение по умолчанию
      String existingText = wd.findElement(locator).getAttribute("value"); // получение значения поля ввода
      if (! text.equals(existingText)) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
      }
    }
  }

  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  //проверка наличия элемента
  protected boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }

  }
}
