package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCalculationRetrieveOutputModelCalculationInstanceAnalysis;
import org.bian.dto.BQCalculationRetrieveOutputModelCalculationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCalculationRetrieveOutputModel
 */
public class BQCalculationRetrieveOutputModel   {
  private String calculationPreconditions = null;

  private String calculationTaskSchedule = null;

  private String commissionCalculation = null;

  private String calculationPostconditions = null;

  private String calculationCommissionCalculationServiceType = null;

  private String calculationCommissionCalculationServiceDescription = null;

  private String calculationCommissionCalculationServiceInputsandOuputs = null;

  private String calculationCommissionCalculationServiceWorkProduct = null;

  private String calculationCommissionCalculationServiceName = null;

  private String calculationRetrieveActionTaskReference = null;

  private Object calculationRetrieveActionTaskRecord = null;

  private String calculationRetrieveActionResponse = null;

  private BQCalculationRetrieveOutputModelCalculationInstanceReport calculationInstanceReport = null;

  private BQCalculationRetrieveOutputModelCalculationInstanceAnalysis calculationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Calculation instance retrieve service call 
   * @return calculationRetrieveActionTaskReference
  **/

  public String getCalculationRetrieveActionTaskReference() {
    return calculationRetrieveActionTaskReference;
  }

  public void setCalculationRetrieveActionTaskReference(String calculationRetrieveActionTaskReference) {
    this.calculationRetrieveActionTaskReference = calculationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return calculationRetrieveActionTaskRecord
  **/

  public Object getCalculationRetrieveActionTaskRecord() {
    return calculationRetrieveActionTaskRecord;
  }

  public void setCalculationRetrieveActionTaskRecord(Object calculationRetrieveActionTaskRecord) {
    this.calculationRetrieveActionTaskRecord = calculationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return calculationRetrieveActionResponse
  **/

  public String getCalculationRetrieveActionResponse() {
    return calculationRetrieveActionResponse;
  }

  public void setCalculationRetrieveActionResponse(String calculationRetrieveActionResponse) {
    this.calculationRetrieveActionResponse = calculationRetrieveActionResponse;
  }


  /**
   * Get calculationInstanceReport
   * @return calculationInstanceReport
  **/

  public BQCalculationRetrieveOutputModelCalculationInstanceReport getCalculationInstanceReport() {
    return calculationInstanceReport;
  }

  public void setCalculationInstanceReport(BQCalculationRetrieveOutputModelCalculationInstanceReport calculationInstanceReport) {
    this.calculationInstanceReport = calculationInstanceReport;
  }


  /**
   * Get calculationInstanceAnalysis
   * @return calculationInstanceAnalysis
  **/

  public BQCalculationRetrieveOutputModelCalculationInstanceAnalysis getCalculationInstanceAnalysis() {
    return calculationInstanceAnalysis;
  }

  public void setCalculationInstanceAnalysis(BQCalculationRetrieveOutputModelCalculationInstanceAnalysis calculationInstanceAnalysis) {
    this.calculationInstanceAnalysis = calculationInstanceAnalysis;
  }


}

