package ru.stqa.pft.idsys.tests;

import java.time.Duration;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreationDocTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    js = (JavascriptExecutor) driver;

    //Логин в интерфейс
    driver.get("http://192.168.1.222:8080/bank_client/");
    login("AVTOTEST", "123456");
  }

  private void login(String username, String password) {
    driver.findElement(By.id("LOGIN-USERNAME")).click();
    driver.findElement(By.id("LOGIN-USERNAME")).clear();
    driver.findElement(By.id("LOGIN-USERNAME")).sendKeys(username);
    driver.findElement(By.id("LOGIN-PASSWORD")).click();
    driver.findElement(By.id("LOGIN-PASSWORD")).clear();
    driver.findElement(By.id("LOGIN-PASSWORD")).sendKeys(password);
    driver.findElement(By.id("BTN-OK")).click();
  }

  @Test
  public void testDocCreation() throws Exception {
    //Вспомогательный метод - переход в раздел "ФНС"
    gotoFNSpage();
    //Вспомогательный метод - переход в раздел "Сведения о приостановлении"
    gotoZDPpage();
    //Вспомогательный метод - клик по кнопке "Создать"
    creationDoc();
    //Вспомогательный метод - клик по строке "ИНН" и ввод "ИНН"
    fillINN(new ZdpData("123456789000"));
    //Вспомогательный метод - клик по кнопке "Сохранить"
    sumbitDoc();
     /*
     */

  }

  private void sumbitDoc() {
    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[3]")).click();
  }

  private void fillINN(ZdpData zdpData) {
    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div")).click();
    driver.findElement(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]")).sendKeys(zdpData.getInn());
  }

  private void creationDoc() {
    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]")).click();
  }

  private void gotoZDPpage() {
    driver.findElement(By.xpath("//*[@id=\"gwt-uid-12\"]")).click();
  }

  private void gotoFNSpage() {
    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/div[1]/div")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
