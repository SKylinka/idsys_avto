package ru.stqa.pft.idsys.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.idsys.appmanager.ApplicationManager;


// ����� ������� ����� ��� ������
public class TestBase {

//������������� �� app
  protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);  // �������� ������������ ��� ������ ��������

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    //������������� �������� � �����
    app.init();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    // ���������� �������������
    app.stop();
  }

}
