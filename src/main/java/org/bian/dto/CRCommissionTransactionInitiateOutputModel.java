package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionInitiateOutputModel
 */
public class CRCommissionTransactionInitiateOutputModel   {
  private String commissionTransactionInstanceReference = null;

  private String commissionTransactionInitiateActionReference = null;

  private Object commissionTransactionInitiateActionRecord = null;

  private String commissionTransactionInstanceStatus = null;

  private String commissionTransactionParameterType = null;

  private String commissionTransactionSelectedOption = null;

  private String commissionTransactionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Commission Transaction instance 
   * @return commissionTransactionInstanceReference
  **/

  public String getCommissionTransactionInstanceReference() {
    return commissionTransactionInstanceReference;
  }

  public void setCommissionTransactionInstanceReference(String commissionTransactionInstanceReference) {
    this.commissionTransactionInstanceReference = commissionTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return commissionTransactionInitiateActionReference
  **/

  public String getCommissionTransactionInitiateActionReference() {
    return commissionTransactionInitiateActionReference;
  }

  public void setCommissionTransactionInitiateActionReference(String commissionTransactionInitiateActionReference) {
    this.commissionTransactionInitiateActionReference = commissionTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return commissionTransactionInitiateActionRecord
  **/

  public Object getCommissionTransactionInitiateActionRecord() {
    return commissionTransactionInitiateActionRecord;
  }

  public void setCommissionTransactionInitiateActionRecord(Object commissionTransactionInitiateActionRecord) {
    this.commissionTransactionInitiateActionRecord = commissionTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Commission Transaction instance (e.g. initialised, pending, active) 
   * @return commissionTransactionInstanceStatus
  **/

  public String getCommissionTransactionInstanceStatus() {
    return commissionTransactionInstanceStatus;
  }

  public void setCommissionTransactionInstanceStatus(String commissionTransactionInstanceStatus) {
    this.commissionTransactionInstanceStatus = commissionTransactionInstanceStatus;
  }


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


}

