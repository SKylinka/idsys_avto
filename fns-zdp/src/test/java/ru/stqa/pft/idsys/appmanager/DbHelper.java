package ru.stqa.pft.idsys.appmanager;

import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//����� �������� ��� ���������� ������ �� ��
public class DbHelper {

  private final Properties properties;

  public DbHelper() throws IOException {

    //������������� �������� + ����� ������������
    try {
      Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    properties = new Properties();
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
  }

  //����� ��������� ������ �������
  public Zdps zdps() throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("select d.id, fr.inn\n" +
              "from  DOCUMENT D\n" +
              "join FNS_RESTRICTION FR on FR.ID = D.ID\n" +
              "where D.DOCUMENTCLASSID = 1422 and\n" +
              "D.metaobjectname = 'FNS_RESTRICTION'");
      Zdps zdps = new Zdps();
      while (rs.next()) {
        zdps.add(new ZdpData().withId(rs.getLong("id"))
                              .withInn(rs.getString("inn")));
      }
      rs.close();
      st.close();
      return zdps;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
    return null;
  }


  public void deleteAll() throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      st.execute("EXECUTE BLOCK\n" +
              "AS\n" +
              "DECLARE VARIABLE DID D_ID;\n" +
              "BEGIN\n" +
              "  FOR select d.id\n" +
              "from FNS_RESTRICTION FR\n" +
              "join DOCUMENT D on D.ID = FR.ID\n" +
              "where D.DOCUMENTCLASSID = 1422 and\n" +
              "      D.metaobjectname = 'FNS_RESTRICTION'\n" +
              " INTO :DID\n" +
              "  DO\n" +
              "  BEGIN\n" +
              "    DELETE FROM document\n" +
              "    WHERE ID = :DID;\n" +
              "    DELETE FROM FNS_RESTRICTION\n" +
              "    WHERE ID = :DID;\n" +
              "    DELETE FROM FNS_RESTRICTN_DECISIONS\n" +
              "    WHERE FNS_RESTRICTION_ID = :DID;\n" +
              "  END\n" +
              "END");
      st.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
  }


}
