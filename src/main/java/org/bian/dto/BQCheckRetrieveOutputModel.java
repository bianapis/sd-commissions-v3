package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCheckRetrieveOutputModelCheckInstanceAnalysis;
import org.bian.dto.BQCheckRetrieveOutputModelCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCheckRetrieveOutputModel
 */
public class BQCheckRetrieveOutputModel   {
  private String checkPreconditions = null;

  private String checkTaskSchedule = null;

  private String businessService = null;

  private String checkPostconditions = null;

  private String checkServiceType = null;

  private String checkServiceDescription = null;

  private String checkServiceInputsandOuputs = null;

  private String checkServiceWorkProduct = null;

  private String checkRetrieveActionTaskReference = null;

  private Object checkRetrieveActionTaskRecord = null;

  private String checkRetrieveActionResponse = null;

  private BQCheckRetrieveOutputModelCheckInstanceReport checkInstanceReport = null;

  private BQCheckRetrieveOutputModelCheckInstanceAnalysis checkInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Check instance retrieve service call 
   * @return checkRetrieveActionTaskReference
  **/

  public String getCheckRetrieveActionTaskReference() {
    return checkRetrieveActionTaskReference;
  }

  public void setCheckRetrieveActionTaskReference(String checkRetrieveActionTaskReference) {
    this.checkRetrieveActionTaskReference = checkRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return checkRetrieveActionTaskRecord
  **/

  public Object getCheckRetrieveActionTaskRecord() {
    return checkRetrieveActionTaskRecord;
  }

  public void setCheckRetrieveActionTaskRecord(Object checkRetrieveActionTaskRecord) {
    this.checkRetrieveActionTaskRecord = checkRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return checkRetrieveActionResponse
  **/

  public String getCheckRetrieveActionResponse() {
    return checkRetrieveActionResponse;
  }

  public void setCheckRetrieveActionResponse(String checkRetrieveActionResponse) {
    this.checkRetrieveActionResponse = checkRetrieveActionResponse;
  }


  /**
   * Get checkInstanceReport
   * @return checkInstanceReport
  **/

  public BQCheckRetrieveOutputModelCheckInstanceReport getCheckInstanceReport() {
    return checkInstanceReport;
  }

  public void setCheckInstanceReport(BQCheckRetrieveOutputModelCheckInstanceReport checkInstanceReport) {
    this.checkInstanceReport = checkInstanceReport;
  }


  /**
   * Get checkInstanceAnalysis
   * @return checkInstanceAnalysis
  **/

  public BQCheckRetrieveOutputModelCheckInstanceAnalysis getCheckInstanceAnalysis() {
    return checkInstanceAnalysis;
  }

  public void setCheckInstanceAnalysis(BQCheckRetrieveOutputModelCheckInstanceAnalysis checkInstanceAnalysis) {
    this.checkInstanceAnalysis = checkInstanceAnalysis;
  }


}

