package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceAnalysis;
import org.bian.dto.CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRChequeprocessingOperatingSessionRetrieveInputModel
 */
public class CRChequeprocessingOperatingSessionRetrieveInputModel   {
  private Object chequeprocessingOperatingSessionRetrieveActionTaskRecord = null;

  private String chequeprocessingOperatingSessionRetrieveActionRequest = null;

  private CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceReportRecord chequeprocessingOperatingSessionInstanceReportRecord = null;

  private CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceAnalysis chequeprocessingOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return chequeprocessingOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getChequeprocessingOperatingSessionRetrieveActionTaskRecord() {
    return chequeprocessingOperatingSessionRetrieveActionTaskRecord;
  }

  public void setChequeprocessingOperatingSessionRetrieveActionTaskRecord(Object chequeprocessingOperatingSessionRetrieveActionTaskRecord) {
    this.chequeprocessingOperatingSessionRetrieveActionTaskRecord = chequeprocessingOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return chequeprocessingOperatingSessionRetrieveActionRequest
  **/

  public String getChequeprocessingOperatingSessionRetrieveActionRequest() {
    return chequeprocessingOperatingSessionRetrieveActionRequest;
  }

  public void setChequeprocessingOperatingSessionRetrieveActionRequest(String chequeprocessingOperatingSessionRetrieveActionRequest) {
    this.chequeprocessingOperatingSessionRetrieveActionRequest = chequeprocessingOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get chequeprocessingOperatingSessionInstanceReportRecord
   * @return chequeprocessingOperatingSessionInstanceReportRecord
  **/

  public CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceReportRecord getChequeprocessingOperatingSessionInstanceReportRecord() {
    return chequeprocessingOperatingSessionInstanceReportRecord;
  }

  public void setChequeprocessingOperatingSessionInstanceReportRecord(CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceReportRecord chequeprocessingOperatingSessionInstanceReportRecord) {
    this.chequeprocessingOperatingSessionInstanceReportRecord = chequeprocessingOperatingSessionInstanceReportRecord;
  }


  /**
   * Get chequeprocessingOperatingSessionInstanceAnalysis
   * @return chequeprocessingOperatingSessionInstanceAnalysis
  **/

  public CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceAnalysis getChequeprocessingOperatingSessionInstanceAnalysis() {
    return chequeprocessingOperatingSessionInstanceAnalysis;
  }

  public void setChequeprocessingOperatingSessionInstanceAnalysis(CRChequeprocessingOperatingSessionRetrieveInputModelChequeprocessingOperatingSessionInstanceAnalysis chequeprocessingOperatingSessionInstanceAnalysis) {
    this.chequeprocessingOperatingSessionInstanceAnalysis = chequeprocessingOperatingSessionInstanceAnalysis;
  }


}

