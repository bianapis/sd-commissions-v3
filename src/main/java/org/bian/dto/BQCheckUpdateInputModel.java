package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCheckUpdateInputModel
 */
public class BQCheckUpdateInputModel   {
  private String commissionTransactionInstanceReference = null;

  private String checkInstanceReference = null;

  private String checkPreconditions = null;

  private String checkTaskSchedule = null;

  private String businessService = null;

  private String checkPostconditions = null;

  private String checkServiceType = null;

  private String checkServiceDescription = null;

  private String checkServiceInputsandOuputs = null;

  private String checkServiceWorkProduct = null;

  private Object checkUpdateActionTaskRecord = null;

  private String checkUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Commission Transaction instance 
   * @return commissionTransactionInstanceReference
  **/

  public String getCommissionTransactionInstanceReference() {
    return commissionTransactionInstanceReference;
  }

  public void setCommissionTransactionInstanceReference(String commissionTransactionInstanceReference) {
    this.commissionTransactionInstanceReference = commissionTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Check instance 
   * @return checkInstanceReference
  **/

  public String getCheckInstanceReference() {
    return checkInstanceReference;
  }

  public void setCheckInstanceReference(String checkInstanceReference) {
    this.checkInstanceReference = checkInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return checkPreconditions
  **/

  public String getCheckPreconditions() {
    return checkPreconditions;
  }

  public void setCheckPreconditions(String checkPreconditions) {
    this.checkPreconditions = checkPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return checkTaskSchedule
  **/

  public String getCheckTaskSchedule() {
    return checkTaskSchedule;
  }

  public void setCheckTaskSchedule(String checkTaskSchedule) {
    this.checkTaskSchedule = checkTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Commission Transaction specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return checkPostconditions
  **/

  public String getCheckPostconditions() {
    return checkPostconditions;
  }

  public void setCheckPostconditions(String checkPostconditions) {
    this.checkPostconditions = checkPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return checkServiceType
  **/

  public String getCheckServiceType() {
    return checkServiceType;
  }

  public void setCheckServiceType(String checkServiceType) {
    this.checkServiceType = checkServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return checkServiceDescription
  **/

  public String getCheckServiceDescription() {
    return checkServiceDescription;
  }

  public void setCheckServiceDescription(String checkServiceDescription) {
    this.checkServiceDescription = checkServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return checkServiceInputsandOuputs
  **/

  public String getCheckServiceInputsandOuputs() {
    return checkServiceInputsandOuputs;
  }

  public void setCheckServiceInputsandOuputs(String checkServiceInputsandOuputs) {
    this.checkServiceInputsandOuputs = checkServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return checkServiceWorkProduct
  **/

  public String getCheckServiceWorkProduct() {
    return checkServiceWorkProduct;
  }

  public void setCheckServiceWorkProduct(String checkServiceWorkProduct) {
    this.checkServiceWorkProduct = checkServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return checkUpdateActionTaskRecord
  **/

  public Object getCheckUpdateActionTaskRecord() {
    return checkUpdateActionTaskRecord;
  }

  public void setCheckUpdateActionTaskRecord(Object checkUpdateActionTaskRecord) {
    this.checkUpdateActionTaskRecord = checkUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return checkUpdateActionRequest
  **/

  public String getCheckUpdateActionRequest() {
    return checkUpdateActionRequest;
  }

  public void setCheckUpdateActionRequest(String checkUpdateActionRequest) {
    this.checkUpdateActionRequest = checkUpdateActionRequest;
  }


}

