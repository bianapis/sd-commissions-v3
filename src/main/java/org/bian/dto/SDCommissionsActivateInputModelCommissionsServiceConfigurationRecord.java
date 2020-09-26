package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsActivateInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCommissionsActivateInputModelCommissionsServiceConfigurationRecord
 */
public class SDCommissionsActivateInputModelCommissionsServiceConfigurationRecord   {
  private String commissionsServiceConfigurationSettingReference = null;

  private String commissionsServiceConfigurationSettingType = null;

  private SDCommissionsActivateInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup commissionsServiceConfigurationSetup = null;


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

  public SDCommissionsActivateInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup getCommissionsServiceConfigurationSetup() {
    return commissionsServiceConfigurationSetup;
  }

  public void setCommissionsServiceConfigurationSetup(SDCommissionsActivateInputModelCommissionsServiceConfigurationRecordCommissionsServiceConfigurationSetup commissionsServiceConfigurationSetup) {
    this.commissionsServiceConfigurationSetup = commissionsServiceConfigurationSetup;
  }


}

