package ru.stqa.pft.idsys.model;



public class ZdpData {


  // Класс для инициализации объектов и атрибутов для полей запроса
  private Long id;
  private String inn;

  //метод который обеспечивает сравнения объектов и их атрибутов(инн и ид))
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ZdpData zdpData = (ZdpData) o;

    if (id != null ? !id.equals(zdpData.id) : zdpData.id != null) return false;
    return inn != null ? inn.equals(zdpData.inn) : zdpData.inn == null;
  }
  //предварительная проперка по хешу
  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (inn != null ? inn.hashCode() : 0);
    return result;
  }

  //метод для преобразования в строку
  @Override
  public String toString() {
    return "ZdpData{" +
            "id=" + id +
            ", inn='" + inn + '\'' +
            '}';
  }

  //конструктр для передачи полей
  public String getInn() {
    return inn;
  }

  public Long getId() {
    return id;
  }


  public ZdpData withInn(String inn) {
    this.inn = inn;
    return this;
  }
  public ZdpData withId(Long id) {
    this.id = id;
    return this;
  }

}
