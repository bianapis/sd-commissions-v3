package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCommissionTransactionControlInputModelCommissionTransactionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionControlInputModel
 */
public class CRCommissionTransactionControlInputModel   {
  private String commissionsServicingSessionReference = null;

  private String commissionTransactionInstanceReference = null;

  private String commissionTransactionParameterType = null;

  private String commissionTransactionSelectedOption = null;

  private String commissionTransactionStatus = null;

  private String commissionTransactionType = null;

  private String commissionTransactionTransactionType = null;

  private Object commissionTransactionControlActionTaskRecord = null;

  private CRCommissionTransactionControlInputModelCommissionTransactionControlActionRequest commissionTransactionControlActionRequest = null;


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
   * Get commissionTransactionControlActionRequest
   * @return commissionTransactionControlActionRequest
  **/

  public CRCommissionTransactionControlInputModelCommissionTransactionControlActionRequest getCommissionTransactionControlActionRequest() {
    return commissionTransactionControlActionRequest;
  }

  public void setCommissionTransactionControlActionRequest(CRCommissionTransactionControlInputModelCommissionTransactionControlActionRequest commissionTransactionControlActionRequest) {
    this.commissionTransactionControlActionRequest = commissionTransactionControlActionRequest;
  }


}

