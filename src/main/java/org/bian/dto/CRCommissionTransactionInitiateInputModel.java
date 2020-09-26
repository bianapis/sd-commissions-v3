package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionInitiateInputModel
 */
public class CRCommissionTransactionInitiateInputModel   {
  private String commissionsServicingSessionReference = null;

  private Object commissionTransactionInitiateActionRecord = null;

  private String commissionTransactionInstanceStatus = null;

  private String commissionTransactionParameterType = null;

  private String commissionTransactionSelectedOption = null;

  private String commissionTransactionStatus = null;

  private String commissionTransactionType = null;

  private String commissionTransactionTransactionType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return commissionsServicingSessionReference
  **/

  public String getCommissionsServicingSessionReference() {
    return commissionsServicingSessionReference;
  }

  public void setCommissionsServicingSessionReference(String commissionsServicingSessionReference) {
    this.commissionsServicingSessionReference = commissionsServicingSessionReference;
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


}

