package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCalculationExchangeOutputModel
 */
public class BQCalculationExchangeOutputModel   {
  private String calculationPreconditions = null;

  private String calculationTaskSchedule = null;

  private String commissionCalculation = null;

  private String calculationPostconditions = null;

  private String calculationCommissionCalculationServiceType = null;

  private String calculationCommissionCalculationServiceDescription = null;

  private String calculationCommissionCalculationServiceInputsandOuputs = null;

  private String calculationCommissionCalculationServiceWorkProduct = null;

  private String calculationCommissionCalculationServiceName = null;

  private String calculationExchangeActionTaskReference = null;

  private Object calculationExchangeActionTaskRecord = null;

  private String calculationExchangeActionResponse = null;

  private String calculationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return calculationPreconditions
  **/

  public String getCalculationPreconditions() {
    return calculationPreconditions;
  }

  public void setCalculationPreconditions(String calculationPreconditions) {
    this.calculationPreconditions = calculationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return calculationTaskSchedule
  **/

  public String getCalculationTaskSchedule() {
    return calculationTaskSchedule;
  }

  public void setCalculationTaskSchedule(String calculationTaskSchedule) {
    this.calculationTaskSchedule = calculationTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Commission Transaction specific Business Service 
   * @return commissionCalculation
  **/

  public String getCommissionCalculation() {
    return commissionCalculation;
  }

  public void setCommissionCalculation(String commissionCalculation) {
    this.commissionCalculation = commissionCalculation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return calculationPostconditions
  **/

  public String getCalculationPostconditions() {
    return calculationPostconditions;
  }

  public void setCalculationPostconditions(String calculationPostconditions) {
    this.calculationPostconditions = calculationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return calculationCommissionCalculationServiceType
  **/

  public String getCalculationCommissionCalculationServiceType() {
    return calculationCommissionCalculationServiceType;
  }

  public void setCalculationCommissionCalculationServiceType(String calculationCommissionCalculationServiceType) {
    this.calculationCommissionCalculationServiceType = calculationCommissionCalculationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return calculationCommissionCalculationServiceDescription
  **/

  public String getCalculationCommissionCalculationServiceDescription() {
    return calculationCommissionCalculationServiceDescription;
  }

  public void setCalculationCommissionCalculationServiceDescription(String calculationCommissionCalculationServiceDescription) {
    this.calculationCommissionCalculationServiceDescription = calculationCommissionCalculationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return calculationCommissionCalculationServiceInputsandOuputs
  **/

  public String getCalculationCommissionCalculationServiceInputsandOuputs() {
    return calculationCommissionCalculationServiceInputsandOuputs;
  }

  public void setCalculationCommissionCalculationServiceInputsandOuputs(String calculationCommissionCalculationServiceInputsandOuputs) {
    this.calculationCommissionCalculationServiceInputsandOuputs = calculationCommissionCalculationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return calculationCommissionCalculationServiceWorkProduct
  **/

  public String getCalculationCommissionCalculationServiceWorkProduct() {
    return calculationCommissionCalculationServiceWorkProduct;
  }

  public void setCalculationCommissionCalculationServiceWorkProduct(String calculationCommissionCalculationServiceWorkProduct) {
    this.calculationCommissionCalculationServiceWorkProduct = calculationCommissionCalculationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return calculationCommissionCalculationServiceName
  **/

  public String getCalculationCommissionCalculationServiceName() {
    return calculationCommissionCalculationServiceName;
  }

  public void setCalculationCommissionCalculationServiceName(String calculationCommissionCalculationServiceName) {
    this.calculationCommissionCalculationServiceName = calculationCommissionCalculationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Calculation instance exchange service call 
   * @return calculationExchangeActionTaskReference
  **/

  public String getCalculationExchangeActionTaskReference() {
    return calculationExchangeActionTaskReference;
  }

  public void setCalculationExchangeActionTaskReference(String calculationExchangeActionTaskReference) {
    this.calculationExchangeActionTaskReference = calculationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return calculationExchangeActionTaskRecord
  **/

  public Object getCalculationExchangeActionTaskRecord() {
    return calculationExchangeActionTaskRecord;
  }

  public void setCalculationExchangeActionTaskRecord(Object calculationExchangeActionTaskRecord) {
    this.calculationExchangeActionTaskRecord = calculationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return calculationExchangeActionResponse
  **/

  public String getCalculationExchangeActionResponse() {
    return calculationExchangeActionResponse;
  }

  public void setCalculationExchangeActionResponse(String calculationExchangeActionResponse) {
    this.calculationExchangeActionResponse = calculationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Calculation instance (e.g. accepted, rejected, verified) 
   * @return calculationInstanceStatus
  **/

  public String getCalculationInstanceStatus() {
    return calculationInstanceStatus;
  }

  public void setCalculationInstanceStatus(String calculationInstanceStatus) {
    this.calculationInstanceStatus = calculationInstanceStatus;
  }


}

