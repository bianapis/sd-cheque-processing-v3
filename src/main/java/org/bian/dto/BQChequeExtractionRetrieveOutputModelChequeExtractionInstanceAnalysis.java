package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceAnalysis
 */
public class BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceAnalysis   {
  private Object chequeExtractionInstanceAnalysisRecord = null;

  private String chequeExtractionInstanceAnalysisReportType = null;

  private String chequeExtractionInstanceAnalysisParameters = null;

  private Object chequeExtractionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return chequeExtractionInstanceAnalysisRecord
  **/

  public Object getChequeExtractionInstanceAnalysisRecord() {
    return chequeExtractionInstanceAnalysisRecord;
  }

  public void setChequeExtractionInstanceAnalysisRecord(Object chequeExtractionInstanceAnalysisRecord) {
    this.chequeExtractionInstanceAnalysisRecord = chequeExtractionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return chequeExtractionInstanceAnalysisReportType
  **/

  public String getChequeExtractionInstanceAnalysisReportType() {
    return chequeExtractionInstanceAnalysisReportType;
  }

  public void setChequeExtractionInstanceAnalysisReportType(String chequeExtractionInstanceAnalysisReportType) {
    this.chequeExtractionInstanceAnalysisReportType = chequeExtractionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return chequeExtractionInstanceAnalysisParameters
  **/

  public String getChequeExtractionInstanceAnalysisParameters() {
    return chequeExtractionInstanceAnalysisParameters;
  }

  public void setChequeExtractionInstanceAnalysisParameters(String chequeExtractionInstanceAnalysisParameters) {
    this.chequeExtractionInstanceAnalysisParameters = chequeExtractionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return chequeExtractionInstanceAnalysisReport
  **/

  public Object getChequeExtractionInstanceAnalysisReport() {
    return chequeExtractionInstanceAnalysisReport;
  }

  public void setChequeExtractionInstanceAnalysisReport(Object chequeExtractionInstanceAnalysisReport) {
    this.chequeExtractionInstanceAnalysisReport = chequeExtractionInstanceAnalysisReport;
  }


}

