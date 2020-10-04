package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequeExtractionRetrieveInputModelChequeExtractionInstanceReport
 */
public class BQChequeExtractionRetrieveInputModelChequeExtractionInstanceReport   {
  private String chequeExtractionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return chequeExtractionInstanceReportReference
  **/

  public String getChequeExtractionInstanceReportReference() {
    return chequeExtractionInstanceReportReference;
  }

  public void setChequeExtractionInstanceReportReference(String chequeExtractionInstanceReportReference) {
    this.chequeExtractionInstanceReportReference = chequeExtractionInstanceReportReference;
  }


}

