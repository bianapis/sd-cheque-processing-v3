package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceAnalysis;
import org.bian.dto.BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCancelledChequeHandlingRetrieveInputModel
 */
public class BQCancelledChequeHandlingRetrieveInputModel   {
  private Object cancelledChequeHandlingRetrieveActionTaskRecord = null;

  private String cancelledChequeHandlingRetrieveActionRequest = null;

  private BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceReport cancelledChequeHandlingInstanceReport = null;

  private BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceAnalysis cancelledChequeHandlingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cancelledChequeHandlingRetrieveActionTaskRecord
  **/

  public Object getCancelledChequeHandlingRetrieveActionTaskRecord() {
    return cancelledChequeHandlingRetrieveActionTaskRecord;
  }

  public void setCancelledChequeHandlingRetrieveActionTaskRecord(Object cancelledChequeHandlingRetrieveActionTaskRecord) {
    this.cancelledChequeHandlingRetrieveActionTaskRecord = cancelledChequeHandlingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return cancelledChequeHandlingRetrieveActionRequest
  **/

  public String getCancelledChequeHandlingRetrieveActionRequest() {
    return cancelledChequeHandlingRetrieveActionRequest;
  }

  public void setCancelledChequeHandlingRetrieveActionRequest(String cancelledChequeHandlingRetrieveActionRequest) {
    this.cancelledChequeHandlingRetrieveActionRequest = cancelledChequeHandlingRetrieveActionRequest;
  }


  /**
   * Get cancelledChequeHandlingInstanceReport
   * @return cancelledChequeHandlingInstanceReport
  **/

  public BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceReport getCancelledChequeHandlingInstanceReport() {
    return cancelledChequeHandlingInstanceReport;
  }

  public void setCancelledChequeHandlingInstanceReport(BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceReport cancelledChequeHandlingInstanceReport) {
    this.cancelledChequeHandlingInstanceReport = cancelledChequeHandlingInstanceReport;
  }


  /**
   * Get cancelledChequeHandlingInstanceAnalysis
   * @return cancelledChequeHandlingInstanceAnalysis
  **/

  public BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceAnalysis getCancelledChequeHandlingInstanceAnalysis() {
    return cancelledChequeHandlingInstanceAnalysis;
  }

  public void setCancelledChequeHandlingInstanceAnalysis(BQCancelledChequeHandlingRetrieveInputModelCancelledChequeHandlingInstanceAnalysis cancelledChequeHandlingInstanceAnalysis) {
    this.cancelledChequeHandlingInstanceAnalysis = cancelledChequeHandlingInstanceAnalysis;
  }


}

