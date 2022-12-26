package ru.stqa.pft.idsys.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.idsys.appmanager.ApplicationManager;


// общий базовый класс для тестов
public class TestBase {

//делегирование на app
  protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);  // параметр конструктора для выбора браузера

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    //инициализация драйвера и логин
    app.init();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    // завершение инициализации
    app.stop();
  }

}
