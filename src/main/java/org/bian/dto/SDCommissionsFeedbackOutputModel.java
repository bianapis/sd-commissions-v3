package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsFeedbackOutputModelCommissionsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsFeedbackOutputModel
 */
public class SDCommissionsFeedbackOutputModel   {
  private String commissionsFeedbackActionTaskReference = null;

  private Object commissionsFeedbackActionTaskRecord = null;

  private SDCommissionsFeedbackOutputModelCommissionsFeedbackActionRecord commissionsFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return commissionsFeedbackActionTaskReference
  **/

  public String getCommissionsFeedbackActionTaskReference() {
    return commissionsFeedbackActionTaskReference;
  }

  public void setCommissionsFeedbackActionTaskReference(String commissionsFeedbackActionTaskReference) {
    this.commissionsFeedbackActionTaskReference = commissionsFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return commissionsFeedbackActionTaskRecord
  **/

  public Object getCommissionsFeedbackActionTaskRecord() {
    return commissionsFeedbackActionTaskRecord;
  }

  public void setCommissionsFeedbackActionTaskRecord(Object commissionsFeedbackActionTaskRecord) {
    this.commissionsFeedbackActionTaskRecord = commissionsFeedbackActionTaskRecord;
  }


  /**
   * Get commissionsFeedbackActionRecord
   * @return commissionsFeedbackActionRecord
  **/

  public SDCommissionsFeedbackOutputModelCommissionsFeedbackActionRecord getCommissionsFeedbackActionRecord() {
    return commissionsFeedbackActionRecord;
  }

  public void setCommissionsFeedbackActionRecord(SDCommissionsFeedbackOutputModelCommissionsFeedbackActionRecord commissionsFeedbackActionRecord) {
    this.commissionsFeedbackActionRecord = commissionsFeedbackActionRecord;
  }


}

