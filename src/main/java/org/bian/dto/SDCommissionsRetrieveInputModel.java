package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsRetrieveInputModelCommissionsOfferedService;
import org.bian.dto.SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsRetrieveInputModel
 */
public class SDCommissionsRetrieveInputModel   {
  private Object commissionsRetrieveActionTaskRecord = null;

  private String commissionsRetrieveActionRequest = null;

  private SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecord commissionsRetrieveActionRecord = null;

  private SDCommissionsRetrieveInputModelCommissionsOfferedService commissionsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return commissionsRetrieveActionTaskRecord
  **/

  public Object getCommissionsRetrieveActionTaskRecord() {
    return commissionsRetrieveActionTaskRecord;
  }

  public void setCommissionsRetrieveActionTaskRecord(Object commissionsRetrieveActionTaskRecord) {
    this.commissionsRetrieveActionTaskRecord = commissionsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return commissionsRetrieveActionRequest
  **/

  public String getCommissionsRetrieveActionRequest() {
    return commissionsRetrieveActionRequest;
  }

  public void setCommissionsRetrieveActionRequest(String commissionsRetrieveActionRequest) {
    this.commissionsRetrieveActionRequest = commissionsRetrieveActionRequest;
  }


  /**
   * Get commissionsRetrieveActionRecord
   * @return commissionsRetrieveActionRecord
  **/

  public SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecord getCommissionsRetrieveActionRecord() {
    return commissionsRetrieveActionRecord;
  }

  public void setCommissionsRetrieveActionRecord(SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecord commissionsRetrieveActionRecord) {
    this.commissionsRetrieveActionRecord = commissionsRetrieveActionRecord;
  }


  /**
   * Get commissionsOfferedService
   * @return commissionsOfferedService
  **/

  public SDCommissionsRetrieveInputModelCommissionsOfferedService getCommissionsOfferedService() {
    return commissionsOfferedService;
  }

  public void setCommissionsOfferedService(SDCommissionsRetrieveInputModelCommissionsOfferedService commissionsOfferedService) {
    this.commissionsOfferedService = commissionsOfferedService;
  }


}

