package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsActivateInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup;
import org.bian.dto.SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement;
import org.bian.dto.SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecord
 */
public class SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecord   {
  private String commissionsServiceConfigurationSettingReference = null;

  private String commissionsServiceConfigurationSettingDescription = null;

  private SDCommissionsActivateInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup commissionsServiceConfigurationSetup = null;

  private SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription commissionsServiceSubscription = null;

  private SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement commissionsServiceAgreement = null;

  private String commissionsServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return commissionsServiceConfigurationSettingReference
  **/

  public String getCommissionsServiceConfigurationSettingReference() {
    return commissionsServiceConfigurationSettingReference;
  }

  public void setCommissionsServiceConfigurationSettingReference(String commissionsServiceConfigurationSettingReference) {
    this.commissionsServiceConfigurationSettingReference = commissionsServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return commissionsServiceConfigurationSettingDescription
  **/

  public String getCommissionsServiceConfigurationSettingDescription() {
    return commissionsServiceConfigurationSettingDescription;
  }

  public void setCommissionsServiceConfigurationSettingDescription(String commissionsServiceConfigurationSettingDescription) {
    this.commissionsServiceConfigurationSettingDescription = commissionsServiceConfigurationSettingDescription;
  }


  /**
   * Get commissionsServiceConfigurationSetup
   * @return commissionsServiceConfigurationSetup
  **/

  public SDCommissionsActivateInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup getCommissionsServiceConfigurationSetup() {
    return commissionsServiceConfigurationSetup;
  }

  public void setCommissionsServiceConfigurationSetup(SDCommissionsActivateInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup commissionsServiceConfigurationSetup) {
    this.commissionsServiceConfigurationSetup = commissionsServiceConfigurationSetup;
  }


  /**
   * Get commissionsServiceSubscription
   * @return commissionsServiceSubscription
  **/

  public SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription getCommissionsServiceSubscription() {
    return commissionsServiceSubscription;
  }

  public void setCommissionsServiceSubscription(SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription commissionsServiceSubscription) {
    this.commissionsServiceSubscription = commissionsServiceSubscription;
  }


  /**
   * Get commissionsServiceAgreement
   * @return commissionsServiceAgreement
  **/

  public SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement getCommissionsServiceAgreement() {
    return commissionsServiceAgreement;
  }

  public void setCommissionsServiceAgreement(SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement commissionsServiceAgreement) {
    this.commissionsServiceAgreement = commissionsServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return commissionsServiceStatus
  **/

  public String getCommissionsServiceStatus() {
    return commissionsServiceStatus;
  }

  public void setCommissionsServiceStatus(String commissionsServiceStatus) {
    this.commissionsServiceStatus = commissionsServiceStatus;
  }


}

