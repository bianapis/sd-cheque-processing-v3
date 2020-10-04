package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCancelledChequeHandlingUpdateInputModel
 */
public class BQCancelledChequeHandlingUpdateInputModel   {
  private String chequeprocessingOperatingSessionInstanceReference = null;

  private String cancelledChequeHandlingInstanceReference = null;

  private String cancelledChequeHandlingPreconditions = null;

  private String cancelledChequeHandlingFunctionSchedule = null;

  private String cancelledChequeHandlingServiceType = null;

  private String cancelledChequeHandlingServiceDescription = null;

  private String cancelledChequeHandlingServiceInputsandOuputs = null;

  private String cancelledChequeHandlingServiceWorkProduct = null;

  private Object cancelledChequeHandlingUpdateActionTaskRecord = null;

  private String cancelledChequeHandlingUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Chequeprocessing Operating Session instance 
   * @return chequeprocessingOperatingSessionInstanceReference
  **/

  public String getChequeprocessingOperatingSessionInstanceReference() {
    return chequeprocessingOperatingSessionInstanceReference;
  }

  public void setChequeprocessingOperatingSessionInstanceReference(String chequeprocessingOperatingSessionInstanceReference) {
    this.chequeprocessingOperatingSessionInstanceReference = chequeprocessingOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cancelled Cheque Handling instance 
   * @return cancelledChequeHandlingInstanceReference
  **/

  public String getCancelledChequeHandlingInstanceReference() {
    return cancelledChequeHandlingInstanceReference;
  }

  public void setCancelledChequeHandlingInstanceReference(String cancelledChequeHandlingInstanceReference) {
    this.cancelledChequeHandlingInstanceReference = cancelledChequeHandlingInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return cancelledChequeHandlingUpdateActionTaskRecord
  **/

  public Object getCancelledChequeHandlingUpdateActionTaskRecord() {
    return cancelledChequeHandlingUpdateActionTaskRecord;
  }

  public void setCancelledChequeHandlingUpdateActionTaskRecord(Object cancelledChequeHandlingUpdateActionTaskRecord) {
    this.cancelledChequeHandlingUpdateActionTaskRecord = cancelledChequeHandlingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return cancelledChequeHandlingUpdateActionRequest
  **/

  public String getCancelledChequeHandlingUpdateActionRequest() {
    return cancelledChequeHandlingUpdateActionRequest;
  }

  public void setCancelledChequeHandlingUpdateActionRequest(String cancelledChequeHandlingUpdateActionRequest) {
    this.cancelledChequeHandlingUpdateActionRequest = cancelledChequeHandlingUpdateActionRequest;
  }


}

