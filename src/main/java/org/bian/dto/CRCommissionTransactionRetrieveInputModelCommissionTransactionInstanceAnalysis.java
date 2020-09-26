package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceAnalysis
 */
public class CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceAnalysis   {
  private String commissionTransactionInstanceAnalysisReference = null;

  private String commissionTransactionInstanceAnalysisReportType = null;

  private String commissionTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return commissionTransactionInstanceAnalysisReference
  **/

  public String getCommissionTransactionInstanceAnalysisReference() {
    return commissionTransactionInstanceAnalysisReference;
  }

  public void setCommissionTransactionInstanceAnalysisReference(String commissionTransactionInstanceAnalysisReference) {
    this.commissionTransactionInstanceAnalysisReference = commissionTransactionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return commissionTransactionInstanceAnalysisParameters
  **/

  public String getCommissionTransactionInstanceAnalysisParameters() {
    return commissionTransactionInstanceAnalysisParameters;
  }

  public void setCommissionTransactionInstanceAnalysisParameters(String commissionTransactionInstanceAnalysisParameters) {
    this.commissionTransactionInstanceAnalysisParameters = commissionTransactionInstanceAnalysisParameters;
  }


}

