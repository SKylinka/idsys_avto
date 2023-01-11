package ru.stqa.pft.idsys.model;

public class ZdpData {

  // Класс для инициализации объектов и атрибутов для полей запроса
  private int id;
  private final String inn;


  //конструктр для передачи полей без ид
  public ZdpData(String inn) {
    this.id = 0;
    this.inn = inn;
  }

  //конструктр для передачи полей с ид
  public ZdpData(int id, String inn) {
    this.id = id;
    this.inn = inn;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getInn() {
    return inn;
  }

  //метод который обеспечивает сравнения объектов и их атрибутов(инн и ид))

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ZdpData zdpData = (ZdpData) o;

    if (id != zdpData.id) return false;
    return inn != null ? inn.equals(zdpData.inn) : zdpData.inn == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (inn != null ? inn.hashCode() : 0);
    return result;
  }

  //метод для преобразования в строку
  @Override
  public String toString() {
    return "ZdpData{" +
            "id='" + id + '\'' +
            ", inn='" + inn + '\'' +
            '}';
  }

}
