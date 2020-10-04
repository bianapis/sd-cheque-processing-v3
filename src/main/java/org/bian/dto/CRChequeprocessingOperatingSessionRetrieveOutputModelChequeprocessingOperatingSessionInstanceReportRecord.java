package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChequeprocessingOperatingSessionRetrieveOutputModelChequeprocessingOperatingSessionInstanceReportRecord
 */
public class CRChequeprocessingOperatingSessionRetrieveOutputModelChequeprocessingOperatingSessionInstanceReportRecord   {
  private String chequeprocessingOperatingSessionInstanceReportData = null;

  private String chequeprocessingOperatingSessionInstanceReportType = null;

  private Object chequeprocessingOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return chequeprocessingOperatingSessionInstanceReportData
  **/

  public String getChequeprocessingOperatingSessionInstanceReportData() {
    return chequeprocessingOperatingSessionInstanceReportData;
  }

  public void setChequeprocessingOperatingSessionInstanceReportData(String chequeprocessingOperatingSessionInstanceReportData) {
    this.chequeprocessingOperatingSessionInstanceReportData = chequeprocessingOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return chequeprocessingOperatingSessionInstanceReportType
  **/

  public String getChequeprocessingOperatingSessionInstanceReportType() {
    return chequeprocessingOperatingSessionInstanceReportType;
  }

  public void setChequeprocessingOperatingSessionInstanceReportType(String chequeprocessingOperatingSessionInstanceReportType) {
    this.chequeprocessingOperatingSessionInstanceReportType = chequeprocessingOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return chequeprocessingOperatingSessionInstanceReport
  **/

  public Object getChequeprocessingOperatingSessionInstanceReport() {
    return chequeprocessingOperatingSessionInstanceReport;
  }

  public void setChequeprocessingOperatingSessionInstanceReport(Object chequeprocessingOperatingSessionInstanceReport) {
    this.chequeprocessingOperatingSessionInstanceReport = chequeprocessingOperatingSessionInstanceReport;
  }


}

