package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceAnalysis
 */
public class CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceAnalysis   {
  private String commissionTransactionInstanceAnalysisData = null;

  private String commissionTransactionInstanceAnalysisReportType = null;

  private Object commissionTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return commissionTransactionInstanceAnalysisData
  **/

  public String getCommissionTransactionInstanceAnalysisData() {
    return commissionTransactionInstanceAnalysisData;
  }

  public void setCommissionTransactionInstanceAnalysisData(String commissionTransactionInstanceAnalysisData) {
    this.commissionTransactionInstanceAnalysisData = commissionTransactionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return commissionTransactionInstanceAnalysisReportType
  **/

  public String getCommissionTransactionInstanceAnalysisReportType() {
    return commissionTransactionInstanceAnalysisReportType;
  }

  public void setCommissionTransactionInstanceAnalysisReportType(String commissionTransactionInstanceAnalysisReportType) {
    this.commissionTransactionInstanceAnalysisReportType = commissionTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return commissionTransactionInstanceAnalysisReport
  **/

  public Object getCommissionTransactionInstanceAnalysisReport() {
    return commissionTransactionInstanceAnalysisReport;
  }

  public void setCommissionTransactionInstanceAnalysisReport(Object commissionTransactionInstanceAnalysisReport) {
    this.commissionTransactionInstanceAnalysisReport = commissionTransactionInstanceAnalysisReport;
  }


}

