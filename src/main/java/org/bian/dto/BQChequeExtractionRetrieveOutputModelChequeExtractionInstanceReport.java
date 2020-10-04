package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceReport
 */
public class BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceReport   {
  private Object chequeExtractionInstanceReportRecord = null;

  private String chequeExtractionInstanceReportType = null;

  private String chequeExtractionInstanceReportParameters = null;

  private Object chequeExtractionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return chequeExtractionInstanceReportRecord
  **/

  public Object getChequeExtractionInstanceReportRecord() {
    return chequeExtractionInstanceReportRecord;
  }

  public void setChequeExtractionInstanceReportRecord(Object chequeExtractionInstanceReportRecord) {
    this.chequeExtractionInstanceReportRecord = chequeExtractionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return chequeExtractionInstanceReportType
  **/

  public String getChequeExtractionInstanceReportType() {
    return chequeExtractionInstanceReportType;
  }

  public void setChequeExtractionInstanceReportType(String chequeExtractionInstanceReportType) {
    this.chequeExtractionInstanceReportType = chequeExtractionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return chequeExtractionInstanceReportParameters
  **/

  public String getChequeExtractionInstanceReportParameters() {
    return chequeExtractionInstanceReportParameters;
  }

  public void setChequeExtractionInstanceReportParameters(String chequeExtractionInstanceReportParameters) {
    this.chequeExtractionInstanceReportParameters = chequeExtractionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return chequeExtractionInstanceReport
  **/

  public Object getChequeExtractionInstanceReport() {
    return chequeExtractionInstanceReport;
  }

  public void setChequeExtractionInstanceReport(Object chequeExtractionInstanceReport) {
    this.chequeExtractionInstanceReport = chequeExtractionInstanceReport;
  }


}

