package ru.stqa.pft.idsys.model;

public class LookupCustomersRqData {

  //private Long id;
  public String customerDataType;
  public String inn;

  public LookupCustomersRqData getCustomerDataType() {
    this.customerDataType = customerDataType;
    return this;
  }

  public LookupCustomersRqData withCustomerDataType(String customerDataType) {
    this.customerDataType = customerDataType;
    return this;
  }

  public String getInn() {
    return inn;
  }

  public LookupCustomersRqData withInn(String inn) {
    this.inn = inn;
    return this;
  }

}