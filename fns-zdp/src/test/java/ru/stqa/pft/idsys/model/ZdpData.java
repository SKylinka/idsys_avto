package ru.stqa.pft.idsys.model;

public class ZdpData {

  // Класс для инициализации объектов и атрибутов для полей запроса
  private final String inn;


  //конструктр для передачи полей без ид
  public ZdpData(String inn) {
    this.inn = inn;
  }


  //метод который обеспечивает сравнения объектов и их атрибутов(инн и ид))

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ZdpData zdpData = (ZdpData) o;

    return inn != null ? inn.equals(zdpData.inn) : zdpData.inn == null;
  }

  @Override
  public int hashCode() {
    return inn != null ? inn.hashCode() : 0;
  }

  //метод для преобразования в строку

  @Override
  public String toString() {
    return "ZdpData{" +
            "inn='" + inn + '\'' +
            '}';
  }

  public String getInn() {
    return inn;
  }


}
