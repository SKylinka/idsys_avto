package ru.stqa.pft.idsys.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.idsys.appmanager.ApplicationManager;
import java.util.concurrent.TimeUnit;


// ����� ������� ����� ��� ������
public class TestBase {

//������������� �� app
  protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);  // �������� ������������ ��� ������ ��������

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

}
