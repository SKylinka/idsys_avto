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


// ����� ������� ����� ��� ������
public class TestBase {

//������������� �� app
  protected static final ApplicationManager app
        = new ApplicationManager(Browser.CHROME);  // �������� ������������ ��� ������ ��������

  @BeforeSuite(alwaysRun = true)
  public void setUp() throws Exception {
    //������������� �������� � �����
    app.init();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() throws Exception {
    // ���������� �������������
    app.stop();
  }

  //����� ��������
  public void timeout(int sec) throws InterruptedException {
    TimeUnit.SECONDS.sleep(sec);
    //TimeUnit.SECONDS.sleep(2);
  }

  //�������� ������ �� �� � ��� ��� � ����������(������ ������� �� ������ �������, ��� ������)
  //����� �������� ������ � ����������
  public void verifyZdpListInUI() throws SQLException {
    Zdps dbZdps = app.db().zdps();
    Zdps uiZdps = app.zdp().all();
    assertThat(uiZdps, equalTo(dbZdps.stream().map((g) -> new ZdpData().withId(g.getId()).withInn(g.getInn())).collect(Collectors.toSet())));

  }

}
