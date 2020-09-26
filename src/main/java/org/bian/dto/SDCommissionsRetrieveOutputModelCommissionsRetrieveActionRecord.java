package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordCommissionsActivityAnalysis;
import org.bian.dto.SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordCommissionsPerformanceAnalysis;
import org.bian.dto.SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecord
 */
public class SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecord   {
  private SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordCommissionsActivityAnalysis commissionsActivityAnalysis = null;

  private SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordCommissionsPerformanceAnalysis commissionsPerformanceAnalysis = null;

  private SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get commissionsActivityAnalysis
   * @return commissionsActivityAnalysis
  **/

  public SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordCommissionsActivityAnalysis getCommissionsActivityAnalysis() {
    return commissionsActivityAnalysis;
  }

  public void setCommissionsActivityAnalysis(SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordCommissionsActivityAnalysis commissionsActivityAnalysis) {
    this.commissionsActivityAnalysis = commissionsActivityAnalysis;
  }


  /**
   * Get commissionsPerformanceAnalysis
   * @return commissionsPerformanceAnalysis
  **/

  public SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordCommissionsPerformanceAnalysis getCommissionsPerformanceAnalysis() {
    return commissionsPerformanceAnalysis;
  }

  public void setCommissionsPerformanceAnalysis(SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordCommissionsPerformanceAnalysis commissionsPerformanceAnalysis) {
    this.commissionsPerformanceAnalysis = commissionsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCommissionsRetrieveOutputModelCommissionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

