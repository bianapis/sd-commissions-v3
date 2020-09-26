package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceReportRecord
 */
public class CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceReportRecord   {
  private String commissionTransactionInstanceReportReference = null;

  private String commissionTransactionInstanceReportType = null;

  private String commissionTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return commissionTransactionInstanceReportReference
  **/

  public String getCommissionTransactionInstanceReportReference() {
    return commissionTransactionInstanceReportReference;
  }

  public void setCommissionTransactionInstanceReportReference(String commissionTransactionInstanceReportReference) {
    this.commissionTransactionInstanceReportReference = commissionTransactionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return commissionTransactionInstanceReportType
  **/

  public String getCommissionTransactionInstanceReportType() {
    return commissionTransactionInstanceReportType;
  }

  public void setCommissionTransactionInstanceReportType(String commissionTransactionInstanceReportType) {
    this.commissionTransactionInstanceReportType = commissionTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return commissionTransactionInstanceReportParameters
  **/

  public String getCommissionTransactionInstanceReportParameters() {
    return commissionTransactionInstanceReportParameters;
  }

  public void setCommissionTransactionInstanceReportParameters(String commissionTransactionInstanceReportParameters) {
    this.commissionTransactionInstanceReportParameters = commissionTransactionInstanceReportParameters;
  }


}

