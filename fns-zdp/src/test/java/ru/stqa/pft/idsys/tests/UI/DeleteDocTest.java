package ru.stqa.pft.idsys.tests.UI;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;
import ru.stqa.pft.idsys.tests.TestBase;

import java.util.concurrent.TimeUnit;

public class DeleteDocTest extends TestBase {

  /**
   * �������� �� ���������� ������:
   * 1) ������� � ������ ���
   * 2) ������� � ������ ���
   * 3) ��������� ������� �������� � �� � ���� �� ��� ������� ���
   * @throws InterruptedException
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException {
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    if (app.zdp().list().size() == 0) {
      app.zdp().create(new ZdpData().withInn("123456789000"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789111"));
      TimeUnit.SECONDS.sleep(1);
      app.zdp().create(new ZdpData().withInn("123456789222"));
    }
  }

  /**
   * ���� ���� �� �������� �������:
   * 1) ������������ ���������(������ ������� ��������) � ���������� before
   * 2) �������� ���������� index ��� ��������� ��������
   * 3) �������� �������(���������� �� ������)
   * 4) ������� �� ������ �������� ������
   * 5) ������������ ��������� � ���������� after
   * 6) ��������� ���������� before � after
   * 7) �������� ������ �� �� � ��� ��� � ����������(������ ������� �� ������ �������, ��� ������)
   *
   * @throws Exception
   */
  @Test
  public void testDeleteDoc() throws Exception {
    Zdps before = app.db().zdps();
    int index = before.size() - 1;
    app.zdp().delete(index);
    app.zdp().refreshPage();
    TimeUnit.SECONDS.sleep(2);
    Zdps after = app.db().zdps();
    TimeUnit.SECONDS.sleep(2);
    Assert.assertEquals(after.size(), index);
    verifyZdpListInUI();
  }

  /**
   * �������� ����� ���������� ������:
   * 1) ������� ������ "�����"
   */
  @AfterTest()
  public void exit() {
    app.goTo().exit();
  }
}
