package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription
 */
public class SDCommissionsActivateOutputModelCommissionsServiceConfigurationRecordCommissionsServiceSubscription   {
  private String commissionsServiceSubscriberReference = null;

  private String commissionsServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return commissionsServiceSubscriberReference
  **/

  public String getCommissionsServiceSubscriberReference() {
    return commissionsServiceSubscriberReference;
  }

  public void setCommissionsServiceSubscriberReference(String commissionsServiceSubscriberReference) {
    this.commissionsServiceSubscriberReference = commissionsServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return commissionsServiceSubscriberAccessProfile
  **/

  public String getCommissionsServiceSubscriberAccessProfile() {
    return commissionsServiceSubscriberAccessProfile;
  }

  public void setCommissionsServiceSubscriberAccessProfile(String commissionsServiceSubscriberAccessProfile) {
    this.commissionsServiceSubscriberAccessProfile = commissionsServiceSubscriberAccessProfile;
  }


}

