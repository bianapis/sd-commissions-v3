package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceAnalysis;
import org.bian.dto.CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionRetrieveOutputModel
 */
public class CRCommissionTransactionRetrieveOutputModel   {
  private String commissionTransactionParameterType = null;

  private String commissionTransactionSelectedOption = null;

  private String commissionTransactionStatus = null;

  private String commissionTransactionType = null;

  private String commissionTransactionTransactionType = null;

  private String commissionTransactionRetrieveActionTaskReference = null;

  private Object commissionTransactionRetrieveActionTaskRecord = null;

  private String commissionTransactionRetrieveActionResponse = null;

  private CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceReportRecord commissionTransactionInstanceReportRecord = null;

  private CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceAnalysis commissionTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between business sercice transaction within Commission Transaction 
   * @return commissionTransactionParameterType
  **/

  public String getCommissionTransactionParameterType() {
    return commissionTransactionParameterType;
  }

  public void setCommissionTransactionParameterType(String commissionTransactionParameterType) {
    this.commissionTransactionParameterType = commissionTransactionParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Commission Transaction 
   * @return commissionTransactionSelectedOption
  **/

  public String getCommissionTransactionSelectedOption() {
    return commissionTransactionSelectedOption;
  }

  public void setCommissionTransactionSelectedOption(String commissionTransactionSelectedOption) {
    this.commissionTransactionSelectedOption = commissionTransactionSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Commission Transaction 
   * @return commissionTransactionStatus
  **/

  public String getCommissionTransactionStatus() {
    return commissionTransactionStatus;
  }

  public void setCommissionTransactionStatus(String commissionTransactionStatus) {
    this.commissionTransactionStatus = commissionTransactionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of business action for this Commission Transaction 
   * @return commissionTransactionType
  **/

  public String getCommissionTransactionType() {
    return commissionTransactionType;
  }

  public void setCommissionTransactionType(String commissionTransactionType) {
    this.commissionTransactionType = commissionTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of transaction for this Commission Transaction 
   * @return commissionTransactionTransactionType
  **/

  public String getCommissionTransactionTransactionType() {
    return commissionTransactionTransactionType;
  }

  public void setCommissionTransactionTransactionType(String commissionTransactionTransactionType) {
    this.commissionTransactionTransactionType = commissionTransactionTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Commission Transaction instance retrieve service call 
   * @return commissionTransactionRetrieveActionTaskReference
  **/

  public String getCommissionTransactionRetrieveActionTaskReference() {
    return commissionTransactionRetrieveActionTaskReference;
  }

  public void setCommissionTransactionRetrieveActionTaskReference(String commissionTransactionRetrieveActionTaskReference) {
    this.commissionTransactionRetrieveActionTaskReference = commissionTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return commissionTransactionRetrieveActionTaskRecord
  **/

  public Object getCommissionTransactionRetrieveActionTaskRecord() {
    return commissionTransactionRetrieveActionTaskRecord;
  }

  public void setCommissionTransactionRetrieveActionTaskRecord(Object commissionTransactionRetrieveActionTaskRecord) {
    this.commissionTransactionRetrieveActionTaskRecord = commissionTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return commissionTransactionRetrieveActionResponse
  **/

  public String getCommissionTransactionRetrieveActionResponse() {
    return commissionTransactionRetrieveActionResponse;
  }

  public void setCommissionTransactionRetrieveActionResponse(String commissionTransactionRetrieveActionResponse) {
    this.commissionTransactionRetrieveActionResponse = commissionTransactionRetrieveActionResponse;
  }


  /**
   * Get commissionTransactionInstanceReportRecord
   * @return commissionTransactionInstanceReportRecord
  **/

  public CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceReportRecord getCommissionTransactionInstanceReportRecord() {
    return commissionTransactionInstanceReportRecord;
  }

  public void setCommissionTransactionInstanceReportRecord(CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceReportRecord commissionTransactionInstanceReportRecord) {
    this.commissionTransactionInstanceReportRecord = commissionTransactionInstanceReportRecord;
  }


  /**
   * Get commissionTransactionInstanceAnalysis
   * @return commissionTransactionInstanceAnalysis
  **/

  public CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceAnalysis getCommissionTransactionInstanceAnalysis() {
    return commissionTransactionInstanceAnalysis;
  }

  public void setCommissionTransactionInstanceAnalysis(CRCommissionTransactionRetrieveOutputModelCommissionTransactionInstanceAnalysis commissionTransactionInstanceAnalysis) {
    this.commissionTransactionInstanceAnalysis = commissionTransactionInstanceAnalysis;
  }


}

