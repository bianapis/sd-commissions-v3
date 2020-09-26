package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement;
import org.bian.dto.SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup;
import org.bian.dto.SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCommissionsConfigureOutputModelCommissionsServiceConfigurationRecord
 */
public class SDCommissionsConfigureOutputModelCommissionsServiceConfigurationRecord   {
  private String commissionsServiceConfigurationSettingDescription = null;

  private SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup commissionsServiceConfigurationSetup = null;

  private SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription commissionsServiceSubscription = null;

  private SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement commissionsServiceAgreement = null;

  private String commissionsServiceStatus = null;


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

  public SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup getCommissionsServiceConfigurationSetup() {
    return commissionsServiceConfigurationSetup;
  }

  public void setCommissionsServiceConfigurationSetup(SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup commissionsServiceConfigurationSetup) {
    this.commissionsServiceConfigurationSetup = commissionsServiceConfigurationSetup;
  }


  /**
   * Get commissionsServiceSubscription
   * @return commissionsServiceSubscription
  **/

  public SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription getCommissionsServiceSubscription() {
    return commissionsServiceSubscription;
  }

  public void setCommissionsServiceSubscription(SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription commissionsServiceSubscription) {
    this.commissionsServiceSubscription = commissionsServiceSubscription;
  }


  /**
   * Get commissionsServiceAgreement
   * @return commissionsServiceAgreement
  **/

  public SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement getCommissionsServiceAgreement() {
    return commissionsServiceAgreement;
  }

  public void setCommissionsServiceAgreement(SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement commissionsServiceAgreement) {
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

