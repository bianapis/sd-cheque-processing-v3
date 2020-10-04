package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceAnalysis;
import org.bian.dto.BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFinancialTransactionInitiationRetrieveOutputModel
 */
public class BQFinancialTransactionInitiationRetrieveOutputModel   {
  private String financialTransactionInitiationPreconditions = null;

  private String financialTransactionInitiationFunctionSchedule = null;

  private String financialTransactionInitiationServiceType = null;

  private String financialTransactionInitiationServiceDescription = null;

  private String financialTransactionInitiationServiceInputsandOuputs = null;

  private String financialTransactionInitiationServiceWorkProduct = null;

  private String financialTransactionInitiationServiceName = null;

  private String financialTransactionInitiationRetrieveActionTaskReference = null;

  private Object financialTransactionInitiationRetrieveActionTaskRecord = null;

  private String financialTransactionInitiationRetrieveActionResponse = null;

  private BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceReport financialTransactionInitiationInstanceReport = null;

  private BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceAnalysis financialTransactionInitiationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Transaction Initiation instance retrieve service call 
   * @return financialTransactionInitiationRetrieveActionTaskReference
  **/

  public String getFinancialTransactionInitiationRetrieveActionTaskReference() {
    return financialTransactionInitiationRetrieveActionTaskReference;
  }

  public void setFinancialTransactionInitiationRetrieveActionTaskReference(String financialTransactionInitiationRetrieveActionTaskReference) {
    this.financialTransactionInitiationRetrieveActionTaskReference = financialTransactionInitiationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialTransactionInitiationRetrieveActionTaskRecord
  **/

  public Object getFinancialTransactionInitiationRetrieveActionTaskRecord() {
    return financialTransactionInitiationRetrieveActionTaskRecord;
  }

  public void setFinancialTransactionInitiationRetrieveActionTaskRecord(Object financialTransactionInitiationRetrieveActionTaskRecord) {
    this.financialTransactionInitiationRetrieveActionTaskRecord = financialTransactionInitiationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialTransactionInitiationRetrieveActionResponse
  **/

  public String getFinancialTransactionInitiationRetrieveActionResponse() {
    return financialTransactionInitiationRetrieveActionResponse;
  }

  public void setFinancialTransactionInitiationRetrieveActionResponse(String financialTransactionInitiationRetrieveActionResponse) {
    this.financialTransactionInitiationRetrieveActionResponse = financialTransactionInitiationRetrieveActionResponse;
  }


  /**
   * Get financialTransactionInitiationInstanceReport
   * @return financialTransactionInitiationInstanceReport
  **/

  public BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceReport getFinancialTransactionInitiationInstanceReport() {
    return financialTransactionInitiationInstanceReport;
  }

  public void setFinancialTransactionInitiationInstanceReport(BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceReport financialTransactionInitiationInstanceReport) {
    this.financialTransactionInitiationInstanceReport = financialTransactionInitiationInstanceReport;
  }


  /**
   * Get financialTransactionInitiationInstanceAnalysis
   * @return financialTransactionInitiationInstanceAnalysis
  **/

  public BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceAnalysis getFinancialTransactionInitiationInstanceAnalysis() {
    return financialTransactionInitiationInstanceAnalysis;
  }

  public void setFinancialTransactionInitiationInstanceAnalysis(BQFinancialTransactionInitiationRetrieveOutputModelFinancialTransactionInitiationInstanceAnalysis financialTransactionInitiationInstanceAnalysis) {
    this.financialTransactionInitiationInstanceAnalysis = financialTransactionInitiationInstanceAnalysis;
  }


}

