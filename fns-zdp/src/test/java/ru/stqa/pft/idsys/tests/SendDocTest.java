package ru.stqa.pft.idsys.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SendDocTest extends TestBase{

  @BeforeMethod
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //�������� ���� �� ������� � ��
    if (app.db().zdps().size() > 5) {
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
  public void testSendDoc() throws InterruptedException, SQLException, IOException {
    //��������������� ����� ����� � �� ������� ������� �� ������� "�����".
    long id = app.db().chooseFirstNew(Integer.parseInt("1"));
    //�������� ���� �� ������ �� ������� "�����"
    if (id == 0) {
      app.zdp().create(new ZdpData().withInn("123456789111"));
      id = app.db().chooseFirstNew(Integer.parseInt("1"));
    }

    //��������������� ����� - ��������� ������� �� ��
    app.zdp().selectDoc(app.zdp().chooseDocForId(id)); //0 - ������ ������
    //��������������� ����� - ��������� ����������(�������) ������� � ����� ������������ ���� �������� �� ���
    app.zdp().selectDocRight();
    //��������������� ����� - ������� ��������
    app.zdp().sendDoc();
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    // ����� ��� �� ������
    /*
    final Properties properties;
    properties = new Properties();
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
    String lg = properties.getProperty("adm.Login");
    String pswd = properties.getProperty("adm.Password");
    //
     */
    app.loginAdm();
    //������� � ������ ��������� �������
    app.goTo().sysObject();
    //������� � ������ ����� �������
    app.goTo().dataExchange();
    //������� � ������ ���������
    app.goTo().adapters();




    //�������� ������� �������
    int status =  app.db().checkStatus(id);
    if (status == 820) {

    }
  }


  @AfterTest()
  public void exit() {
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    /*
     */
  }
}
