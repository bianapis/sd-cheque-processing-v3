package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceAnalysis;
import org.bian.dto.BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionInitiationRetrieveInputModel
 */
public class BQFinancialTransactionInitiationRetrieveInputModel   {
  private Object financialTransactionInitiationRetrieveActionTaskRecord = null;

  private String financialTransactionInitiationRetrieveActionRequest = null;

  private BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceReport financialTransactionInitiationInstanceReport = null;

  private BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceAnalysis financialTransactionInitiationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialTransactionInitiationRetrieveActionTaskRecord
  **/

  public Object getFinancialTransactionInitiationRetrieveActionTaskRecord() {
    return financialTransactionInitiationRetrieveActionTaskRecord;
  }

  public void setFinancialTransactionInitiationRetrieveActionTaskRecord(Object financialTransactionInitiationRetrieveActionTaskRecord) {
    this.financialTransactionInitiationRetrieveActionTaskRecord = financialTransactionInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialTransactionInitiationRetrieveActionRequest
  **/

  public String getFinancialTransactionInitiationRetrieveActionRequest() {
    return financialTransactionInitiationRetrieveActionRequest;
  }

  public void setFinancialTransactionInitiationRetrieveActionRequest(String financialTransactionInitiationRetrieveActionRequest) {
    this.financialTransactionInitiationRetrieveActionRequest = financialTransactionInitiationRetrieveActionRequest;
  }


  /**
   * Get financialTransactionInitiationInstanceReport
   * @return financialTransactionInitiationInstanceReport
  **/

  public BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceReport getFinancialTransactionInitiationInstanceReport() {
    return financialTransactionInitiationInstanceReport;
  }

  public void setFinancialTransactionInitiationInstanceReport(BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceReport financialTransactionInitiationInstanceReport) {
    this.financialTransactionInitiationInstanceReport = financialTransactionInitiationInstanceReport;
  }


  /**
   * Get financialTransactionInitiationInstanceAnalysis
   * @return financialTransactionInitiationInstanceAnalysis
  **/

  public BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceAnalysis getFinancialTransactionInitiationInstanceAnalysis() {
    return financialTransactionInitiationInstanceAnalysis;
  }

  public void setFinancialTransactionInitiationInstanceAnalysis(BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceAnalysis financialTransactionInitiationInstanceAnalysis) {
    this.financialTransactionInitiationInstanceAnalysis = financialTransactionInitiationInstanceAnalysis;
  }


}

