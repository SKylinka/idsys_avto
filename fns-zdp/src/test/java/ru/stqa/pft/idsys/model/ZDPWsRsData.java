package ru.stqa.pft.idsys.model;

public class ZDPWsRsData {

  //Атрибуты CustomerData
  private String cdObjectID;
  private String cdObjectStatus;
  //Атрибуты RestrictionCheckResult
  private String objectID;
  private String objectStatus;
  private String objectType;
  private String statusName;
  private String inn;
  private ZDPRsData responseData;

  public String getCdObjectID() {return cdObjectID;}
  public String getCdObjectStatus() {return cdObjectStatus;}
  public String getObjectID() {return objectID;}
  public String getObjectStatus() {return objectStatus;}
  public String getObjectType() {return objectType;}
  public String getStatusName() {return statusName;}
  public String getInn(){return inn;}
  public ZDPRsData getResponseData() {return responseData;}

  public ZDPWsRsData withCdObjectID(String cdObjectID) {
    this.cdObjectID = cdObjectID;
    return this;
  }

  public ZDPWsRsData withCdObjectStatus(String cdObjectStatus) {
    this.cdObjectStatus = cdObjectStatus;
    return this;
  }

  public ZDPWsRsData withObjectID(String objectID) {
    this.objectID = objectID;
    return this;
  }

  public ZDPWsRsData withObjectStatus(String objectStatus) {
    this.objectStatus = objectStatus;
    return this;
  }

  public ZDPWsRsData withObjectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  public ZDPWsRsData withStatusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

  public ZDPWsRsData withInn(String inn){
    this.inn = inn;
    return this;
  }
  public ZDPWsRsData withResponseData(ZDPRsData responseData) {
    this.responseData = responseData;
    return this;
  }
}
