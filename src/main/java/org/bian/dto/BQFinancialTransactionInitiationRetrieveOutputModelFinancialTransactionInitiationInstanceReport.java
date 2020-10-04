package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceReport
 */
public class BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceReport   {
  private Object financialTransactionInitiationInstanceReportRecord = null;

  private String financialTransactionInitiationInstanceReportType = null;

  private String financialTransactionInitiationInstanceReportParameters = null;

  private Object financialTransactionInitiationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialTransactionInitiationInstanceReportRecord
  **/

  public Object getFinancialTransactionInitiationInstanceReportRecord() {
    return financialTransactionInitiationInstanceReportRecord;
  }

  public void setFinancialTransactionInitiationInstanceReportRecord(Object financialTransactionInitiationInstanceReportRecord) {
    this.financialTransactionInitiationInstanceReportRecord = financialTransactionInitiationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialTransactionInitiationInstanceReportType
  **/

  public String getFinancialTransactionInitiationInstanceReportType() {
    return financialTransactionInitiationInstanceReportType;
  }

  public void setFinancialTransactionInitiationInstanceReportType(String financialTransactionInitiationInstanceReportType) {
    this.financialTransactionInitiationInstanceReportType = financialTransactionInitiationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialTransactionInitiationInstanceReportParameters
  **/

  public String getFinancialTransactionInitiationInstanceReportParameters() {
    return financialTransactionInitiationInstanceReportParameters;
  }

  public void setFinancialTransactionInitiationInstanceReportParameters(String financialTransactionInitiationInstanceReportParameters) {
    this.financialTransactionInitiationInstanceReportParameters = financialTransactionInitiationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialTransactionInitiationInstanceReport
  **/

  public Object getFinancialTransactionInitiationInstanceReport() {
    return financialTransactionInitiationInstanceReport;
  }

  public void setFinancialTransactionInitiationInstanceReport(Object financialTransactionInitiationInstanceReport) {
    this.financialTransactionInitiationInstanceReport = financialTransactionInitiationInstanceReport;
  }


}

