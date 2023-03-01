package ru.stqa.pft.idsys.tests.UI;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;
import ru.stqa.pft.idsys.tests.TestBase;

import java.sql.SQLException;

public class ModificationDocTest extends TestBase {

  /**
   * �������� �� ���������� ������:
   * 1) ������� � ������ ���
   * 2) ������� � ������ ���
   * 3) ������� ��� ��������� ������� �� ��
   * 4) �������� ������ ��������
   * 5) ��������� ������� �������� � �� � ���� �� ��� ������� ����
   * @throws InterruptedException
   * @throws SQLException
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException, SQLException {
    app.goTo().fns();
    app.goTo().zdpPage();
    app.db().deleteAllDoc();
    app.zdp().refreshPage();
    if (app.db().zdps().size() == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
  }

  /**
   * ���� ���� ����������� ������� � ���������� ���� ���
   * 1) ������������ ��������� �������� � ���������� before(���� ������ �������� �� ��)
   * 2) ���������� �������� index, ���������� �� ����� ���������� ������� 0 - ������ ������
   * 3) �������� ������ ������� � ���������� ��� � ���������� zdp
   * 4) ����������� ������� �� ��������� ����� ��������� ������
   * 5) ������� �� ������ �������� ������
   * 6) ������������ ��������� � ���������� after(���� ������ �������� �� ��)
   * 7) ��������� ������� ���������(�������) �� ���������� before � after
   * 8) �������� ������ �� �� � ��� ��� � ����������(������ ������� �� ������ �������, ��� ������)
   * @throws Exception
   */
  @Test
  public void testModificationDoc() throws Exception {
    Zdps before = app.db().zdps();
    int index = 0;
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().modify(index, zdp);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
    verifyZdpListInUI();
  }

  /**
   * ���� ���� ����������� ������� ��� ��������� ���� ���
   * 1) ������������ ��������� �������� � ���������� before(���� ������ �������� �� ��)
   * 2) ���������� �������� index, ���������� �� ����� ���������� ������� 0 - ������ ������
   * 3) ����������� ������� �� ��������� ����� ��������� ������
   * 4) ������� �� ������ �������� ������
   * 5) ������������ ��������� � ���������� after(���� ������ �������� �� ��)
   * 6) ��������� ������� ���������(�������) �� ���������� before � after
   * 7) �������� ������ �� �� � ��� ��� � ����������(������ ������� �� ������ �������, ��� ������)
   * @throws Exception
   */
  @Test
  public void testNotModificationDoc() throws Exception {
    Zdps before = app.db().zdps();
    int index = 0;
    app.zdp().modify(index, null);
    app.zdp().refreshPage();
    app.zdp().timeOut(1);
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , before.size());
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
