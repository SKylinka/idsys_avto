package ru.stqa.pft.idsys.model;

public class ZdpData {


  // Класс для инициализации объектов и атрибутов для полей запроса
  private String inn;






  //метод который обеспечивает сравнения объектов и их атрибутов(инн и ид))

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ZdpData zdpData = (ZdpData) o;

    return inn != null ? inn.equals(zdpData.inn) : zdpData.inn == null;
  }


  //предварительная проперка по хешу
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


  //конструктр для передачи полей

  public ZdpData withInn(String inn) {
    this.inn = inn;
    return this;
  }

}
