package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCheckRetrieveInputModelCheckInstanceReport
 */
public class BQCheckRetrieveInputModelCheckInstanceReport   {
  private String checkInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return checkInstanceReportReference
  **/

  public String getCheckInstanceReportReference() {
    return checkInstanceReportReference;
  }

  public void setCheckInstanceReportReference(String checkInstanceReportReference) {
    this.checkInstanceReportReference = checkInstanceReportReference;
  }


}

