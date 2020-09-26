package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsRetrieveOutputModelCommissionsOfferedService;
import org.bian.dto.SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsRetrieveOutputModel
 */
public class SDCommissionsRetrieveOutputModel   {
  private String commissionsRetrieveActionTaskReference = null;

  private Object commissionsRetrieveActionTaskRecord = null;

  private String commissionsRetrieveActionResponse = null;

  private SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecord commissionsRetrieveActionRecord = null;

  private SDCommissionsRetrieveOutputModelCommissionsOfferedService commissionsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return commissionsRetrieveActionTaskReference
  **/

  public String getCommissionsRetrieveActionTaskReference() {
    return commissionsRetrieveActionTaskReference;
  }

  public void setCommissionsRetrieveActionTaskReference(String commissionsRetrieveActionTaskReference) {
    this.commissionsRetrieveActionTaskReference = commissionsRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return commissionsRetrieveActionResponse
  **/

  public String getCommissionsRetrieveActionResponse() {
    return commissionsRetrieveActionResponse;
  }

  public void setCommissionsRetrieveActionResponse(String commissionsRetrieveActionResponse) {
    this.commissionsRetrieveActionResponse = commissionsRetrieveActionResponse;
  }


  /**
   * Get commissionsRetrieveActionRecord
   * @return commissionsRetrieveActionRecord
  **/

  public SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecord getCommissionsRetrieveActionRecord() {
    return commissionsRetrieveActionRecord;
  }

  public void setCommissionsRetrieveActionRecord(SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecord commissionsRetrieveActionRecord) {
    this.commissionsRetrieveActionRecord = commissionsRetrieveActionRecord;
  }


  /**
   * Get commissionsOfferedService
   * @return commissionsOfferedService
  **/

  public SDCommissionsRetrieveOutputModelCommissionsOfferedService getCommissionsOfferedService() {
    return commissionsOfferedService;
  }

  public void setCommissionsOfferedService(SDCommissionsRetrieveOutputModelCommissionsOfferedService commissionsOfferedService) {
    this.commissionsOfferedService = commissionsOfferedService;
  }


}

