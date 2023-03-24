package ru.stqa.pft.idsys.model;

public class ZDPRsDecisionData {

  private Long id;
  private String decisionNum;
  private String decisionDate;
  private String decisionTaxOrgCode;
  private String decisionBankBic;
  private String federalBDDateTime;

  public Long getId() {return id;}
  public String getDecisionNum() {return decisionNum;}
  public String getDecisionDate() {return decisionDate;}
  public String getDecisionTaxOrgCode() {return decisionTaxOrgCode;}
  public String getDecisionBankBic() {return decisionBankBic;}
  public String getFederalBDDateTime() {return federalBDDateTime;}

  public ZDPRsDecisionData setId(Long id) {
    this.id = id;
    return this;
  }

  public ZDPRsDecisionData setDecisionNum(String decisionNum) {
    this.decisionNum = decisionNum;
    return this;
  }

  public ZDPRsDecisionData setDecisionDate(String decisionDate) {
    this.decisionDate = decisionDate;
    return this;
  }

  public ZDPRsDecisionData setDecisionTaxOrgCode(String decisionTaxOrgCode) {
    this.decisionTaxOrgCode = decisionTaxOrgCode;
    return this;
  }

  public ZDPRsDecisionData setDecisionBankBic(String decisionBankBic) {
    this.decisionBankBic = decisionBankBic;
    return this;
  }

  public ZDPRsDecisionData setFederalBDDateTime(String federalBDDateTime) {
    this.federalBDDateTime = federalBDDateTime;
    return this;
  }
}
