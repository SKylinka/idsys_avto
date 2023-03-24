package ru.stqa.pft.idsys.model;

public class ZDPRsData {

  private String id;
  private String resultReceivingDateTime;
  private String taxpayerOrgName;
  private String taxpayerSurname;
  private String taxpayerName;
  private String taxpayerPatronimic;
  private String queryResult;
  private String errorCode;
  private String errorDescription;
  private ZDPRsDDs decisions;

  public String getId() {return id;}
  public String getResultReceivingDateTime() {return resultReceivingDateTime;}
  public String getTaxpayerOrgName() {return taxpayerOrgName;}
  public String getTaxpayerSurname() {return taxpayerSurname;}
  public String getTaxpayerName() {return taxpayerName;}
  public String getTaxpayerPatronimic() {return taxpayerPatronimic;}
  public String getQueryResult() {return queryResult;}
  public String getErrorCode() {return errorCode;}
  public String getErrorDescription() {return errorDescription;}
  public ZDPRsDDs getDecisions() {return decisions;}

  public ZDPRsData withId(String id) {
    this.id = id;
    return this;
  }

  public ZDPRsData withResultReceivingDateTime(String resultReceivingDateTime) {
    this.resultReceivingDateTime = resultReceivingDateTime;
    return this;
  }

  public ZDPRsData withTaxpayerOrgName(String taxpayerOrgName) {
    this.taxpayerOrgName = taxpayerOrgName;
    return this;
  }

  public ZDPRsData withTaxpayerSurname(String taxpayerSurname) {
    this.taxpayerSurname = taxpayerSurname;
    return this;
  }

  public ZDPRsData withTaxpayerName(String taxpayerName) {
    this.taxpayerName = taxpayerName;
    return this;
  }

  public ZDPRsData withTaxpayerPatronimic(String taxpayerPatronimic) {
    this.taxpayerPatronimic = taxpayerPatronimic;
    return this;
  }

  public ZDPRsData withQueryResult(String queryResult) {
    this.queryResult = queryResult;
    return this;
  }

  public ZDPRsData withErrorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public ZDPRsData withErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  public ZDPRsData withDecisions (ZDPRsDDs decisions) {
    this.decisions = decisions;
    return this;
  }

}
