package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCalculationRetrieveInputModelCalculationInstanceAnalysis;
import org.bian.dto.BQCalculationRetrieveInputModelCalculationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCalculationRetrieveInputModel
 */
public class BQCalculationRetrieveInputModel   {
  private Object calculationRetrieveActionTaskRecord = null;

  private String calculationRetrieveActionRequest = null;

  private BQCalculationRetrieveInputModelCalculationInstanceReport calculationInstanceReport = null;

  private BQCalculationRetrieveInputModelCalculationInstanceAnalysis calculationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return calculationRetrieveActionTaskRecord
  **/

  public Object getCalculationRetrieveActionTaskRecord() {
    return calculationRetrieveActionTaskRecord;
  }

  public void setCalculationRetrieveActionTaskRecord(Object calculationRetrieveActionTaskRecord) {
    this.calculationRetrieveActionTaskRecord = calculationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return calculationRetrieveActionRequest
  **/

  public String getCalculationRetrieveActionRequest() {
    return calculationRetrieveActionRequest;
  }

  public void setCalculationRetrieveActionRequest(String calculationRetrieveActionRequest) {
    this.calculationRetrieveActionRequest = calculationRetrieveActionRequest;
  }


  /**
   * Get calculationInstanceReport
   * @return calculationInstanceReport
  **/

  public BQCalculationRetrieveInputModelCalculationInstanceReport getCalculationInstanceReport() {
    return calculationInstanceReport;
  }

  public void setCalculationInstanceReport(BQCalculationRetrieveInputModelCalculationInstanceReport calculationInstanceReport) {
    this.calculationInstanceReport = calculationInstanceReport;
  }


  /**
   * Get calculationInstanceAnalysis
   * @return calculationInstanceAnalysis
  **/

  public BQCalculationRetrieveInputModelCalculationInstanceAnalysis getCalculationInstanceAnalysis() {
    return calculationInstanceAnalysis;
  }

  public void setCalculationInstanceAnalysis(BQCalculationRetrieveInputModelCalculationInstanceAnalysis calculationInstanceAnalysis) {
    this.calculationInstanceAnalysis = calculationInstanceAnalysis;
  }


}

