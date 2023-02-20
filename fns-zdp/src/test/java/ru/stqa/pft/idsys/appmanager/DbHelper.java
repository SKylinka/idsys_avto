package ru.stqa.pft.idsys.appmanager;

import ru.stqa.pft.idsys.model.ZdpData;
import ru.stqa.pft.idsys.model.Zdps;

import java.io.File;
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


  public void deleteAllDoc() throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      st.execute("execute block\n" +
              "as\n" +
              "declare variable DID D_ID;\n" +
              "begin\n" +
              "  for select D.ID\n" +
              "      from FNS_RESTRICTION FR\n" +
              "      join DOCUMENT D on D.ID = FR.ID\n" +
              "      where D.DOCUMENTCLASSID = 1422 and\n" +
              "            D.METAOBJECTNAME = 'FNS_RESTRICTION'\n" +
              "      into :DID\n" +
              "  do\n" +
              "  begin\n" +
              "    delete from DOCUMENT\n" +
              "    where ID = :DID;\n" +
              "    delete from FNS_RESTRICTION\n" +
              "    where ID = :DID;\n" +
              "    delete from FNS_RESTRICTN_DECISIONS\n" +
              "    where FNS_RESTRICTION_ID = :DID;\n" +
              "    delete from DX_ENV\n" +
              "    where DOCUMENT_ID = :DID;\n" +
              "  end\n" +
              "end");
      st.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
  }

  public void deleteTransitDoc() throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      st.execute("execute block\n" +
              "as\n" +
              "declare variable QID D_ID;\n" +
              "begin\n" +
              "  for select D.ID\n" +
              "      from DOCUMENT D\n" +
              "      where D.DOCUMENTCLASSID = 8004\n" +
              "      into :QID\n" +
              "  do\n" +
              "  begin\n" +
              "    delete from DX_ENV\n" +
              "    where DOCUMENT_ID = :QID;\n" +
              "    delete from DOCUMENT\n" +
              "    where ID = :QID;\n" +
              "  end\n" +
              "end");
      st.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
  }

  public void deleteDxEnv() throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      st.execute("execute block\n" +
              "as\n" +
              "declare variable QID D_ID;\n" +
              "begin\n" +
              "  for select DE.DOCUMENT_ID\n" +
              "      from DX_ENV DE\n" +
              "      where DE.SMEV_ORIGIN_ID in ('eff05f01-aeb3-11ed-a3b4-52540084a2ea',\n" +
              "      '0e3036e0-b10f-11ed-8005-005056b92721',\n" +
              "      'c862d720-b10f-11ed-8005-005056b92721')\n" +
              "      into :QID\n" +
              "  do\n" +
              "  begin\n" +
              "    delete from DX_ENV\n" +
              "    where DOCUMENT_ID = :QID;\n" +
              "    delete from DOCUMENT\n" +
              "    where ID = :QID;\n" +
              "    delete from FNS_RESTRICTION\n" +
              "    where ID = :QID;\n" +
              "    delete from FNS_RESTRICTN_DECISIONS\n" +
              "    where FNS_RESTRICTION_ID = :QID;\n" +
              "  end\n" +
              "end");
      st.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
  }

  //Метод очистки затерявшихся запросов
  public void clearBd() throws SQLException {
    deleteTransitDoc();
    deleteDxEnv();
  }

  //метод получения количества запросов
  public int countStatus() throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("select count(D.ID)\n" +
              "from DOCUMENT D\n" +
              "where D.DOCUMENTCLASSID = 1422 and\n" +
              "      D.METAOBJECTNAME = 'FNS_RESTRICTION' and\n" +
              "      D.DOCSTATUSID = 1   ");
      int count = 0;
      while (rs.next()) {
        count = rs.getInt("count");
      }
      rs.close();
      st.close();
      return count;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
    return 0;
  }

  //метод получения количества запросов с - по
  public int countCreateDate() throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("select count(D.ID)\n" +
              "from DOCUMENT D\n" +
              "where D.CREATE_DATE between '30.06.2019 00:00:00' and dateadd(+ 5 minute to current_timestamp) and\n" +
              "      D.DOCUMENTCLASSID = 1422 and\n" +
              "      D.METAOBJECTNAME = 'FNS_RESTRICTION'");
      int count = 0;
      while (rs.next()) {
        count = rs.getInt("count");
      }
      rs.close();
      st.close();
      return count;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
    return 0;
  }


  //метод получения количества запросов с указанным ИНН
  public int countInn(String inn) throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(String.format("select COUNT(D.ID)\n" +
              "from DOCUMENT D\n" +
              "join FNS_RESTRICTION FR on FR.ID = D.ID\n" +
              "where D.DOCUMENTCLASSID = 1422 and\n" +
              "      D.METAOBJECTNAME = 'FNS_RESTRICTION' and\n" +
              "      FR.INN = '%s'", inn));
      int count = 0;
      while (rs.next()) {
        count = rs.getInt("count");
      }
      rs.close();
      st.close();
      return count;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
    return 0;

  }

  public long chooseFirstNew(int status) throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(String.format("select first 1 D.ID\n" +
              "from DOCUMENT D\n" +
              "where D.DOCUMENTCLASSID = 1422 and\n" +
              "      D.METAOBJECTNAME = 'FNS_RESTRICTION' and\n" +
              "      D.DOCSTATUSID = '%s'   ",status));
      long id = 0;
      while (rs.next()) {
        id = rs.getLong("id");
      }
      rs.close();
      st.close();
      return id;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
    return 0;
  }

  public int checkStatus(long id) throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(String.format("select D.DOCSTATUSID\n" +
              "from DOCUMENT D\n" +
              "where D.DOCUMENTCLASSID = 1422 and\n" +
              "      D.METAOBJECTNAME = 'FNS_RESTRICTION' and\n" +
              "      D.ID = '%s'   ",id));
      int docstatusid = 0;
      while (rs.next()) {
        docstatusid = rs.getInt("docstatusid");
      }
      rs.close();
      st.close();
      return docstatusid;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
    return 0;
  }

  /** Метод смены messageid запросу по ид. eff05f01-aeb3-11ed-a3b4-52540084a2ea - это ответ с ошибкой
   * 0e3036e0-b10f-11ed-8005-005056b92721 - это положительный ответ
   * c862d720-b10f-11ed-8005-005056b92721 - это отрицательный ответ
   * @param id
   * @throws SQLException
   */
  public void changeMessageId(long id) throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      st.execute(String.format("update DX_ENV DE\n" +
              "set DE.SMEV_ORIGIN_ID = 'eff05f01-aeb3-11ed-a3b4-52540084a2ea'\n" +
              "where DE.DOCUMENT_ID = '%s'   ",id));
      st.close();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }

  }

  public String returnError(long idDoc) throws SQLException {
    Connection conn = null;
    try {
      conn = DriverManager.getConnection(
              properties.getProperty("db.path"),
              properties.getProperty("db.Login"),
              properties.getProperty("db.Password"));
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(String.format("select FR.ERROR_DESCRIPTION\n" +
              "from DOCUMENT D\n" +
              "join FNS_RESTRICTION FR on FR.ID = D.ID\n" +
              "where D.DOCUMENTCLASSID = 1422 and\n" +
              "      D.METAOBJECTNAME = 'FNS_RESTRICTION' and\n" +
              "      D.ID = '%s'", idDoc));
      String textError = null;
      while (rs.next()) {
        textError = rs.getString("ERROR_DESCRIPTION");
      }
      rs.close();
      st.close();
      return textError;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      conn.close();
    }
    return null;

  }
}
