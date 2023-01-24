package ru.stqa.pft.idsys.model;

public class LookupCustomersRqData {

  //private Long id;
  public String CustomerDataType;
  public String inn;

  public String getCustomerDataType() {
    return CustomerDataType;
  }

  public LookupCustomersRqData withCustomerDataType(String customerDataType) {
    this.CustomerDataType = customerDataType;
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