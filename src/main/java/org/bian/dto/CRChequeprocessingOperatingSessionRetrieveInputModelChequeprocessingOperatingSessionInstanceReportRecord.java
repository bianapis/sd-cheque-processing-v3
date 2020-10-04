package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceReportRecord
 */
public class CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceReportRecord   {
  private String chequeprocessingOperatingSessionInstanceReportReference = null;

  private String chequeprocessingOperatingSessionInstanceReportType = null;

  private String chequeprocessingOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return chequeprocessingOperatingSessionInstanceReportReference
  **/

  public String getChequeprocessingOperatingSessionInstanceReportReference() {
    return chequeprocessingOperatingSessionInstanceReportReference;
  }

  public void setChequeprocessingOperatingSessionInstanceReportReference(String chequeprocessingOperatingSessionInstanceReportReference) {
    this.chequeprocessingOperatingSessionInstanceReportReference = chequeprocessingOperatingSessionInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return chequeprocessingOperatingSessionInstanceReportParameters
  **/

  public String getChequeprocessingOperatingSessionInstanceReportParameters() {
    return chequeprocessingOperatingSessionInstanceReportParameters;
  }

  public void setChequeprocessingOperatingSessionInstanceReportParameters(String chequeprocessingOperatingSessionInstanceReportParameters) {
    this.chequeprocessingOperatingSessionInstanceReportParameters = chequeprocessingOperatingSessionInstanceReportParameters;
  }


}

