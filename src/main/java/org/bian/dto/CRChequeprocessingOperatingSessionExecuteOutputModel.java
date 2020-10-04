package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChequeprocessingOperatingSessionExecuteOutputModel
 */
public class CRChequeprocessingOperatingSessionExecuteOutputModel   {
  private String chequeProcessingOperatingSessionReference = null;

  private String chequeProcessingOperatingSessionServiceProviderReference = null;

  private String chequeProcessingOperatingSessionType = null;

  private String chequeProcessingOperatingSessionServiceProviderSchedule = null;

  private String chequeProcessingOperatingSessionServiceType = null;

  private String chequeprocessingOperatingSessionExecuteActionTaskReference = null;

  private Object chequeprocessingOperatingSessionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Cheque Processing Operating Session 
   * @return chequeProcessingOperatingSessionReference
  **/

  public String getChequeProcessingOperatingSessionReference() {
    return chequeProcessingOperatingSessionReference;
  }

  public void setChequeProcessingOperatingSessionReference(String chequeProcessingOperatingSessionReference) {
    this.chequeProcessingOperatingSessionReference = chequeProcessingOperatingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who provides the services of Cheque Processing Operating Session  
   * @return chequeProcessingOperatingSessionServiceProviderReference
  **/

  public String getChequeProcessingOperatingSessionServiceProviderReference() {
    return chequeProcessingOperatingSessionServiceProviderReference;
  }

  public void setChequeProcessingOperatingSessionServiceProviderReference(String chequeProcessingOperatingSessionServiceProviderReference) {
    this.chequeProcessingOperatingSessionServiceProviderReference = chequeProcessingOperatingSessionServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of operations within Cheque Processing Operating Session  
   * @return chequeProcessingOperatingSessionType
  **/

  public String getChequeProcessingOperatingSessionType() {
    return chequeProcessingOperatingSessionType;
  }

  public void setChequeProcessingOperatingSessionType(String chequeProcessingOperatingSessionType) {
    this.chequeProcessingOperatingSessionType = chequeProcessingOperatingSessionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule according to which the service provider will operate the Cheque Processing Operating Session 
   * @return chequeProcessingOperatingSessionServiceProviderSchedule
  **/

  public String getChequeProcessingOperatingSessionServiceProviderSchedule() {
    return chequeProcessingOperatingSessionServiceProviderSchedule;
  }

  public void setChequeProcessingOperatingSessionServiceProviderSchedule(String chequeProcessingOperatingSessionServiceProviderSchedule) {
    this.chequeProcessingOperatingSessionServiceProviderSchedule = chequeProcessingOperatingSessionServiceProviderSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of services within Cheque Processing Operating Session  
   * @return chequeProcessingOperatingSessionServiceType
  **/

  public String getChequeProcessingOperatingSessionServiceType() {
    return chequeProcessingOperatingSessionServiceType;
  }

  public void setChequeProcessingOperatingSessionServiceType(String chequeProcessingOperatingSessionServiceType) {
    this.chequeProcessingOperatingSessionServiceType = chequeProcessingOperatingSessionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Chequeprocessing Operating Session instance execute service call 
   * @return chequeprocessingOperatingSessionExecuteActionTaskReference
  **/

  public String getChequeprocessingOperatingSessionExecuteActionTaskReference() {
    return chequeprocessingOperatingSessionExecuteActionTaskReference;
  }

  public void setChequeprocessingOperatingSessionExecuteActionTaskReference(String chequeprocessingOperatingSessionExecuteActionTaskReference) {
    this.chequeprocessingOperatingSessionExecuteActionTaskReference = chequeprocessingOperatingSessionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return chequeprocessingOperatingSessionExecuteActionTaskRecord
  **/

  public Object getChequeprocessingOperatingSessionExecuteActionTaskRecord() {
    return chequeprocessingOperatingSessionExecuteActionTaskRecord;
  }

  public void setChequeprocessingOperatingSessionExecuteActionTaskRecord(Object chequeprocessingOperatingSessionExecuteActionTaskRecord) {
    this.chequeprocessingOperatingSessionExecuteActionTaskRecord = chequeprocessingOperatingSessionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

