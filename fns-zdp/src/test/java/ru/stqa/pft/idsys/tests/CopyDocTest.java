package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.SQLException;
import java.util.List;

public class CopyDocTest extends TestBase {

  @BeforeMethod
  //�������� �� ���������� �����
  public void ensurePreconditions() throws InterruptedException, SQLException {
    //��������������� ����� - ������� � ������ "���"
    app.goTo().fnsPage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //�������� ���� �� ������ � ��
    if (app.db().zdps().size() == 0) {
    //��������������� ����� - �������� �������
    app.zdp().create(new ZdpData().withInn("123456789111"));
    }
  }


  @Test
  public void testCopyDoc() throws Exception {
    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //���������� ���������� ��� �������
    int index = before.size() - 1;
    //���������� zdp ��� ����� ���
    ZdpData zdp = new ZdpData().withInn("123456789000");
    //��������������� ����� - ���������� �������� ������ ��������� � ������
    app.zdp().copy(index, zdp);
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    app.zdp().timeout5sec();
    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    Assert.assertEquals(after.size() , index + 2); //��������� ����������� ��� ���������(������)

    //��������� ���� �������(���������) � �������������� �� ��������������(������) � ���������������(���������)
    //before.remove(before.size() - 1);
    //before.add(zdp);
    //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    //�������� ������ �� �� � ��� ��� � ����������(������ ������� �� ������ �������, ��� ������)
    verifyZdpListInUI();

    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
  }

}


