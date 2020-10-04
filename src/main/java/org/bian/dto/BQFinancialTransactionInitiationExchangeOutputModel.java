package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionInitiationExchangeOutputModel
 */
public class BQFinancialTransactionInitiationExchangeOutputModel   {
  private String financialTransactionInitiationPreconditions = null;

  private String financialTransactionInitiationFunctionSchedule = null;

  private String financialTransactionInitiationServiceType = null;

  private String financialTransactionInitiationServiceDescription = null;

  private String financialTransactionInitiationServiceInputsandOuputs = null;

  private String financialTransactionInitiationServiceWorkProduct = null;

  private String financialTransactionInitiationServiceName = null;

  private String financialTransactionInitiationExchangeActionTaskReference = null;

  private Object financialTransactionInitiationExchangeActionTaskRecord = null;

  private String financialTransactionInitiationExchangeActionResponse = null;

  private String financialTransactionInitiationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return financialTransactionInitiationPreconditions
  **/

  public String getFinancialTransactionInitiationPreconditions() {
    return financialTransactionInitiationPreconditions;
  }

  public void setFinancialTransactionInitiationPreconditions(String financialTransactionInitiationPreconditions) {
    this.financialTransactionInitiationPreconditions = financialTransactionInitiationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return financialTransactionInitiationFunctionSchedule
  **/

  public String getFinancialTransactionInitiationFunctionSchedule() {
    return financialTransactionInitiationFunctionSchedule;
  }

  public void setFinancialTransactionInitiationFunctionSchedule(String financialTransactionInitiationFunctionSchedule) {
    this.financialTransactionInitiationFunctionSchedule = financialTransactionInitiationFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return financialTransactionInitiationServiceType
  **/

  public String getFinancialTransactionInitiationServiceType() {
    return financialTransactionInitiationServiceType;
  }

  public void setFinancialTransactionInitiationServiceType(String financialTransactionInitiationServiceType) {
    this.financialTransactionInitiationServiceType = financialTransactionInitiationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return financialTransactionInitiationServiceDescription
  **/

  public String getFinancialTransactionInitiationServiceDescription() {
    return financialTransactionInitiationServiceDescription;
  }

  public void setFinancialTransactionInitiationServiceDescription(String financialTransactionInitiationServiceDescription) {
    this.financialTransactionInitiationServiceDescription = financialTransactionInitiationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return financialTransactionInitiationServiceInputsandOuputs
  **/

  public String getFinancialTransactionInitiationServiceInputsandOuputs() {
    return financialTransactionInitiationServiceInputsandOuputs;
  }

  public void setFinancialTransactionInitiationServiceInputsandOuputs(String financialTransactionInitiationServiceInputsandOuputs) {
    this.financialTransactionInitiationServiceInputsandOuputs = financialTransactionInitiationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return financialTransactionInitiationServiceWorkProduct
  **/

  public String getFinancialTransactionInitiationServiceWorkProduct() {
    return financialTransactionInitiationServiceWorkProduct;
  }

  public void setFinancialTransactionInitiationServiceWorkProduct(String financialTransactionInitiationServiceWorkProduct) {
    this.financialTransactionInitiationServiceWorkProduct = financialTransactionInitiationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return financialTransactionInitiationServiceName
  **/

  public String getFinancialTransactionInitiationServiceName() {
    return financialTransactionInitiationServiceName;
  }

  public void setFinancialTransactionInitiationServiceName(String financialTransactionInitiationServiceName) {
    this.financialTransactionInitiationServiceName = financialTransactionInitiationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Transaction Initiation instance exchange service call 
   * @return financialTransactionInitiationExchangeActionTaskReference
  **/

  public String getFinancialTransactionInitiationExchangeActionTaskReference() {
    return financialTransactionInitiationExchangeActionTaskReference;
  }

  public void setFinancialTransactionInitiationExchangeActionTaskReference(String financialTransactionInitiationExchangeActionTaskReference) {
    this.financialTransactionInitiationExchangeActionTaskReference = financialTransactionInitiationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return financialTransactionInitiationExchangeActionTaskRecord
  **/

  public Object getFinancialTransactionInitiationExchangeActionTaskRecord() {
    return financialTransactionInitiationExchangeActionTaskRecord;
  }

  public void setFinancialTransactionInitiationExchangeActionTaskRecord(Object financialTransactionInitiationExchangeActionTaskRecord) {
    this.financialTransactionInitiationExchangeActionTaskRecord = financialTransactionInitiationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return financialTransactionInitiationExchangeActionResponse
  **/

  public String getFinancialTransactionInitiationExchangeActionResponse() {
    return financialTransactionInitiationExchangeActionResponse;
  }

  public void setFinancialTransactionInitiationExchangeActionResponse(String financialTransactionInitiationExchangeActionResponse) {
    this.financialTransactionInitiationExchangeActionResponse = financialTransactionInitiationExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Transaction Initiation instance (e.g. accepted, rejected, verified) 
   * @return financialTransactionInitiationInstanceStatus
  **/

  public String getFinancialTransactionInitiationInstanceStatus() {
    return financialTransactionInitiationInstanceStatus;
  }

  public void setFinancialTransactionInitiationInstanceStatus(String financialTransactionInitiationInstanceStatus) {
    this.financialTransactionInitiationInstanceStatus = financialTransactionInitiationInstanceStatus;
  }


}

