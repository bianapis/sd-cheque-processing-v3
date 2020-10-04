package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChequeprocessingOperatingSessionRequestOutputModel
 */
public class CRChequeprocessingOperatingSessionRequestOutputModel   {
  private String chequeProcessingOperatingSessionReference = null;

  private String chequeProcessingOperatingSessionServiceProviderReference = null;

  private String chequeProcessingOperatingSessionType = null;

  private String chequeProcessingOperatingSessionServiceProviderSchedule = null;

  private String chequeProcessingOperatingSessionServiceType = null;

  private String chequeprocessingOperatingSessionRequestActionTaskReference = null;

  private Object chequeprocessingOperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Chequeprocessing Operating Session instance request service call 
   * @return chequeprocessingOperatingSessionRequestActionTaskReference
  **/

  public String getChequeprocessingOperatingSessionRequestActionTaskReference() {
    return chequeprocessingOperatingSessionRequestActionTaskReference;
  }

  public void setChequeprocessingOperatingSessionRequestActionTaskReference(String chequeprocessingOperatingSessionRequestActionTaskReference) {
    this.chequeprocessingOperatingSessionRequestActionTaskReference = chequeprocessingOperatingSessionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return chequeprocessingOperatingSessionRequestActionTaskRecord
  **/

  public Object getChequeprocessingOperatingSessionRequestActionTaskRecord() {
    return chequeprocessingOperatingSessionRequestActionTaskRecord;
  }

  public void setChequeprocessingOperatingSessionRequestActionTaskRecord(Object chequeprocessingOperatingSessionRequestActionTaskRecord) {
    this.chequeprocessingOperatingSessionRequestActionTaskRecord = chequeprocessingOperatingSessionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

