package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCheckRetrieveInputModelCheckInstanceAnalysis
 */
public class BQCheckRetrieveInputModelCheckInstanceAnalysis   {
  private String checkInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return checkInstanceAnalysisReference
  **/

  public String getCheckInstanceAnalysisReference() {
    return checkInstanceAnalysisReference;
  }

  public void setCheckInstanceAnalysisReference(String checkInstanceAnalysisReference) {
    this.checkInstanceAnalysisReference = checkInstanceAnalysisReference;
  }


}

