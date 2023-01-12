package ru.stqa.pft.idsys.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.idsys.appmanager.ApplicationManager;
import java.util.concurrent.TimeUnit;


// общий базовый класс для тестов
public class TestBase {

//делегирование на app
  protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);  // параметр конструктора для выбора браузера

  @BeforeSuite(alwaysRun = true)
  public void setUp() throws Exception {
    //инициализация драйвера и логин
    app.init();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() throws Exception {
    // завершение инициализации
    app.stop();
  }

  //метод таймаута
  public void timeout(int sec) throws InterruptedException {
    TimeUnit.SECONDS.sleep(sec);
    //TimeUnit.SECONDS.sleep(2);
  }

}
