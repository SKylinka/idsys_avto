package com.example;

import java.time.Duration;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;


public class DeleteDocTest {
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
  }

  @Test
  public void testDeleteDoc() throws Exception {
    driver.get("http://192.168.1.211:8080/bank_client/");
    driver.findElement(By.id("LOGIN-USERNAME")).click();
    driver.findElement(By.id("LOGIN-USERNAME")).clear();
    driver.findElement(By.id("LOGIN-USERNAME")).sendKeys("AVTOTEST");
    driver.findElement(By.id("LOGIN-PASSWORD")).click();
    driver.findElement(By.id("LOGIN-PASSWORD")).clear();
    driver.findElement(By.id("LOGIN-PASSWORD")).sendKeys("123456");
    driver.findElement(By.id("BTN-OK")).click();

    driver.findElement(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div/div")).click();

    driver.findElement(By.xpath("//div[@id='gwt-uid-12']/span")).click();

    driver.findElement(By.xpath("//div[@id='bankclient-538598663']/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr/td/div")).click();

    driver.findElement(By.xpath("//*[@id=\"bankclient-538598663\"]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div/div[5]")).click();

    driver.findElement(By.xpath("//span[text()='Да']/../../../div")).click();//работает только в кодировке win-1251

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
