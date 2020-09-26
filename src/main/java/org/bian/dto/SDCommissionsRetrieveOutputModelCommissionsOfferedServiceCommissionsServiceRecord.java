package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsRetrieveOutputModelCommissionsOfferedServiceCommissionsServiceRecordCommissionsServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCommissionsRetrieveOutputModelCommissionsOfferedServiceCommissionsServiceRecord
 */
public class SDCommissionsRetrieveOutputModelCommissionsOfferedServiceCommissionsServiceRecord   {
  private String commissionsServiceType = null;

  private String commissionsServiceVersion = null;

  private String commissionsServiceDescription = null;

  private SDCommissionsRetrieveOutputModelCommissionsOfferedServiceCommissionsServiceRecordCommissionsServicePoliciesandGuidelines commissionsServicePoliciesandGuidelines = null;

  private String commissionsServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return commissionsServiceType
  **/

  public String getCommissionsServiceType() {
    return commissionsServiceType;
  }

  public void setCommissionsServiceType(String commissionsServiceType) {
    this.commissionsServiceType = commissionsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return commissionsServiceVersion
  **/

  public String getCommissionsServiceVersion() {
    return commissionsServiceVersion;
  }

  public void setCommissionsServiceVersion(String commissionsServiceVersion) {
    this.commissionsServiceVersion = commissionsServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return commissionsServiceDescription
  **/

  public String getCommissionsServiceDescription() {
    return commissionsServiceDescription;
  }

  public void setCommissionsServiceDescription(String commissionsServiceDescription) {
    this.commissionsServiceDescription = commissionsServiceDescription;
  }


  /**
   * Get commissionsServicePoliciesandGuidelines
   * @return commissionsServicePoliciesandGuidelines
  **/

  public SDCommissionsRetrieveOutputModelCommissionsOfferedServiceCommissionsServiceRecordCommissionsServicePoliciesandGuidelines getCommissionsServicePoliciesandGuidelines() {
    return commissionsServicePoliciesandGuidelines;
  }

  public void setCommissionsServicePoliciesandGuidelines(SDCommissionsRetrieveOutputModelCommissionsOfferedServiceCommissionsServiceRecordCommissionsServicePoliciesandGuidelines commissionsServicePoliciesandGuidelines) {
    this.commissionsServicePoliciesandGuidelines = commissionsServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return commissionsServiceSchedule
  **/

  public String getCommissionsServiceSchedule() {
    return commissionsServiceSchedule;
  }

  public void setCommissionsServiceSchedule(String commissionsServiceSchedule) {
    this.commissionsServiceSchedule = commissionsServiceSchedule;
  }


}

