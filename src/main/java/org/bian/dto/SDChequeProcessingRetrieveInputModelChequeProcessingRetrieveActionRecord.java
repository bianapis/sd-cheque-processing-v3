package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordChequeProcessingActivityAnalysis;
import org.bian.dto.SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordChequeProcessingPerformanceAnalysis;
import org.bian.dto.SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecord
 */
public class SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecord   {
  private SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordChequeProcessingActivityAnalysis chequeProcessingActivityAnalysis = null;

  private SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordChequeProcessingPerformanceAnalysis chequeProcessingPerformanceAnalysis = null;

  private SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get chequeProcessingActivityAnalysis
   * @return chequeProcessingActivityAnalysis
  **/

  public SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordChequeProcessingActivityAnalysis getChequeProcessingActivityAnalysis() {
    return chequeProcessingActivityAnalysis;
  }

  public void setChequeProcessingActivityAnalysis(SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordChequeProcessingActivityAnalysis chequeProcessingActivityAnalysis) {
    this.chequeProcessingActivityAnalysis = chequeProcessingActivityAnalysis;
  }


  /**
   * Get chequeProcessingPerformanceAnalysis
   * @return chequeProcessingPerformanceAnalysis
  **/

  public SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordChequeProcessingPerformanceAnalysis getChequeProcessingPerformanceAnalysis() {
    return chequeProcessingPerformanceAnalysis;
  }

  public void setChequeProcessingPerformanceAnalysis(SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordChequeProcessingPerformanceAnalysis chequeProcessingPerformanceAnalysis) {
    this.chequeProcessingPerformanceAnalysis = chequeProcessingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

