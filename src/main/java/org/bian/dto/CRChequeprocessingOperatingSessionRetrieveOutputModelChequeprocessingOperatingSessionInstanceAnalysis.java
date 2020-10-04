package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChequeprocessingOperatingSessionRetrieveOutputModelChequeprocessingOperatingSessionInstanceAnalysis
 */
public class CRChequeprocessingOperatingSessionRetrieveOutputModelChequeprocessingOperatingSessionInstanceAnalysis   {
  private String chequeprocessingOperatingSessionInstanceAnalysisData = null;

  private String chequeprocessingOperatingSessionInstanceAnalysisReportType = null;

  private Object chequeprocessingOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return chequeprocessingOperatingSessionInstanceAnalysisData
  **/

  public String getChequeprocessingOperatingSessionInstanceAnalysisData() {
    return chequeprocessingOperatingSessionInstanceAnalysisData;
  }

  public void setChequeprocessingOperatingSessionInstanceAnalysisData(String chequeprocessingOperatingSessionInstanceAnalysisData) {
    this.chequeprocessingOperatingSessionInstanceAnalysisData = chequeprocessingOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return chequeprocessingOperatingSessionInstanceAnalysisReportType
  **/

  public String getChequeprocessingOperatingSessionInstanceAnalysisReportType() {
    return chequeprocessingOperatingSessionInstanceAnalysisReportType;
  }

  public void setChequeprocessingOperatingSessionInstanceAnalysisReportType(String chequeprocessingOperatingSessionInstanceAnalysisReportType) {
    this.chequeprocessingOperatingSessionInstanceAnalysisReportType = chequeprocessingOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return chequeprocessingOperatingSessionInstanceAnalysisReport
  **/

  public Object getChequeprocessingOperatingSessionInstanceAnalysisReport() {
    return chequeprocessingOperatingSessionInstanceAnalysisReport;
  }

  public void setChequeprocessingOperatingSessionInstanceAnalysisReport(Object chequeprocessingOperatingSessionInstanceAnalysisReport) {
    this.chequeprocessingOperatingSessionInstanceAnalysisReport = chequeprocessingOperatingSessionInstanceAnalysisReport;
  }


}

