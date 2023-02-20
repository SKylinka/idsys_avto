package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class SendDocTest extends TestBase{

  @BeforeMethod
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //����� ������� �������� ��������
    app.db().clearBd();
    //��������������� ����� - �������� ������� ������� ���
    app.goTo().fns();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //�������� ���� �� ������� � ��
    if (app.db().zdps().size() > 5) {
      //��������������� ����� - �������� ���� ��������
      app.db().deleteAllDoc();
      TimeUnit.SECONDS.sleep(2);
      //��������������� ����� - �������� ��������
      app.zdp().create(new ZdpData().withInn("123456789111"));
      app.zdp().create(new ZdpData().withInn("123456789222"));
      app.zdp().create(new ZdpData().withInn("123456789333"));
    }
  }

  @Test(enabled = false)
  public void testSendDocResultError() throws InterruptedException, SQLException, IOException, UnsupportedFlavorException {
    //��������������� ����� ����� � �� ������� ������� �� ������� "�����".
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    //�������� ���� �� ������ �� ������� "�����"
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    //��������������� ����� - ��������� ������� �� ��
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc)); //0 - ������ ������
    //��������������� ����� - ��������� ����������(�������) ������� � ����� ������������ ���� �������� �� ���
    app.zdp().selectDocRight();
    //��������������� ����� - ������� ��������
    app.zdp().sendDoc();
    TimeUnit.SECONDS.sleep(2);
    //��������������� ����� - ����� messageid �������, �� ��� ��� � ���������
    app.db().changeMessageId(idDoc);
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    // ����� ��� �� ������
    app.loginAdm();
    // ������� � ������ ���������
    app.goTo().pageAdapters();
    //��������������� ����� - ��������� �������� �� �� �� ������(� ������ ������ ��� ������� ����� �� 73)
    app.zdp().selectDoc(app.zdp().chooseDocForId(73));
    //��������������� ����� - ��������� �������
    app.zdp().pullAdapter();
    TimeUnit.SECONDS.sleep(2);
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    // ����� ��� ��
    app.loginUser();
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    //��������������� ����� - ��������� ������� �� ��
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc)); //0 - ������ ������
    //��������������� ����� - ������� ������ ������� ������
    app.zdp().selectDocDouble();
    TimeUnit.SECONDS.sleep(1);
    //������� �� ������� "�����"
    app.goTo().pageAnswer();
    //�������� ������� �������
    int status =  app.db().checkStatus(idDoc);
    if (status == 98) {
      String fromDB = app.db().returnError(idDoc);
      String fromUI = app.zdp().returnError();
      Assert.assertEquals(fromDB, fromUI);
      System.out.println("���� ���������� �������");
        } else {
      System.out.println("���-�� ����� �� ��� ���� ����� ����� �� �����");
    }
  }

  @Test
  public void testSendDocResultTrue() throws SQLException, InterruptedException {
    //��������������� ����� ����� � �� ������� ������� �� ������� "�����".
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    //�������� ���� �� ������ �� ������� "�����"
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    //��������������� ����� - ��������� ������� �� ��
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc)); //0 - ������ ������
    //��������������� ����� - ������� ������ ������� ������
    app.zdp().selectDocDouble();
    //��������������� ����� - ������� ������ "�����" ��� ��������
    app.zdp().selectNew();
    //��������������� ����� - ������� �������� ������ ���������
    app.zdp().sendDocInDoc();

  }



  @AfterTest()
  public void exit() {
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    /*
     */
  }
}
