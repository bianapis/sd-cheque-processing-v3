package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceAnalysis
 */
public class BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceAnalysis   {
  private Object cancelledChequeHandlingInstanceAnalysisRecord = null;

  private String cancelledChequeHandlingInstanceAnalysisReportType = null;

  private String cancelledChequeHandlingInstanceAnalysisParameters = null;

  private Object cancelledChequeHandlingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return cancelledChequeHandlingInstanceAnalysisRecord
  **/

  public Object getCancelledChequeHandlingInstanceAnalysisRecord() {
    return cancelledChequeHandlingInstanceAnalysisRecord;
  }

  public void setCancelledChequeHandlingInstanceAnalysisRecord(Object cancelledChequeHandlingInstanceAnalysisRecord) {
    this.cancelledChequeHandlingInstanceAnalysisRecord = cancelledChequeHandlingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return cancelledChequeHandlingInstanceAnalysisReportType
  **/

  public String getCancelledChequeHandlingInstanceAnalysisReportType() {
    return cancelledChequeHandlingInstanceAnalysisReportType;
  }

  public void setCancelledChequeHandlingInstanceAnalysisReportType(String cancelledChequeHandlingInstanceAnalysisReportType) {
    this.cancelledChequeHandlingInstanceAnalysisReportType = cancelledChequeHandlingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return cancelledChequeHandlingInstanceAnalysisParameters
  **/

  public String getCancelledChequeHandlingInstanceAnalysisParameters() {
    return cancelledChequeHandlingInstanceAnalysisParameters;
  }

  public void setCancelledChequeHandlingInstanceAnalysisParameters(String cancelledChequeHandlingInstanceAnalysisParameters) {
    this.cancelledChequeHandlingInstanceAnalysisParameters = cancelledChequeHandlingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return cancelledChequeHandlingInstanceAnalysisReport
  **/

  public Object getCancelledChequeHandlingInstanceAnalysisReport() {
    return cancelledChequeHandlingInstanceAnalysisReport;
  }

  public void setCancelledChequeHandlingInstanceAnalysisReport(Object cancelledChequeHandlingInstanceAnalysisReport) {
    this.cancelledChequeHandlingInstanceAnalysisReport = cancelledChequeHandlingInstanceAnalysisReport;
  }


}

