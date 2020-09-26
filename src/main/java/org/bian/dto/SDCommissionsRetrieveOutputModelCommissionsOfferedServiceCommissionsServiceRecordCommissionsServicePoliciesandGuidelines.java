package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCommissionsRetrieveOutputModelCommissionsOfferedServiceCommissionsServiceRecordCommissionsServicePoliciesandGuidelines
 */
public class SDCommissionsRetrieveOutputModelCommissionsOfferedServiceCommissionsServiceRecordCommissionsServicePoliciesandGuidelines   {
  private String commissionsServiceEligibility = null;

  private String commissionsServiceIntendedUses = null;

  private String commissionsServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return commissionsServiceEligibility
  **/

  public String getCommissionsServiceEligibility() {
    return commissionsServiceEligibility;
  }

  public void setCommissionsServiceEligibility(String commissionsServiceEligibility) {
    this.commissionsServiceEligibility = commissionsServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return commissionsServiceIntendedUses
  **/

  public String getCommissionsServiceIntendedUses() {
    return commissionsServiceIntendedUses;
  }

  public void setCommissionsServiceIntendedUses(String commissionsServiceIntendedUses) {
    this.commissionsServiceIntendedUses = commissionsServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return commissionsServicePricingandTerms
  **/

  public String getCommissionsServicePricingandTerms() {
    return commissionsServicePricingandTerms;
  }

  public void setCommissionsServicePricingandTerms(String commissionsServicePricingandTerms) {
    this.commissionsServicePricingandTerms = commissionsServicePricingandTerms;
  }


}

