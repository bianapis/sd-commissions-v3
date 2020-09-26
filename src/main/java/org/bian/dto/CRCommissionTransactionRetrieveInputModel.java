package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceAnalysis;
import org.bian.dto.CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCommissionTransactionRetrieveInputModel
 */
public class CRCommissionTransactionRetrieveInputModel   {
  private Object commissionTransactionRetrieveActionTaskRecord = null;

  private String commissionTransactionRetrieveActionRequest = null;

  private CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceReportRecord commissionTransactionInstanceReportRecord = null;

  private CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceAnalysis commissionTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return commissionTransactionRetrieveActionTaskRecord
  **/

  public Object getCommissionTransactionRetrieveActionTaskRecord() {
    return commissionTransactionRetrieveActionTaskRecord;
  }

  public void setCommissionTransactionRetrieveActionTaskRecord(Object commissionTransactionRetrieveActionTaskRecord) {
    this.commissionTransactionRetrieveActionTaskRecord = commissionTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return commissionTransactionRetrieveActionRequest
  **/

  public String getCommissionTransactionRetrieveActionRequest() {
    return commissionTransactionRetrieveActionRequest;
  }

  public void setCommissionTransactionRetrieveActionRequest(String commissionTransactionRetrieveActionRequest) {
    this.commissionTransactionRetrieveActionRequest = commissionTransactionRetrieveActionRequest;
  }


  /**
   * Get commissionTransactionInstanceReportRecord
   * @return commissionTransactionInstanceReportRecord
  **/

  public CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceReportRecord getCommissionTransactionInstanceReportRecord() {
    return commissionTransactionInstanceReportRecord;
  }

  public void setCommissionTransactionInstanceReportRecord(CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceReportRecord commissionTransactionInstanceReportRecord) {
    this.commissionTransactionInstanceReportRecord = commissionTransactionInstanceReportRecord;
  }


  /**
   * Get commissionTransactionInstanceAnalysis
   * @return commissionTransactionInstanceAnalysis
  **/

  public CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceAnalysis getCommissionTransactionInstanceAnalysis() {
    return commissionTransactionInstanceAnalysis;
  }

  public void setCommissionTransactionInstanceAnalysis(CRCommissionTransactionRetrieveInputModelCommissionTransactionInstanceAnalysis commissionTransactionInstanceAnalysis) {
    this.commissionTransactionInstanceAnalysis = commissionTransactionInstanceAnalysis;
  }


}

