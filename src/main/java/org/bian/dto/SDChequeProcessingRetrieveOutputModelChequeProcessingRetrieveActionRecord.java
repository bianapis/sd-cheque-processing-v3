package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordChequeProcessingActivityAnalysis;
import org.bian.dto.SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordChequeProcessingPerformanceAnalysis;
import org.bian.dto.SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecord
 */
public class SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecord   {
  private SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordChequeProcessingActivityAnalysis chequeProcessingActivityAnalysis = null;

  private SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordChequeProcessingPerformanceAnalysis chequeProcessingPerformanceAnalysis = null;

  private SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get chequeProcessingActivityAnalysis
   * @return chequeProcessingActivityAnalysis
  **/

  public SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordChequeProcessingActivityAnalysis getChequeProcessingActivityAnalysis() {
    return chequeProcessingActivityAnalysis;
  }

  public void setChequeProcessingActivityAnalysis(SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordChequeProcessingActivityAnalysis chequeProcessingActivityAnalysis) {
    this.chequeProcessingActivityAnalysis = chequeProcessingActivityAnalysis;
  }


  /**
   * Get chequeProcessingPerformanceAnalysis
   * @return chequeProcessingPerformanceAnalysis
  **/

  public SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordChequeProcessingPerformanceAnalysis getChequeProcessingPerformanceAnalysis() {
    return chequeProcessingPerformanceAnalysis;
  }

  public void setChequeProcessingPerformanceAnalysis(SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordChequeProcessingPerformanceAnalysis chequeProcessingPerformanceAnalysis) {
    this.chequeProcessingPerformanceAnalysis = chequeProcessingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

