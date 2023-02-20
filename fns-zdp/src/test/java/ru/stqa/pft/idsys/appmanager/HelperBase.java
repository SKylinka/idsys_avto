package ru.stqa.pft.idsys.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


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

  //����� ��� ������� ����
  protected void clear(By locator) {
    wd.findElement(locator).clear();
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

  //����� ������� ������ ctrl + a � ctrl + c � ��������� ������
  protected String getTextFromField(By locator) throws IOException, UnsupportedFlavorException {
    Clipboard clipBoard =  Toolkit.getDefaultToolkit().getSystemClipboard(); //Clipboard ����� ������������� ������
    //������������� ������� ������ ����� ���� �� ��������
    wd.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL, "A"));
    wd.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL, "C"));
    DataFlavor dataFlavor = DataFlavor.stringFlavor;//DataFlavor ����� ������� ������������� ���� �� ������
    if (clipBoard.isDataFlavorAvailable(dataFlavor)) {
      return (String) clipBoard.getData(dataFlavor);
    } else {
      return null;
    }
  }

}
