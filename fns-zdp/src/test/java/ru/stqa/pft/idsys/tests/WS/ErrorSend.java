package ru.stqa.pft.idsys.tests.WS;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.Zdps;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.LookupCustomersErr;
import ru.stqa.pft.idsys.tests.TestBase;

import java.sql.SQLException;

public class ErrorSend  extends TestBase {

  /**
   * �������� �� ���������� ������:
   * 1) ��������� ������� �������� � �� � ���� �� ������ ����, �� ��� �������
   * 2) ������� � ������ ���
   * 3) ������� � ������ ���
   * @throws InterruptedException
   * @throws SQLException
   */
  @BeforeMethod
  public void ensurePreconditions() throws InterruptedException, SQLException {
    if (app.db().zdps().size() > 3) {
      app.db().deleteAllDoc();
    }
    app.goTo().fns();
    app.goTo().zdpPage();
  }

  /**
   * ���� ���� ��:
   */
  @Test(enabled = true)
  public void ErrorLogAndPass() {

   }

   @Test
  public void ErrorDoc() {

   }

   @Test
  public void ErrorAdapter() {

   }

   @Test
  public void ErrorNotId() {

   }
}
