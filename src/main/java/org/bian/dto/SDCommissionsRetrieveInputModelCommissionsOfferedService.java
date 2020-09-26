package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsRetrieveInputModelCommissionsOfferedServiceCommissionsServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsRetrieveInputModelCommissionsOfferedService
 */
public class SDCommissionsRetrieveInputModelCommissionsOfferedService   {
  private String commissionsServiceReference = null;

  private SDCommissionsRetrieveInputModelCommissionsOfferedServiceCommissionsServiceRecord commissionsServiceRecord = null;


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
   * Get commissionsServiceRecord
   * @return commissionsServiceRecord
  **/

  public SDCommissionsRetrieveInputModelCommissionsOfferedServiceCommissionsServiceRecord getCommissionsServiceRecord() {
    return commissionsServiceRecord;
  }

  public void setCommissionsServiceRecord(SDCommissionsRetrieveInputModelCommissionsOfferedServiceCommissionsServiceRecord commissionsServiceRecord) {
    this.commissionsServiceRecord = commissionsServiceRecord;
  }


}

