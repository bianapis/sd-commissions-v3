package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCalculationRetrieveOutputModelCalculationInstanceAnalysis
 */
public class BQCalculationRetrieveOutputModelCalculationInstanceAnalysis   {
  private Object calculationInstanceAnalysisRecord = null;

  private String calculationInstanceAnalysisReportType = null;

  private String calculationInstanceAnalysisParameters = null;

  private Object calculationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return calculationInstanceAnalysisRecord
  **/

  public Object getCalculationInstanceAnalysisRecord() {
    return calculationInstanceAnalysisRecord;
  }

  public void setCalculationInstanceAnalysisRecord(Object calculationInstanceAnalysisRecord) {
    this.calculationInstanceAnalysisRecord = calculationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return calculationInstanceAnalysisReportType
  **/

  public String getCalculationInstanceAnalysisReportType() {
    return calculationInstanceAnalysisReportType;
  }

  public void setCalculationInstanceAnalysisReportType(String calculationInstanceAnalysisReportType) {
    this.calculationInstanceAnalysisReportType = calculationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return calculationInstanceAnalysisParameters
  **/

  public String getCalculationInstanceAnalysisParameters() {
    return calculationInstanceAnalysisParameters;
  }

  public void setCalculationInstanceAnalysisParameters(String calculationInstanceAnalysisParameters) {
    this.calculationInstanceAnalysisParameters = calculationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return calculationInstanceAnalysisReport
  **/

  public Object getCalculationInstanceAnalysisReport() {
    return calculationInstanceAnalysisReport;
  }

  public void setCalculationInstanceAnalysisReport(Object calculationInstanceAnalysisReport) {
    this.calculationInstanceAnalysisReport = calculationInstanceAnalysisReport;
  }


}

