package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceReport
 */
public class BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceReport   {
  private Object cancelledChequeHandlingInstanceReportRecord = null;

  private String cancelledChequeHandlingInstanceReportType = null;

  private String cancelledChequeHandlingInstanceReportParameters = null;

  private Object cancelledChequeHandlingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return cancelledChequeHandlingInstanceReportRecord
  **/

  public Object getCancelledChequeHandlingInstanceReportRecord() {
    return cancelledChequeHandlingInstanceReportRecord;
  }

  public void setCancelledChequeHandlingInstanceReportRecord(Object cancelledChequeHandlingInstanceReportRecord) {
    this.cancelledChequeHandlingInstanceReportRecord = cancelledChequeHandlingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return cancelledChequeHandlingInstanceReportType
  **/

  public String getCancelledChequeHandlingInstanceReportType() {
    return cancelledChequeHandlingInstanceReportType;
  }

  public void setCancelledChequeHandlingInstanceReportType(String cancelledChequeHandlingInstanceReportType) {
    this.cancelledChequeHandlingInstanceReportType = cancelledChequeHandlingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return cancelledChequeHandlingInstanceReportParameters
  **/

  public String getCancelledChequeHandlingInstanceReportParameters() {
    return cancelledChequeHandlingInstanceReportParameters;
  }

  public void setCancelledChequeHandlingInstanceReportParameters(String cancelledChequeHandlingInstanceReportParameters) {
    this.cancelledChequeHandlingInstanceReportParameters = cancelledChequeHandlingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return cancelledChequeHandlingInstanceReport
  **/

  public Object getCancelledChequeHandlingInstanceReport() {
    return cancelledChequeHandlingInstanceReport;
  }

  public void setCancelledChequeHandlingInstanceReport(Object cancelledChequeHandlingInstanceReport) {
    this.cancelledChequeHandlingInstanceReport = cancelledChequeHandlingInstanceReport;
  }


}

