package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsConfigureOutputModelCommissionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsConfigureOutputModel
 */
public class SDCommissionsConfigureOutputModel   {
  private String commissionsConfigurationActionTaskReference = null;

  private Object commissionsConfigurationActionTaskRecord = null;

  private SDCommissionsConfigureOutputModelCommissionsServiceConfigurationRecord commissionsServiceConfigurationRecord = null;

  private String commissionsServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return commissionsConfigurationActionTaskReference
  **/

  public String getCommissionsConfigurationActionTaskReference() {
    return commissionsConfigurationActionTaskReference;
  }

  public void setCommissionsConfigurationActionTaskReference(String commissionsConfigurationActionTaskReference) {
    this.commissionsConfigurationActionTaskReference = commissionsConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return commissionsConfigurationActionTaskRecord
  **/

  public Object getCommissionsConfigurationActionTaskRecord() {
    return commissionsConfigurationActionTaskRecord;
  }

  public void setCommissionsConfigurationActionTaskRecord(Object commissionsConfigurationActionTaskRecord) {
    this.commissionsConfigurationActionTaskRecord = commissionsConfigurationActionTaskRecord;
  }


  /**
   * Get commissionsServiceConfigurationRecord
   * @return commissionsServiceConfigurationRecord
  **/

  public SDCommissionsConfigureOutputModelCommissionsServiceConfigurationRecord getCommissionsServiceConfigurationRecord() {
    return commissionsServiceConfigurationRecord;
  }

  public void setCommissionsServiceConfigurationRecord(SDCommissionsConfigureOutputModelCommissionsServiceConfigurationRecord commissionsServiceConfigurationRecord) {
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

