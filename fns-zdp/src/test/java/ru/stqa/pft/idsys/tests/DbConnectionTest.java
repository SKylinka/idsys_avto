package ru.stqa.pft.idsys.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DbConnectionTest {

  private SessionFactory sessionFactory;

  @Test
  public void testDbConnection() throws Exception {
    Connection conn = null;
    try {
    //Class.forName("org.firebirdsql.jdbc.FBDriver");
    conn = DriverManager.getConnection(
            "jdbc:firebirdsql:192.168.1.211/3050:ncore-bank?lc_ctype=WIN1251",
            //"jdbc:firebirdsql:localhost/3050:c:/db/employee.fdb",
            "SYSDBA", "P@ssw0rd");
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("select fr.inn\n" +
              "from  DOCUMENT D\n" +
              "join FNS_RESTRICTION FR on FR.ID = D.ID\n" +
              "where D.DOCUMENTCLASSID = 1422 and\n" +
              "D.metaobjectname = 'FNS_RESTRICTION'");
      Zdps zdps = new Zdps();
      while (rs.next()) {
        zdps.add(new ZdpData().withInn(rs.getString("inn")));

      }
      rs.close();
      st.close();
      System.out.println(zdps);

    } finally {
      conn.close();
    }
   /*
  */
  }
}
