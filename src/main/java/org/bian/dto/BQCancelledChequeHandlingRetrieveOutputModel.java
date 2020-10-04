package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceAnalysis;
import org.bian.dto.BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCancelledChequeHandlingRetrieveOutputModel
 */
public class BQCancelledChequeHandlingRetrieveOutputModel   {
  private String cancelledChequeHandlingPreconditions = null;

  private String cancelledChequeHandlingFunctionSchedule = null;

  private String cancelledChequeHandlingServiceType = null;

  private String cancelledChequeHandlingServiceDescription = null;

  private String cancelledChequeHandlingServiceInputsandOuputs = null;

  private String cancelledChequeHandlingServiceWorkProduct = null;

  private String cancelledChequeHandlingRetrieveActionTaskReference = null;

  private Object cancelledChequeHandlingRetrieveActionTaskRecord = null;

  private String cancelledChequeHandlingRetrieveActionResponse = null;

  private BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceReport cancelledChequeHandlingInstanceReport = null;

  private BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceAnalysis cancelledChequeHandlingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return cancelledChequeHandlingPreconditions
  **/

  public String getCancelledChequeHandlingPreconditions() {
    return cancelledChequeHandlingPreconditions;
  }

  public void setCancelledChequeHandlingPreconditions(String cancelledChequeHandlingPreconditions) {
    this.cancelledChequeHandlingPreconditions = cancelledChequeHandlingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return cancelledChequeHandlingFunctionSchedule
  **/

  public String getCancelledChequeHandlingFunctionSchedule() {
    return cancelledChequeHandlingFunctionSchedule;
  }

  public void setCancelledChequeHandlingFunctionSchedule(String cancelledChequeHandlingFunctionSchedule) {
    this.cancelledChequeHandlingFunctionSchedule = cancelledChequeHandlingFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return cancelledChequeHandlingServiceType
  **/

  public String getCancelledChequeHandlingServiceType() {
    return cancelledChequeHandlingServiceType;
  }

  public void setCancelledChequeHandlingServiceType(String cancelledChequeHandlingServiceType) {
    this.cancelledChequeHandlingServiceType = cancelledChequeHandlingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return cancelledChequeHandlingServiceDescription
  **/

  public String getCancelledChequeHandlingServiceDescription() {
    return cancelledChequeHandlingServiceDescription;
  }

  public void setCancelledChequeHandlingServiceDescription(String cancelledChequeHandlingServiceDescription) {
    this.cancelledChequeHandlingServiceDescription = cancelledChequeHandlingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return cancelledChequeHandlingServiceInputsandOuputs
  **/

  public String getCancelledChequeHandlingServiceInputsandOuputs() {
    return cancelledChequeHandlingServiceInputsandOuputs;
  }

  public void setCancelledChequeHandlingServiceInputsandOuputs(String cancelledChequeHandlingServiceInputsandOuputs) {
    this.cancelledChequeHandlingServiceInputsandOuputs = cancelledChequeHandlingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return cancelledChequeHandlingServiceWorkProduct
  **/

  public String getCancelledChequeHandlingServiceWorkProduct() {
    return cancelledChequeHandlingServiceWorkProduct;
  }

  public void setCancelledChequeHandlingServiceWorkProduct(String cancelledChequeHandlingServiceWorkProduct) {
    this.cancelledChequeHandlingServiceWorkProduct = cancelledChequeHandlingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cancelled Cheque Handling instance retrieve service call 
   * @return cancelledChequeHandlingRetrieveActionTaskReference
  **/

  public String getCancelledChequeHandlingRetrieveActionTaskReference() {
    return cancelledChequeHandlingRetrieveActionTaskReference;
  }

  public void setCancelledChequeHandlingRetrieveActionTaskReference(String cancelledChequeHandlingRetrieveActionTaskReference) {
    this.cancelledChequeHandlingRetrieveActionTaskReference = cancelledChequeHandlingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cancelledChequeHandlingRetrieveActionResponse
  **/

  public String getCancelledChequeHandlingRetrieveActionResponse() {
    return cancelledChequeHandlingRetrieveActionResponse;
  }

  public void setCancelledChequeHandlingRetrieveActionResponse(String cancelledChequeHandlingRetrieveActionResponse) {
    this.cancelledChequeHandlingRetrieveActionResponse = cancelledChequeHandlingRetrieveActionResponse;
  }


  /**
   * Get cancelledChequeHandlingInstanceReport
   * @return cancelledChequeHandlingInstanceReport
  **/

  public BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceReport getCancelledChequeHandlingInstanceReport() {
    return cancelledChequeHandlingInstanceReport;
  }

  public void setCancelledChequeHandlingInstanceReport(BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceReport cancelledChequeHandlingInstanceReport) {
    this.cancelledChequeHandlingInstanceReport = cancelledChequeHandlingInstanceReport;
  }


  /**
   * Get cancelledChequeHandlingInstanceAnalysis
   * @return cancelledChequeHandlingInstanceAnalysis
  **/

  public BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceAnalysis getCancelledChequeHandlingInstanceAnalysis() {
    return cancelledChequeHandlingInstanceAnalysis;
  }

  public void setCancelledChequeHandlingInstanceAnalysis(BQCancelledChequeHandlingRetrieveOutputModelCancelledChequeHandlingInstanceAnalysis cancelledChequeHandlingInstanceAnalysis) {
    this.cancelledChequeHandlingInstanceAnalysis = cancelledChequeHandlingInstanceAnalysis;
  }


}

