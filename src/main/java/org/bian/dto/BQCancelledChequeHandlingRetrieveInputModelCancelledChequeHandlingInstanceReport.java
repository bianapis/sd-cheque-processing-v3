package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceReport
 */
public class BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceReport   {
  private String cancelledChequeHandlingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return cancelledChequeHandlingInstanceReportReference
  **/

  public String getCancelledChequeHandlingInstanceReportReference() {
    return cancelledChequeHandlingInstanceReportReference;
  }

  public void setCancelledChequeHandlingInstanceReportReference(String cancelledChequeHandlingInstanceReportReference) {
    this.cancelledChequeHandlingInstanceReportReference = cancelledChequeHandlingInstanceReportReference;
  }


}

