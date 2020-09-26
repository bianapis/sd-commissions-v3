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
 * SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecord
 */
public class SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecord   {
  private String commissionsServiceConfigurationSettingReference = null;

  private String commissionsServiceConfigurationSettingType = null;

  private SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup commissionsServiceConfigurationSetup = null;

  private SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription commissionsServiceSubscription = null;

  private SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecordCommissionsServiceAgreement commissionsServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return commissionsServiceConfigurationSettingType
  **/

  public String getCommissionsServiceConfigurationSettingType() {
    return commissionsServiceConfigurationSettingType;
  }

  public void setCommissionsServiceConfigurationSettingType(String commissionsServiceConfigurationSettingType) {
    this.commissionsServiceConfigurationSettingType = commissionsServiceConfigurationSettingType;
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


}

