package ru.stqa.pft.idsys.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.idsys.appmanager.ApplicationManager;

import java.time.Duration;

import static org.testng.Assert.fail;


public class TestBase {


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

  protected void sumbitDoc() {
    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[3]")).click();
  }

  protected void fillINN(ZdpData zdpData) {
    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/table/tbody/tr[3]/td[3]/div/div[2]/div/div")).click();
    driver.findElement(By.xpath("//*[contains(@class, 'v-textfield v-widget v-textfield-focus')]")).sendKeys(zdpData.getInn());
  }

  protected void creationDoc() {
    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]")).click();
  }

  protected void gotoZDPpage() {
    driver.findElement(By.xpath("//*[@id=\"gwt-uid-12\"]")).click();
  }

  protected void gotoFNSpage() {
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

  protected void timeout5sec() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  protected void comitDelete() {
    driver.findElement(By.xpath("//span[text()='Да']/../../../div")).click();//работает только в кодировке win-1251
  }

  protected void selectDelete() {
    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[5]")).click();
  }

  protected void selectDoc() {
    driver.findElement(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div")).click();
  }
}
