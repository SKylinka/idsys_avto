package ru.stqa.pft.idsys.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class SendDocTest extends TestBase{

  @BeforeMethod
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //�������� ���� �� ������� � ��
    if (app.db().zdps().size() > 3) {
      //��������������� ����� - �������� �����
      app.db().deleteAll();
      TimeUnit.SECONDS.sleep(1);
      //��������������� ����� - �������� ��������
      app.zdp().create(new ZdpData().withInn("123456789111"));
    }
    //��������������� ����� - �������� ������� ������� ���
    app.goTo().fns();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
  }

  @Test
  public void testSendDoc() throws InterruptedException, SQLException {
    //��������������� ����� ����� � �� ������� ������� �� ������� "�����".
    long id = app.db().chooseFirstNew();
    //�������� ���� �� ������ �� ������� "�����"
    if (id == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      id = app.db().chooseFirstNew();
    }

    //��������������� ����� - ��������� ������� �� ��
    app.zdp().selectDoc(app.zdp().chooseDocForId(id)); //0 - ������ ������
    //��������������� ����� - ��������� ����������(�������) ������� � ����� ������������ ���� �������� �� ���
    app.zdp().selectDocRight();
    //��������������� ����� - ������� ��������
    app.zdp().sendDoc();
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    //

  }
}
