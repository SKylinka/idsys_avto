package ru.stqa.pft.idsys.tests;

import java.time.Duration;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCreationTest {
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
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testDocCreation() throws Exception {
    driver.get("http://192.168.1.222:8080/bank_client/");
    driver.findElement(By.id("LOGIN-USERNAME")).click();
    driver.findElement(By.id("LOGIN-USERNAME")).clear();
    driver.findElement(By.id("LOGIN-USERNAME")).sendKeys("AVTOTEST");
    driver.findElement(By.id("LOGIN-PASSWORD")).click();
    driver.findElement(By.id("LOGIN-PASSWORD")).clear();
    driver.findElement(By.id("LOGIN-PASSWORD")).sendKeys("123456");
    driver.findElement(By.id("BTN-OK")).click();
    //driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div[31]/div/div[1]/div")).click();
    //driver.findElement(By.xpath("//div[@id='gwt-uid-234']/span")).click();
    driver.findElement(By.xpath("//div[@id='BTN-FRAME-INSERT379719517']/div/div")).click();
    driver.findElement(By.id("FNS_RESTRICTION.BANK_BIK176676368")).clear();
    driver.findElement(By.id("FNS_RESTRICTION.BANK_BIK176676368")).sendKeys("123456789");
    driver.findElement(By.id("FNS_RESTRICTION.INN707599931")).click();
    driver.findElement(By.id("FNS_RESTRICTION.INN707599931")).clear();
    driver.findElement(By.id("FNS_RESTRICTION.INN707599931")).sendKeys("123456789000");
    driver.findElement(By.id("BTN-Form.Save1034939775")).click();
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
