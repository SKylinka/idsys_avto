package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;

public class CopyDocTest extends TestBase {

  /**
   * �������� �� ���������� ������:
   * 1) ������� � ������ ���
   * 2) ������� � ������ ���
   * 3) ��������� ������� �������� � �� � ���� �� ���, �� ������� ����
   * @throws InterruptedException
   * @throws SQLException
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException, SQLException {
    app.goTo().fns();
    app.goTo().zdpPage();
    if (app.db().zdps().size() == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
  }

  /**
   * ���� ���� �� ����������� ������� � ���������� �������:
   * 1) ������������ ������ ������ �������� �� �� � ���������� before
   * 2) ���������� ���������� index ��� �������
   * 3) ������������ ������� ����� ���������� zdp
   * 4) ����������� ���������� ������� � ��������� ������
   * 5) ������ ������ - �������� ������
   * 6) ������������ ������ ������ �������� �� �� � ���������� after
   * 7) ��������� �������� ���������� before � after
   * 8) �������� ������ �� �� � ��� ��� � ����������(������ ������� �� ������ �������, ��� ������)
   * @throws Exception
   */
  @Test
  public void testCopyDoc() throws Exception {
    Zdps before = app.db().zdps();
    int index = before.size() - 1;
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().copy(index, zdp);
    app.zdp().refreshPage();
    app.zdp().timeout();
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size(), index + 2);
    verifyZdpListInUI();
  }

  /**
   * ���� ���� �� ����������� ������� ��� ��������� ������:
   * 1) ������������ ������ ������ �������� �� �� � ���������� before
   * 2) ���������� ���������� index ��� �������
   * 3) ������������ ������� ����� ���������� zdp
   * 4) ����������� ���������� ������� � ��������� ������
   * 5) ������ ������ - �������� ������
   * 6) ������������ ������ ������ �������� �� �� � ���������� after
   * 7) ��������� �������� ���������� before � after
   * 8) �������� ������ �� �� � ��� ��� � ����������(������ ������� �� ������ �������, ��� ������)
   * @throws Exception
   */
  @Test
  public void testCopyDocNoChange() throws Exception {
    Zdps before = app.db().zdps();
    int index = before.size() - 1;
    ZdpData zdp = null;
    app.zdp().copy(index, zdp);
    app.zdp().refreshPage();
    app.zdp().timeout();
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size(), index + 2);
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


