package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChequeExtractionRetrieveInputModelChequeExtractionInstanceAnalysis;
import org.bian.dto.BQChequeExtractionRetrieveInputModelChequeExtractionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQChequeExtractionRetrieveInputModel
 */
public class BQChequeExtractionRetrieveInputModel   {
  private Object chequeExtractionRetrieveActionTaskRecord = null;

  private String chequeExtractionRetrieveActionRequest = null;

  private BQChequeExtractionRetrieveInputModelChequeExtractionInstanceReport chequeExtractionInstanceReport = null;

  private BQChequeExtractionRetrieveInputModelChequeExtractionInstanceAnalysis chequeExtractionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return chequeExtractionRetrieveActionTaskRecord
  **/

  public Object getChequeExtractionRetrieveActionTaskRecord() {
    return chequeExtractionRetrieveActionTaskRecord;
  }

  public void setChequeExtractionRetrieveActionTaskRecord(Object chequeExtractionRetrieveActionTaskRecord) {
    this.chequeExtractionRetrieveActionTaskRecord = chequeExtractionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return chequeExtractionRetrieveActionRequest
  **/

  public String getChequeExtractionRetrieveActionRequest() {
    return chequeExtractionRetrieveActionRequest;
  }

  public void setChequeExtractionRetrieveActionRequest(String chequeExtractionRetrieveActionRequest) {
    this.chequeExtractionRetrieveActionRequest = chequeExtractionRetrieveActionRequest;
  }


  /**
   * Get chequeExtractionInstanceReport
   * @return chequeExtractionInstanceReport
  **/

  public BQChequeExtractionRetrieveInputModelChequeExtractionInstanceReport getChequeExtractionInstanceReport() {
    return chequeExtractionInstanceReport;
  }

  public void setChequeExtractionInstanceReport(BQChequeExtractionRetrieveInputModelChequeExtractionInstanceReport chequeExtractionInstanceReport) {
    this.chequeExtractionInstanceReport = chequeExtractionInstanceReport;
  }


  /**
   * Get chequeExtractionInstanceAnalysis
   * @return chequeExtractionInstanceAnalysis
  **/

  public BQChequeExtractionRetrieveInputModelChequeExtractionInstanceAnalysis getChequeExtractionInstanceAnalysis() {
    return chequeExtractionInstanceAnalysis;
  }

  public void setChequeExtractionInstanceAnalysis(BQChequeExtractionRetrieveInputModelChequeExtractionInstanceAnalysis chequeExtractionInstanceAnalysis) {
    this.chequeExtractionInstanceAnalysis = chequeExtractionInstanceAnalysis;
  }


}

