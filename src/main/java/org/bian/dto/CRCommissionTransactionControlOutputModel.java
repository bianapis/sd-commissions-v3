package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionControlOutputModel
 */
public class CRCommissionTransactionControlOutputModel   {
  private String commissionTransactionParameterType = null;

  private String commissionTransactionSelectedOption = null;

  private String commissionTransactionStatus = null;

  private String commissionTransactionControlActionTaskReference = null;

  private Object commissionTransactionControlActionTaskRecord = null;

  private String commissionTransactionControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Commission Transaction instance control processing service call 
   * @return commissionTransactionControlActionTaskReference
  **/

  public String getCommissionTransactionControlActionTaskReference() {
    return commissionTransactionControlActionTaskReference;
  }

  public void setCommissionTransactionControlActionTaskReference(String commissionTransactionControlActionTaskReference) {
    this.commissionTransactionControlActionTaskReference = commissionTransactionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return commissionTransactionControlActionTaskRecord
  **/

  public Object getCommissionTransactionControlActionTaskRecord() {
    return commissionTransactionControlActionTaskRecord;
  }

  public void setCommissionTransactionControlActionTaskRecord(Object commissionTransactionControlActionTaskRecord) {
    this.commissionTransactionControlActionTaskRecord = commissionTransactionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return commissionTransactionControlActionResponse
  **/

  public String getCommissionTransactionControlActionResponse() {
    return commissionTransactionControlActionResponse;
  }

  public void setCommissionTransactionControlActionResponse(String commissionTransactionControlActionResponse) {
    this.commissionTransactionControlActionResponse = commissionTransactionControlActionResponse;
  }


}

