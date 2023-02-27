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

import static ru.stqa.pft.idsys.appmanager.ZdpHelper.resultAnswer;

public class SendDocTest extends TestBase {

  /**
   * �������� �� ���������� ������:
   * 1) �������� � ������� ����� ��� ������� � ���������
   * 2) ������� � ������ ���
   * 3) ������� � ������ ���
   * 4) �������� ����������� �������� � ����������. ���� �� ������ 5, �� ������� ������ � ������� ����� 3��.
   * ����������:
   *
   * @throws InterruptedException - �������
   * @throws SQLException         - ����������� � ��
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException, SQLException {
    app.db().clearBd();
    app.goTo().fns();
    app.goTo().zdpPage();
    if (app.db().zdps().size() > 5) {
      app.db().deleteAllDoc();
      TimeUnit.SECONDS.sleep(2);
      app.zdp().create(new ZdpData().withInn("123456789111"));
      app.zdp().create(new ZdpData().withInn("123456789222"));
      app.zdp().create(new ZdpData().withInn("123456789333"));
    }
  }

  /**
   * ���� ���� �� �������� � ��������� ������:
   * 1) ����� � �� ������� ������� �� ������� "�����" � �������� ��� �������������� � ���������� idDoc
   * 2) �������� - ������ �� ����� ������. ���� �� ������, �� ������� ��� � �������� ��� � ���������� idDoc
   * 3) ���������� ������� � ���������� �� ��� ��������������
   * 4) ������� ��� �� ���� ������ ��� ��������� ������������ ����
   * 5) ������� �� ���������
   * 6) �������� messageid �������, �� ��� ��� � ���������
   * 7) ������� ������ "�����"
   * 8) ����� �� ��� �� �������������� SYSDBA
   * 9) ������� � ������ ���������
   * 10) ��������� �������� �� ��� ��������������
   * 11) ��������� �������
   * 12) ������� ������ "�����"
   * 13) ����� �� ��� ������� �� ���
   * 14) ������� � ������ ���
   * 15) ������� � ������ ���
   * 16) ���������� ������� � ���������� �� ��� ��������������
   * 17) ������� ������ �������
   * 18) ������� �� ������� "�����"
   * 19) �������� ������� �������
   * 20) ��������� ������ �� �� � ����������
   * 21) ����� �� ���������
   * ����������:
   *
   * @throws InterruptedException       - �������
   * @throws SQLException               - ����������� � ��
   * @throws IOException                - DataFlavor ��������� �� ������
   * @throws UnsupportedFlavorException - DataFlavor ��������� �� ������
   */
  @Test(enabled = true)
  public void testSendDocResultError() throws InterruptedException, SQLException, UnsupportedFlavorException, IOException {
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocRight();
    app.zdp().sendDoc();
    TimeUnit.SECONDS.sleep(2);
    app.db().changeMessageId("eff05f01-aeb3-11ed-a3b4-52540084a2ea", idDoc);
    app.goTo().exit();
    app.loginAdm();
    app.goTo().pageAdapters();
    app.zdp().selectDoc(app.zdp().chooseDocForId(73));
    app.zdp().pullAdapter();
    TimeUnit.SECONDS.sleep(2);
    app.goTo().exit();
    app.loginUser();
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    TimeUnit.SECONDS.sleep(1);
    app.goTo().pageAnswer();
    int status = app.db().checkStatus(idDoc);
    if (status == 98) {
      String fromDB = app.db().returnError(idDoc);
      String fromUI = app.zdp().returnError();
      Assert.assertEquals(fromDB, fromUI);
      System.out.println("���� ���������� �������");
    } else {
      System.out.println("���-�� ����� �� ��� ���� ����� ����� �� �����");
    }
    app.zdp().close();
    TimeUnit.SECONDS.sleep(1);
  }

  /**
   * ���� ���� �� �������� � ��������� �������������� ����������:
   * 1) ����� � �� ������� ������� �� ������� "�����" � �������� ��� �������������� � ���������� idDoc
   * 2) �������� - ������ �� ����� ������. ���� �� ������, �� ������� ��� � �������� ��� � ���������� idDoc
   * 3) ���������� ������� � ���������� �� ��� ��������������
   * 4) ������� ��� �� ���� ������ ��� ��������� ������������ ����
   * 5) ������� �� ���������
   * 6) �������� messageid �������, �� ��� ��� � ���������
   * 7) ������� ������ "�����"
   * 8) ����� �� ��� �� �������������� SYSDBA
   * 9) ������� � ������ ���������
   * 10) ��������� �������� �� ��� ��������������
   * 11) ��������� �������
   * 12) ������� ������ "�����"
   * 13) ����� �� ��� ������� �� ���
   * 14) ������� � ������ ���
   * 15) ������� � ������ ���
   * 16) ���������� ������� � ���������� �� ��� ��������������
   * 17) ������� ������ �������
   * 18) ������� �� ������� "�����"
   * 19) �������� ������� �������
   * 20) ��������� ����������� �� �� � ����������
   * 21) ������� � ������ "����������� ���������������"
   * 22) ������� ���������� ��������� ����������
   * 23) ����� �� ���������
   * ����������:
   *
   * @throws InterruptedException       - �������
   * @throws SQLException               - ����������� � ��
   * @throws IOException                - DataFlavor ��������� �� ������
   * @throws UnsupportedFlavorException - DataFlavor ��������� �� ������
   */
  @Test(enabled = true)
  public void testSendDocResultTrue() throws SQLException, InterruptedException, IOException, UnsupportedFlavorException {
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    app.zdp().selectNew();
    app.zdp().sendDocInDoc();
    TimeUnit.SECONDS.sleep(3);
    app.db().changeMessageId("0e3036e0-b10f-11ed-8005-005056b92721", idDoc);
    app.goTo().exit();
    app.loginAdm();
    app.goTo().pageAdapters();
    app.zdp().selectDoc(app.zdp().chooseDocForId(73));
    app.zdp().pullAdapter();
    TimeUnit.SECONDS.sleep(2);
    app.goTo().exit();
    app.loginUser();
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    TimeUnit.SECONDS.sleep(1);
    app.goTo().pageAnswer();
    int status = app.db().checkStatus(idDoc);
    if (status == 152) {
      String fromDB = resultAnswer.get(app.db().result(idDoc));
      String fromUI = app.zdp().result();
      Assert.assertEquals(fromDB, fromUI);
    } else {
      System.out.println("���-�� ����� �� ��� ���� ����� ����� �� �����");
    }
    app.goTo().pageActiveSuspensions();
    TimeUnit.SECONDS.sleep(1);
    int skolko = app.zdp().skolko();
    if (skolko == 24) {
      System.out.println("���� ���������� �������");
    } else {
      System.out.println("���-�� ����� �� ��� ���� ����� ����� �� ����� 2");
    }
    app.zdp().close();
    TimeUnit.SECONDS.sleep(1);
  }

  /**
   * ���� ���� �� �������� � ��������� �������������� ����������:
   * 1) ����� � �� ������� ������� �� ������� "�����" � �������� ��� �������������� � ���������� idDoc
   * 2) �������� - ������ �� ����� ������. ���� �� ������, �� ������� ��� � �������� ��� � ���������� idDoc
   * 3) ���������� ������� � ���������� �� ��� ��������������
   * 4) ������� ��� �� ���� ������ ��� ��������� ������������ ����
   * 5) ������� �� ���������
   * 6) �������� messageid �������, �� ��� ��� � ���������
   * 7) ������� ������ "�����"
   * 8) ����� �� ��� �� �������������� SYSDBA
   * 9) ������� � ������ ���������
   * 10) ��������� �������� �� ��� ��������������
   * 11) ��������� �������
   * 12) ������� ������ "�����"
   * 13) ����� �� ��� ������� �� ���
   * 14) ������� � ������ ���
   * 15) ������� � ������ ���
   * 16) ���������� ������� � ���������� �� ��� ��������������
   * 17) ������� ������ �������
   * 18) ������� �� ������� "�����"
   * 19) �������� ������� �������
   * 20) ��������� ����������� �� �� � ����������
   * 21) ������� � ������ "����������� ���������������"
   * 22) ������� ���������� ��������� ����������
   * 23) ����� �� ���������
   * ����������:
   *
   * @throws InterruptedException       - �������
   * @throws SQLException               - ����������� � ��
   * @throws IOException                - DataFlavor ��������� �� ������
   * @throws UnsupportedFlavorException - DataFlavor ��������� �� ������
   */
  @Test(enabled = true)
  public void testSendDocResultFalse() throws SQLException, InterruptedException, IOException, UnsupportedFlavorException {
    long idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    if (idDoc == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      idDoc = app.db().chooseFirstNew(Integer.parseInt("1"));
    }
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    app.zdp().selectNew();
    app.zdp().sendDocInDoc();
    TimeUnit.SECONDS.sleep(3);
    app.db().changeMessageId("c862d720-b10f-11ed-8005-005056b92721", idDoc);
    app.goTo().exit();
    app.loginAdm();
    app.goTo().pageAdapters();
    app.zdp().selectDoc(app.zdp().chooseDocForId(73));
    app.zdp().pullAdapter();
    TimeUnit.SECONDS.sleep(2);
    app.goTo().exit();
    app.loginUser();
    app.goTo().fnsPage();
    app.goTo().zdpPage();
    app.zdp().selectDoc(app.zdp().chooseDocForId(idDoc));
    app.zdp().selectDocDouble();
    TimeUnit.SECONDS.sleep(1);
    app.goTo().pageAnswer();
    int status = app.db().checkStatus(idDoc);
    if (status == 152) {
      String fromDB = resultAnswer.get(app.db().result(idDoc));
      String fromUI = app.zdp().result();
      Assert.assertEquals(fromDB, fromUI);
    } else {
      System.out.println("���-�� ����� �� ��� ���� ����� ����� �� �����");
    }
    app.goTo().pageActiveSuspensions();
    TimeUnit.SECONDS.sleep(1);
    int skolko = app.zdp().skolko();
    if (skolko == 0) {
      System.out.println("���� ���������� �������");
    } else {
      System.out.println("���-�� ����� �� ��� ���� ����� ����� �� ����� 2");
    }
    app.zdp().close();
    TimeUnit.SECONDS.sleep(1);
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
