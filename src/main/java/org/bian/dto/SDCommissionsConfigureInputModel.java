package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsConfigureInputModel
 */
public class SDCommissionsConfigureInputModel   {
  private Object commissionsConfigurationActionTaskRecord = null;

  private String commissionsServicingSessionReference = null;

  private String commissionsServiceReference = null;

  private SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecord commissionsServiceConfigurationRecord = null;


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

  public SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecord getCommissionsServiceConfigurationRecord() {
    return commissionsServiceConfigurationRecord;
  }

  public void setCommissionsServiceConfigurationRecord(SDCommissionsConfigureInputModelCommissionsServiceConfigurationRecord commissionsServiceConfigurationRecord) {
    this.commissionsServiceConfigurationRecord = commissionsServiceConfigurationRecord;
  }


}

