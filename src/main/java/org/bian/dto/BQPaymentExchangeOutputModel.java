package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPaymentExchangeOutputModel
 */
public class BQPaymentExchangeOutputModel   {
  private String paymentPreconditions = null;

  private String paymentTaskSchedule = null;

  private String businessService = null;

  private String paymentPostconditions = null;

  private String paymentServiceType = null;

  private String paymentServiceDescription = null;

  private String paymentServiceInputsandOuputs = null;

  private String paymentServiceWorkProduct = null;

  private String paymentServiceName = null;

  private String paymentExchangeActionTaskReference = null;

  private Object paymentExchangeActionTaskRecord = null;

  private String paymentExchangeActionResponse = null;

  private String paymentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return paymentPreconditions
  **/

  public String getPaymentPreconditions() {
    return paymentPreconditions;
  }

  public void setPaymentPreconditions(String paymentPreconditions) {
    this.paymentPreconditions = paymentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return paymentTaskSchedule
  **/

  public String getPaymentTaskSchedule() {
    return paymentTaskSchedule;
  }

  public void setPaymentTaskSchedule(String paymentTaskSchedule) {
    this.paymentTaskSchedule = paymentTaskSchedule;
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
   * @return paymentPostconditions
  **/

  public String getPaymentPostconditions() {
    return paymentPostconditions;
  }

  public void setPaymentPostconditions(String paymentPostconditions) {
    this.paymentPostconditions = paymentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return paymentServiceType
  **/

  public String getPaymentServiceType() {
    return paymentServiceType;
  }

  public void setPaymentServiceType(String paymentServiceType) {
    this.paymentServiceType = paymentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return paymentServiceDescription
  **/

  public String getPaymentServiceDescription() {
    return paymentServiceDescription;
  }

  public void setPaymentServiceDescription(String paymentServiceDescription) {
    this.paymentServiceDescription = paymentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return paymentServiceInputsandOuputs
  **/

  public String getPaymentServiceInputsandOuputs() {
    return paymentServiceInputsandOuputs;
  }

  public void setPaymentServiceInputsandOuputs(String paymentServiceInputsandOuputs) {
    this.paymentServiceInputsandOuputs = paymentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return paymentServiceWorkProduct
  **/

  public String getPaymentServiceWorkProduct() {
    return paymentServiceWorkProduct;
  }

  public void setPaymentServiceWorkProduct(String paymentServiceWorkProduct) {
    this.paymentServiceWorkProduct = paymentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return paymentServiceName
  **/

  public String getPaymentServiceName() {
    return paymentServiceName;
  }

  public void setPaymentServiceName(String paymentServiceName) {
    this.paymentServiceName = paymentServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payment instance exchange service call 
   * @return paymentExchangeActionTaskReference
  **/

  public String getPaymentExchangeActionTaskReference() {
    return paymentExchangeActionTaskReference;
  }

  public void setPaymentExchangeActionTaskReference(String paymentExchangeActionTaskReference) {
    this.paymentExchangeActionTaskReference = paymentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentExchangeActionTaskRecord
  **/

  public Object getPaymentExchangeActionTaskRecord() {
    return paymentExchangeActionTaskRecord;
  }

  public void setPaymentExchangeActionTaskRecord(Object paymentExchangeActionTaskRecord) {
    this.paymentExchangeActionTaskRecord = paymentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return paymentExchangeActionResponse
  **/

  public String getPaymentExchangeActionResponse() {
    return paymentExchangeActionResponse;
  }

  public void setPaymentExchangeActionResponse(String paymentExchangeActionResponse) {
    this.paymentExchangeActionResponse = paymentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payment instance (e.g. accepted, rejected, verified) 
   * @return paymentInstanceStatus
  **/

  public String getPaymentInstanceStatus() {
    return paymentInstanceStatus;
  }

  public void setPaymentInstanceStatus(String paymentInstanceStatus) {
    this.paymentInstanceStatus = paymentInstanceStatus;
  }


}

