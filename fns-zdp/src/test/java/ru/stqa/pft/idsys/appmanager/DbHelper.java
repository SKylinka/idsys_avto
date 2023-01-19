package ru.stqa.pft.idsys.appmanager;

import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//класс помощник для извлечения данных из бд
public class DbHelper {

  private final Properties properties;

  public DbHelper() throws IOException {

    //инициализация драйвера + файла конфигурации
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

  //метод получения данных запроса
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

}
