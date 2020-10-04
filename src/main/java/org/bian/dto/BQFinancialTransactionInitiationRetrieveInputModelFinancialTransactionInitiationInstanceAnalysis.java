package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceAnalysis
 */
public class BQFinancialTransactionInitiationRetrieveInputModelFinancialTransactionInitiationInstanceAnalysis   {
  private String financialTransactionInitiationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialTransactionInitiationInstanceAnalysisReference
  **/

  public String getFinancialTransactionInitiationInstanceAnalysisReference() {
    return financialTransactionInitiationInstanceAnalysisReference;
  }

  public void setFinancialTransactionInitiationInstanceAnalysisReference(String financialTransactionInitiationInstanceAnalysisReference) {
    this.financialTransactionInitiationInstanceAnalysisReference = financialTransactionInitiationInstanceAnalysisReference;
  }


}

