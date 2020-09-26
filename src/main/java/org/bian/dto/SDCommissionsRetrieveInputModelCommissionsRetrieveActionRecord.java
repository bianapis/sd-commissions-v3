package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordCommissionsActivityAnalysis;
import org.bian.dto.SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordCommissionsPerformanceAnalysis;
import org.bian.dto.SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecord
 */
public class SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecord   {
  private SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordCommissionsActivityAnalysis commissionsActivityAnalysis = null;

  private SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordCommissionsPerformanceAnalysis commissionsPerformanceAnalysis = null;

  private SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get commissionsActivityAnalysis
   * @return commissionsActivityAnalysis
  **/

  public SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordCommissionsActivityAnalysis getCommissionsActivityAnalysis() {
    return commissionsActivityAnalysis;
  }

  public void setCommissionsActivityAnalysis(SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordCommissionsActivityAnalysis commissionsActivityAnalysis) {
    this.commissionsActivityAnalysis = commissionsActivityAnalysis;
  }


  /**
   * Get commissionsPerformanceAnalysis
   * @return commissionsPerformanceAnalysis
  **/

  public SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordCommissionsPerformanceAnalysis getCommissionsPerformanceAnalysis() {
    return commissionsPerformanceAnalysis;
  }

  public void setCommissionsPerformanceAnalysis(SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordCommissionsPerformanceAnalysis commissionsPerformanceAnalysis) {
    this.commissionsPerformanceAnalysis = commissionsPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCommissionsRetrieveInputModelCommissionsRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

