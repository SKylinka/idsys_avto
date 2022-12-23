package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс помощник сессии
public class SessionHelper {

//инициализация драйвера
  private WebDriver wd;

  public SessionHelper(WebDriver wd) {
//присвоение переданного значения в качестве параметра в конструкторе метода в апп
    this.wd = wd;
  }

  public void login(String username, String password) {
    wd.findElement(By.id("LOGIN-USERNAME")).click();
    wd.findElement(By.id("LOGIN-USERNAME")).clear();
    wd.findElement(By.id("LOGIN-USERNAME")).sendKeys(username);
    wd.findElement(By.id("LOGIN-PASSWORD")).click();
    wd.findElement(By.id("LOGIN-PASSWORD")).clear();
    wd.findElement(By.id("LOGIN-PASSWORD")).sendKeys(password);
    wd.findElement(By.id("BTN-OK")).click();
  }
}
