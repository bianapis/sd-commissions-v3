package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsFeedbackInputModelCommissionsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCommissionsFeedbackInputModel
 */
public class SDCommissionsFeedbackInputModel   {
  private Object commissionsFeedbackActionTaskRecord = null;

  private SDCommissionsFeedbackInputModelCommissionsFeedbackActionRecord commissionsFeedbackActionRecord = null;


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

  public SDCommissionsFeedbackInputModelCommissionsFeedbackActionRecord getCommissionsFeedbackActionRecord() {
    return commissionsFeedbackActionRecord;
  }

  public void setCommissionsFeedbackActionRecord(SDCommissionsFeedbackInputModelCommissionsFeedbackActionRecord commissionsFeedbackActionRecord) {
    this.commissionsFeedbackActionRecord = commissionsFeedbackActionRecord;
  }


}

