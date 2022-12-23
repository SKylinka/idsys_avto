package ru.stqa.pft.idsys.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.idsys.appmanager.ApplicationManager;


// общий базовый класс
public class TestBase {

//делегирование на app
  protected final ApplicationManager app = new ApplicationManager();

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
