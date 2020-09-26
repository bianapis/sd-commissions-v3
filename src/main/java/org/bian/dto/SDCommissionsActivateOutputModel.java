package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsActivateOutputModel
 */
public class SDCommissionsActivateOutputModel   {
  private String commissionsActivationActionTaskReference = null;

  private Object commissionsActivationActionTaskRecord = null;

  private String commissionsServicingSessionReference = null;

  private Object commissionsServicingSessionRecord = null;

  private SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecord commissionsServiceConfigurationRecord = null;

  private String commissionsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return commissionsActivationActionTaskReference
  **/

  public String getCommissionsActivationActionTaskReference() {
    return commissionsActivationActionTaskReference;
  }

  public void setCommissionsActivationActionTaskReference(String commissionsActivationActionTaskReference) {
    this.commissionsActivationActionTaskReference = commissionsActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return commissionsServicingSessionReference
  **/

  public String getCommissionsServicingSessionReference() {
    return commissionsServicingSessionReference;
  }

  public void setCommissionsServicingSessionReference(String commissionsServicingSessionReference) {
    this.commissionsServicingSessionReference = commissionsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return commissionsServicingSessionRecord
  **/

  public Object getCommissionsServicingSessionRecord() {
    return commissionsServicingSessionRecord;
  }

  public void setCommissionsServicingSessionRecord(Object commissionsServicingSessionRecord) {
    this.commissionsServicingSessionRecord = commissionsServicingSessionRecord;
  }


  /**
   * Get commissionsServiceConfigurationRecord
   * @return commissionsServiceConfigurationRecord
  **/

  public SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecord getCommissionsServiceConfigurationRecord() {
    return commissionsServiceConfigurationRecord;
  }

  public void setCommissionsServiceConfigurationRecord(SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecord commissionsServiceConfigurationRecord) {
    this.commissionsServiceConfigurationRecord = commissionsServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return commissionsServicingSessionStatus
  **/

  public String getCommissionsServicingSessionStatus() {
    return commissionsServicingSessionStatus;
  }

  public void setCommissionsServicingSessionStatus(String commissionsServicingSessionStatus) {
    this.commissionsServicingSessionStatus = commissionsServicingSessionStatus;
  }


}

