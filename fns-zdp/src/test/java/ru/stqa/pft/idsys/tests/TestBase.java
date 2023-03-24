package ru.stqa.pft.idsys.tests;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.idsys.appmanager.ApplicationManager;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


// общий базовый класс для тестов
public class TestBase {

//делегирование на app
  protected static final ApplicationManager app
        = new ApplicationManager(Browser.CHROME);  // параметр конструктора для выбора браузера

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

  //проверка данных из БД с тем что в интерфейсе(важное услвоие ид первые столбец, инн второй)
  //метод проверки данных в интерфейсе
  public void verifyZdpListInUI() throws SQLException {
    Zdps dbZdps = app.db().zdps();
    Zdps uiZdps = app.zdp().all();
    assertThat(uiZdps, equalTo(dbZdps.stream().map((g) -> new ZdpData().withId(g.getId()).withInn(g.getInn())).collect(Collectors.toSet())));

  }

}
