package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


//������� ����� ��� ���� ����������
public class HelperBase {


  //������������� ��������
  protected WebDriver wd;

    public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  //����� ��� �����(���)
  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  //����� ��� �����(�������)
  protected void clickDabl(By locator) {
    Actions action = new Actions(wd).doubleClick(wd.findElement(locator));
    action.build().perform();
  }

  //����� ��� �����(���)
  protected void clickR(By locator) {
    Actions action = new Actions(wd).contextClick(wd.findElement(locator));
    action.build().perform();
  }




  //����� ����� ������
  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {  //�������� ���������� �������� �� ���������
      String existingText = wd.findElement(locator).getAttribute("value"); // ��������� �������� ���� �����
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

  //�������� ������� ��������
  protected boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }

  }
}
