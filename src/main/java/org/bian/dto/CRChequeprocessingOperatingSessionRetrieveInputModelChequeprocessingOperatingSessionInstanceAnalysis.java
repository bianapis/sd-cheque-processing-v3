package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceAnalysis
 */
public class CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceAnalysis   {
  private String chequeprocessingOperatingSessionInstanceAnalysisReference = null;

  private String chequeprocessingOperatingSessionInstanceAnalysisReportType = null;

  private String chequeprocessingOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return chequeprocessingOperatingSessionInstanceAnalysisReference
  **/

  public String getChequeprocessingOperatingSessionInstanceAnalysisReference() {
    return chequeprocessingOperatingSessionInstanceAnalysisReference;
  }

  public void setChequeprocessingOperatingSessionInstanceAnalysisReference(String chequeprocessingOperatingSessionInstanceAnalysisReference) {
    this.chequeprocessingOperatingSessionInstanceAnalysisReference = chequeprocessingOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return chequeprocessingOperatingSessionInstanceAnalysisParameters
  **/

  public String getChequeprocessingOperatingSessionInstanceAnalysisParameters() {
    return chequeprocessingOperatingSessionInstanceAnalysisParameters;
  }

  public void setChequeprocessingOperatingSessionInstanceAnalysisParameters(String chequeprocessingOperatingSessionInstanceAnalysisParameters) {
    this.chequeprocessingOperatingSessionInstanceAnalysisParameters = chequeprocessingOperatingSessionInstanceAnalysisParameters;
  }


}

