package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRChequeprocessingOperatingSessionExchangeInputModelChequeprocessingOperatingSessionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionInitiationExchangeInputModel
 */
public class BQFinancialTransactionInitiationExchangeInputModel   {
  private String chequeprocessingOperatingSessionInstanceReference = null;

  private String financialTransactionInitiationInstanceReference = null;

  private String financialTransactionInitiationPreconditions = null;

  private String financialTransactionInitiationFunctionSchedule = null;

  private String financialTransactionInitiationServiceType = null;

  private String financialTransactionInitiationServiceDescription = null;

  private String financialTransactionInitiationServiceInputsandOuputs = null;

  private String financialTransactionInitiationServiceWorkProduct = null;

  private String financialTransactionInitiationServiceName = null;

  private Object financialTransactionInitiationExchangeActionTaskRecord = null;

  private CRChequeprocessingOperatingSessionExchangeInputModelChequeprocessingOperatingSessionExchangeActionRequest financialTransactionInitiationExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Transaction Initiation instance 
   * @return financialTransactionInitiationInstanceReference
  **/

  public String getFinancialTransactionInitiationInstanceReference() {
    return financialTransactionInitiationInstanceReference;
  }

  public void setFinancialTransactionInitiationInstanceReference(String financialTransactionInitiationInstanceReference) {
    this.financialTransactionInitiationInstanceReference = financialTransactionInitiationInstanceReference;
  }


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
   * Get financialTransactionInitiationExchangeActionRequest
   * @return financialTransactionInitiationExchangeActionRequest
  **/

  public CRChequeprocessingOperatingSessionExchangeInputModelChequeprocessingOperatingSessionExchangeActionRequest getFinancialTransactionInitiationExchangeActionRequest() {
    return financialTransactionInitiationExchangeActionRequest;
  }

  public void setFinancialTransactionInitiationExchangeActionRequest(CRChequeprocessingOperatingSessionExchangeInputModelChequeprocessingOperatingSessionExchangeActionRequest financialTransactionInitiationExchangeActionRequest) {
    this.financialTransactionInitiationExchangeActionRequest = financialTransactionInitiationExchangeActionRequest;
  }


}

