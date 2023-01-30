package ru.stqa.pft.idsys.model;

public class LookupCustomersRsData {

  public String inn;
  public Long id;

  public String getInn() {
    return inn;
  }

  public LookupCustomersRsData withInn(String inn) {
    this.inn = inn;
    return this;
  }


    public Long getId() {
      return id;
    }


    public LookupCustomersRsData withId(Long inn) {
      this.id = id;
      return this;
    }
}
