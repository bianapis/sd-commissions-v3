package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCheckRetrieveOutputModelCheckInstanceReport
 */
public class BQCheckRetrieveOutputModelCheckInstanceReport   {
  private Object checkInstanceReportRecord = null;

  private String checkInstanceReportType = null;

  private String checkInstanceReportParameters = null;

  private Object checkInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return checkInstanceReportRecord
  **/

  public Object getCheckInstanceReportRecord() {
    return checkInstanceReportRecord;
  }

  public void setCheckInstanceReportRecord(Object checkInstanceReportRecord) {
    this.checkInstanceReportRecord = checkInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return checkInstanceReportType
  **/

  public String getCheckInstanceReportType() {
    return checkInstanceReportType;
  }

  public void setCheckInstanceReportType(String checkInstanceReportType) {
    this.checkInstanceReportType = checkInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return checkInstanceReportParameters
  **/

  public String getCheckInstanceReportParameters() {
    return checkInstanceReportParameters;
  }

  public void setCheckInstanceReportParameters(String checkInstanceReportParameters) {
    this.checkInstanceReportParameters = checkInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return checkInstanceReport
  **/

  public Object getCheckInstanceReport() {
    return checkInstanceReport;
  }

  public void setCheckInstanceReport(Object checkInstanceReport) {
    this.checkInstanceReport = checkInstanceReport;
  }


}

