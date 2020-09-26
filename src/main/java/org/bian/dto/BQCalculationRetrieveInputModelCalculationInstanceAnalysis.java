package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCalculationRetrieveInputModelCalculationInstanceAnalysis
 */
public class BQCalculationRetrieveInputModelCalculationInstanceAnalysis   {
  private String calculationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return calculationInstanceAnalysisReference
  **/

  public String getCalculationInstanceAnalysisReference() {
    return calculationInstanceAnalysisReference;
  }

  public void setCalculationInstanceAnalysisReference(String calculationInstanceAnalysisReference) {
    this.calculationInstanceAnalysisReference = calculationInstanceAnalysisReference;
  }


}

