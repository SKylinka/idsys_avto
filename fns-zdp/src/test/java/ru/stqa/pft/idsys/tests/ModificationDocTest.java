package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;

public class ModificationDocTest extends TestBase {

  @BeforeMethod
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //��������������� ����� - �������� ������� ������� ���
    app.goTo().fns();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //�������� ���� �� ������ � ��
    if (app.db().zdps().size() == 0) {
      //��������������� ����� - �������� �������
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
  }

  @Test
  public void testModificationDoc() throws Exception {
    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //���������� ���������� ��� ������ ������� ��������(0)
    int index = 0;
    //���������� zdp ��� ����� ���
    ZdpData zdp = new ZdpData().withInn("123456789000");
    //��������������� ����� - ���������� �������� ������ ��������� � ������
    app.zdp().modify(index, zdp);
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    app.zdp().timeout();
    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after.size() , before.size());
    //�������� ������ �� �� � ��� ��� � ����������(������ ������� �� ������ �������, ��� ������)
    verifyZdpListInUI();
  }


  @AfterTest()
  public void exit() {
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    /*
     */
  }
}
