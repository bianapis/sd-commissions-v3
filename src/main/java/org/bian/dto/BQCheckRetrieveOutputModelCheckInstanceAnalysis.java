package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCheckRetrieveOutputModelCheckInstanceAnalysis
 */
public class BQCheckRetrieveOutputModelCheckInstanceAnalysis   {
  private Object checkInstanceAnalysisRecord = null;

  private String checkInstanceAnalysisReportType = null;

  private String checkInstanceAnalysisParameters = null;

  private Object checkInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return checkInstanceAnalysisRecord
  **/

  public Object getCheckInstanceAnalysisRecord() {
    return checkInstanceAnalysisRecord;
  }

  public void setCheckInstanceAnalysisRecord(Object checkInstanceAnalysisRecord) {
    this.checkInstanceAnalysisRecord = checkInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return checkInstanceAnalysisReportType
  **/

  public String getCheckInstanceAnalysisReportType() {
    return checkInstanceAnalysisReportType;
  }

  public void setCheckInstanceAnalysisReportType(String checkInstanceAnalysisReportType) {
    this.checkInstanceAnalysisReportType = checkInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return checkInstanceAnalysisParameters
  **/

  public String getCheckInstanceAnalysisParameters() {
    return checkInstanceAnalysisParameters;
  }

  public void setCheckInstanceAnalysisParameters(String checkInstanceAnalysisParameters) {
    this.checkInstanceAnalysisParameters = checkInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return checkInstanceAnalysisReport
  **/

  public Object getCheckInstanceAnalysisReport() {
    return checkInstanceAnalysisReport;
  }

  public void setCheckInstanceAnalysisReport(Object checkInstanceAnalysisReport) {
    this.checkInstanceAnalysisReport = checkInstanceAnalysisReport;
  }


}

