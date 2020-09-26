package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement
 */
public class SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement   {
  private String commissionsServiceAgreementReference = null;

  private String commissionsServiceUserReference = null;

  private String commissionsServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return commissionsServiceAgreementReference
  **/

  public String getCommissionsServiceAgreementReference() {
    return commissionsServiceAgreementReference;
  }

  public void setCommissionsServiceAgreementReference(String commissionsServiceAgreementReference) {
    this.commissionsServiceAgreementReference = commissionsServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return commissionsServiceUserReference
  **/

  public String getCommissionsServiceUserReference() {
    return commissionsServiceUserReference;
  }

  public void setCommissionsServiceUserReference(String commissionsServiceUserReference) {
    this.commissionsServiceUserReference = commissionsServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return commissionsServiceAgreementTermsandConditions
  **/

  public String getCommissionsServiceAgreementTermsandConditions() {
    return commissionsServiceAgreementTermsandConditions;
  }

  public void setCommissionsServiceAgreementTermsandConditions(String commissionsServiceAgreementTermsandConditions) {
    this.commissionsServiceAgreementTermsandConditions = commissionsServiceAgreementTermsandConditions;
  }


}

