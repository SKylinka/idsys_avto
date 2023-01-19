package ru.stqa.pft.idsys.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class CreationDocTest extends TestBase {

  @Test(enabled = false)
  public void testDocCreation() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.goTo().fnsPage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();

    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //Zdps before = app.zdp().all();
    //int before = app.getZdpHelper().getDocCount(); //������� ���������� �������� �� ��������


    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData().withInn("123456789000");
    app.zdp().create(zdp);

    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    //Zdps after = app.zdp().all();


    //int after = app.getZdpHelper().getDocCount(); //������� ���������� �������� ����� ��������
    //assertThat(after.size(), equalTo(before.size() +1)); //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after.size() ,before.size() + 1); //��������� ����������� ��� �����

    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    /*
     */
  }

  @Test(enabled = true)
  public void testBadDocCreation() throws Exception {
    //��������������� ����� - ������� � ������ "���"
    app.goTo().fnsPage();
    //��������������� ����� - ������� � ������ "�������� � ���������������"
    app.goTo().zdpPage();
    //������������ ��������� � ���������� before
    Zdps before = app.db().zdps();
    //��������������� ����� - �������� ������� ����� ���������� zdp
    ZdpData zdp = new ZdpData().withInn("1234567890");
    app.zdp().create(zdp);
    //������������ ��������� � ���������� after
    Zdps after = app.db().zdps();
    //��������������� ����� - ���� �� ������ "�������� ������"
    app.zdp().refreshPage();
    //assertThat(app.zdp().count(), equalTo(before.size() + 1)); //��������� ����������� ��� ���������(������)
    //assertThat(after.size(), equalTo(before.size())); //��������� ����������� ��� ���������(������)
    Assert.assertEquals(after.size() ,before.size() + 1);
    //��������������� ����� - ������� ������ "�����"
    app.goTo().exit();
    /*
     */
  }

}
