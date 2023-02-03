package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;

import static org.hamcrest.MatcherAssert.assertThat;


public class CreationDocTest extends TestBase {

  @BeforeMethod
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //�������� ���� �� ������ � ��
    if (app.db().zdps().size() > 3) {
      //��������������� ����� - �������� �������
      app.db().deleteAll();
    }
    //��������������� ����� - �������� ������� ������� ���
    app.goTo().fns();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
  }

  @Test(enabled = true)
  public void testDocCreationFL() throws Exception {
    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().create(zdp);
    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    //��������� ����������� ��� �����
    Assert.assertEquals(after.size() ,before.size() + 1);
  }

  @Test(enabled = true)
  public void testDocCreationUL() throws Exception {
    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData().withInn("1234567890");
    app.zdp().create(zdp);
    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after.size() ,before.size() + 1);
  }


  @Test(enabled = true)
  public void testDocCreationKIO() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.goTo().fnsPage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData().withInn("12345");
    app.zdp().create(zdp);
    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after.size() ,before.size() + 1);

  }

  @Test(enabled = true)
  public void testDocCreationBad() throws Exception {
    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData().withInn("1234567");
    app.zdp().create(zdp);
    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after.size() ,before.size());
  }

  @Test(enabled = true)
  public void testDocCreationNull() throws Exception {
    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData().withInn("");
    app.zdp().create(zdp);
    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after.size() ,before.size());
  }


  @AfterTest()
  public void exit() {
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    /*
     */
  }
}
