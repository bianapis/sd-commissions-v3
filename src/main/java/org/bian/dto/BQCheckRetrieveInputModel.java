package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCheckRetrieveInputModelCheckInstanceAnalysis;
import org.bian.dto.BQCheckRetrieveInputModelCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCheckRetrieveInputModel
 */
public class BQCheckRetrieveInputModel   {
  private Object checkRetrieveActionTaskRecord = null;

  private String checkRetrieveActionRequest = null;

  private BQCheckRetrieveInputModelCheckInstanceReport checkInstanceReport = null;

  private BQCheckRetrieveInputModelCheckInstanceAnalysis checkInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return checkRetrieveActionRequest
  **/

  public String getCheckRetrieveActionRequest() {
    return checkRetrieveActionRequest;
  }

  public void setCheckRetrieveActionRequest(String checkRetrieveActionRequest) {
    this.checkRetrieveActionRequest = checkRetrieveActionRequest;
  }


  /**
   * Get checkInstanceReport
   * @return checkInstanceReport
  **/

  public BQCheckRetrieveInputModelCheckInstanceReport getCheckInstanceReport() {
    return checkInstanceReport;
  }

  public void setCheckInstanceReport(BQCheckRetrieveInputModelCheckInstanceReport checkInstanceReport) {
    this.checkInstanceReport = checkInstanceReport;
  }


  /**
   * Get checkInstanceAnalysis
   * @return checkInstanceAnalysis
  **/

  public BQCheckRetrieveInputModelCheckInstanceAnalysis getCheckInstanceAnalysis() {
    return checkInstanceAnalysis;
  }

  public void setCheckInstanceAnalysis(BQCheckRetrieveInputModelCheckInstanceAnalysis checkInstanceAnalysis) {
    this.checkInstanceAnalysis = checkInstanceAnalysis;
  }


}

