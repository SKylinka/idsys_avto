package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс помощник сессии
public class SessionHelper extends HelperBase {


  public SessionHelper(WebDriver wd) {
//присвоение переданного значения в качестве параметра в конструкторе метода в апп
    super(wd);// обращение к конструктору базового класса
  }

  public void login(String username, String password) {
    type(By.id("LOGIN-USERNAME"), username);
    type(By.id("LOGIN-PASSWORD"),password);
    click(By.id("BTN-OK"));
  }
}
