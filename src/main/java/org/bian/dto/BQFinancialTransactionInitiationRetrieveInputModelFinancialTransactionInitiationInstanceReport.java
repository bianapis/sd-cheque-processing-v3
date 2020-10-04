package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceReport
 */
public class BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceReport   {
  private String financialTransactionInitiationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialTransactionInitiationInstanceReportReference
  **/

  public String getFinancialTransactionInitiationInstanceReportReference() {
    return financialTransactionInitiationInstanceReportReference;
  }

  public void setFinancialTransactionInitiationInstanceReportReference(String financialTransactionInitiationInstanceReportReference) {
    this.financialTransactionInitiationInstanceReportReference = financialTransactionInitiationInstanceReportReference;
  }


}

