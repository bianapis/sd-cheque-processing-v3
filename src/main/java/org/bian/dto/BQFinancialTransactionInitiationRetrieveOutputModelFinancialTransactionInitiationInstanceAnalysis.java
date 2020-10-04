package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceAnalysis
 */
public class BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceAnalysis   {
  private Object financialTransactionInitiationInstanceAnalysisRecord = null;

  private String financialTransactionInitiationInstanceAnalysisReportType = null;

  private String financialTransactionInitiationInstanceAnalysisParameters = null;

  private Object financialTransactionInitiationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialTransactionInitiationInstanceAnalysisRecord
  **/

  public Object getFinancialTransactionInitiationInstanceAnalysisRecord() {
    return financialTransactionInitiationInstanceAnalysisRecord;
  }

  public void setFinancialTransactionInitiationInstanceAnalysisRecord(Object financialTransactionInitiationInstanceAnalysisRecord) {
    this.financialTransactionInitiationInstanceAnalysisRecord = financialTransactionInitiationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialTransactionInitiationInstanceAnalysisReportType
  **/

  public String getFinancialTransactionInitiationInstanceAnalysisReportType() {
    return financialTransactionInitiationInstanceAnalysisReportType;
  }

  public void setFinancialTransactionInitiationInstanceAnalysisReportType(String financialTransactionInitiationInstanceAnalysisReportType) {
    this.financialTransactionInitiationInstanceAnalysisReportType = financialTransactionInitiationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialTransactionInitiationInstanceAnalysisParameters
  **/

  public String getFinancialTransactionInitiationInstanceAnalysisParameters() {
    return financialTransactionInitiationInstanceAnalysisParameters;
  }

  public void setFinancialTransactionInitiationInstanceAnalysisParameters(String financialTransactionInitiationInstanceAnalysisParameters) {
    this.financialTransactionInitiationInstanceAnalysisParameters = financialTransactionInitiationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialTransactionInitiationInstanceAnalysisReport
  **/

  public Object getFinancialTransactionInitiationInstanceAnalysisReport() {
    return financialTransactionInitiationInstanceAnalysisReport;
  }

  public void setFinancialTransactionInitiationInstanceAnalysisReport(Object financialTransactionInitiationInstanceAnalysisReport) {
    this.financialTransactionInitiationInstanceAnalysisReport = financialTransactionInitiationInstanceAnalysisReport;
  }


}

