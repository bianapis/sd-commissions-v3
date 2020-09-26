package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCalculationRetrieveOutputModelCalculationInstanceReport
 */
public class BQCalculationRetrieveOutputModelCalculationInstanceReport   {
  private Object calculationInstanceReportRecord = null;

  private String calculationInstanceReportType = null;

  private String calculationInstanceReportParameters = null;

  private Object calculationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return calculationInstanceReportRecord
  **/

  public Object getCalculationInstanceReportRecord() {
    return calculationInstanceReportRecord;
  }

  public void setCalculationInstanceReportRecord(Object calculationInstanceReportRecord) {
    this.calculationInstanceReportRecord = calculationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return calculationInstanceReportType
  **/

  public String getCalculationInstanceReportType() {
    return calculationInstanceReportType;
  }

  public void setCalculationInstanceReportType(String calculationInstanceReportType) {
    this.calculationInstanceReportType = calculationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return calculationInstanceReportParameters
  **/

  public String getCalculationInstanceReportParameters() {
    return calculationInstanceReportParameters;
  }

  public void setCalculationInstanceReportParameters(String calculationInstanceReportParameters) {
    this.calculationInstanceReportParameters = calculationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return calculationInstanceReport
  **/

  public Object getCalculationInstanceReport() {
    return calculationInstanceReport;
  }

  public void setCalculationInstanceReport(Object calculationInstanceReport) {
    this.calculationInstanceReport = calculationInstanceReport;
  }


}

