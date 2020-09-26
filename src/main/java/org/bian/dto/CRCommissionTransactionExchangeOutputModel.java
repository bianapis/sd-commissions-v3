package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionExchangeOutputModel
 */
public class CRCommissionTransactionExchangeOutputModel   {
  private String commissionTransactionParameterType = null;

  private String commissionTransactionSelectedOption = null;

  private String commissionTransactionStatus = null;

  private String commissionTransactionExchangeActionTaskReference = null;

  private Object commissionTransactionExchangeActionTaskRecord = null;

  private String commissionTransactionExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Commission Transaction instance exchange service call 
   * @return commissionTransactionExchangeActionTaskReference
  **/

  public String getCommissionTransactionExchangeActionTaskReference() {
    return commissionTransactionExchangeActionTaskReference;
  }

  public void setCommissionTransactionExchangeActionTaskReference(String commissionTransactionExchangeActionTaskReference) {
    this.commissionTransactionExchangeActionTaskReference = commissionTransactionExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return commissionTransactionExchangeActionTaskRecord
  **/

  public Object getCommissionTransactionExchangeActionTaskRecord() {
    return commissionTransactionExchangeActionTaskRecord;
  }

  public void setCommissionTransactionExchangeActionTaskRecord(Object commissionTransactionExchangeActionTaskRecord) {
    this.commissionTransactionExchangeActionTaskRecord = commissionTransactionExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return commissionTransactionExchangeActionResponse
  **/

  public String getCommissionTransactionExchangeActionResponse() {
    return commissionTransactionExchangeActionResponse;
  }

  public void setCommissionTransactionExchangeActionResponse(String commissionTransactionExchangeActionResponse) {
    this.commissionTransactionExchangeActionResponse = commissionTransactionExchangeActionResponse;
  }


}

