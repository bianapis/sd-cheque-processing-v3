package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceAnalysis;
import org.bian.dto.BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQChequeExtractionRetrieveOutputModel
 */
public class BQChequeExtractionRetrieveOutputModel   {
  private String chequeExtractionPreconditions = null;

  private String chequeExtractionFunctionSchedule = null;

  private String chequeExtractionServiceType = null;

  private String chequeExtractionServiceDescription = null;

  private String chequeExtractionServiceInputsandOuputs = null;

  private String chequeExtractionServiceWorkProduct = null;

  private String chequeExtractionServiceName = null;

  private String chequeExtractionRetrieveActionTaskReference = null;

  private Object chequeExtractionRetrieveActionTaskRecord = null;

  private String chequeExtractionRetrieveActionResponse = null;

  private BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceReport chequeExtractionInstanceReport = null;

  private BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceAnalysis chequeExtractionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the invocation of the feature 
   * @return chequeExtractionPreconditions
  **/

  public String getChequeExtractionPreconditions() {
    return chequeExtractionPreconditions;
  }

  public void setChequeExtractionPreconditions(String chequeExtractionPreconditions) {
    this.chequeExtractionPreconditions = chequeExtractionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the function 
   * @return chequeExtractionFunctionSchedule
  **/

  public String getChequeExtractionFunctionSchedule() {
    return chequeExtractionFunctionSchedule;
  }

  public void setChequeExtractionFunctionSchedule(String chequeExtractionFunctionSchedule) {
    this.chequeExtractionFunctionSchedule = chequeExtractionFunctionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return chequeExtractionServiceType
  **/

  public String getChequeExtractionServiceType() {
    return chequeExtractionServiceType;
  }

  public void setChequeExtractionServiceType(String chequeExtractionServiceType) {
    this.chequeExtractionServiceType = chequeExtractionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return chequeExtractionServiceDescription
  **/

  public String getChequeExtractionServiceDescription() {
    return chequeExtractionServiceDescription;
  }

  public void setChequeExtractionServiceDescription(String chequeExtractionServiceDescription) {
    this.chequeExtractionServiceDescription = chequeExtractionServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return chequeExtractionServiceInputsandOuputs
  **/

  public String getChequeExtractionServiceInputsandOuputs() {
    return chequeExtractionServiceInputsandOuputs;
  }

  public void setChequeExtractionServiceInputsandOuputs(String chequeExtractionServiceInputsandOuputs) {
    this.chequeExtractionServiceInputsandOuputs = chequeExtractionServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return chequeExtractionServiceWorkProduct
  **/

  public String getChequeExtractionServiceWorkProduct() {
    return chequeExtractionServiceWorkProduct;
  }

  public void setChequeExtractionServiceWorkProduct(String chequeExtractionServiceWorkProduct) {
    this.chequeExtractionServiceWorkProduct = chequeExtractionServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return chequeExtractionServiceName
  **/

  public String getChequeExtractionServiceName() {
    return chequeExtractionServiceName;
  }

  public void setChequeExtractionServiceName(String chequeExtractionServiceName) {
    this.chequeExtractionServiceName = chequeExtractionServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cheque Extraction instance retrieve service call 
   * @return chequeExtractionRetrieveActionTaskReference
  **/

  public String getChequeExtractionRetrieveActionTaskReference() {
    return chequeExtractionRetrieveActionTaskReference;
  }

  public void setChequeExtractionRetrieveActionTaskReference(String chequeExtractionRetrieveActionTaskReference) {
    this.chequeExtractionRetrieveActionTaskReference = chequeExtractionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return chequeExtractionRetrieveActionResponse
  **/

  public String getChequeExtractionRetrieveActionResponse() {
    return chequeExtractionRetrieveActionResponse;
  }

  public void setChequeExtractionRetrieveActionResponse(String chequeExtractionRetrieveActionResponse) {
    this.chequeExtractionRetrieveActionResponse = chequeExtractionRetrieveActionResponse;
  }


  /**
   * Get chequeExtractionInstanceReport
   * @return chequeExtractionInstanceReport
  **/

  public BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceReport getChequeExtractionInstanceReport() {
    return chequeExtractionInstanceReport;
  }

  public void setChequeExtractionInstanceReport(BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceReport chequeExtractionInstanceReport) {
    this.chequeExtractionInstanceReport = chequeExtractionInstanceReport;
  }


  /**
   * Get chequeExtractionInstanceAnalysis
   * @return chequeExtractionInstanceAnalysis
  **/

  public BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceAnalysis getChequeExtractionInstanceAnalysis() {
    return chequeExtractionInstanceAnalysis;
  }

  public void setChequeExtractionInstanceAnalysis(BQChequeExtractionRetrieveOutputModelChequeExtractionInstanceAnalysis chequeExtractionInstanceAnalysis) {
    this.chequeExtractionInstanceAnalysis = chequeExtractionInstanceAnalysis;
  }


}

