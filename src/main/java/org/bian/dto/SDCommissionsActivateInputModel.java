package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsActivateInputModelCommissionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsActivateInputModel
 */
public class SDCommissionsActivateInputModel   {
  private Object commissionsActivationActionTaskRecord = null;

  private String commissionsCenterReference = null;

  private String commissionsServiceReference = null;

  private SDCommissionsActivateInputModelCommissionsServiceConfigurationRecord commissionsServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return commissionsActivationActionTaskRecord
  **/

  public Object getCommissionsActivationActionTaskRecord() {
    return commissionsActivationActionTaskRecord;
  }

  public void setCommissionsActivationActionTaskRecord(Object commissionsActivationActionTaskRecord) {
    this.commissionsActivationActionTaskRecord = commissionsActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return commissionsCenterReference
  **/

  public String getCommissionsCenterReference() {
    return commissionsCenterReference;
  }

  public void setCommissionsCenterReference(String commissionsCenterReference) {
    this.commissionsCenterReference = commissionsCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return commissionsServiceReference
  **/

  public String getCommissionsServiceReference() {
    return commissionsServiceReference;
  }

  public void setCommissionsServiceReference(String commissionsServiceReference) {
    this.commissionsServiceReference = commissionsServiceReference;
  }


  /**
   * Get commissionsServiceConfigurationRecord
   * @return commissionsServiceConfigurationRecord
  **/

  public SDCommissionsActivateInputModelCommissionsServiceConfigurationRecord getCommissionsServiceConfigurationRecord() {
    return commissionsServiceConfigurationRecord;
  }

  public void setCommissionsServiceConfigurationRecord(SDCommissionsActivateInputModelCommissionsServiceConfigurationRecord commissionsServiceConfigurationRecord) {
    this.commissionsServiceConfigurationRecord = commissionsServiceConfigurationRecord;
  }


}

