package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRChequeprocessingOperatingSessionInitiateInputModel
 */
public class CRChequeprocessingOperatingSessionInitiateInputModel   {
  private String chequeProcessingServicingSessionReference = null;

  private Object chequeprocessingOperatingSessionInitiateActionRecord = null;

  private String chequeprocessingOperatingSessionInstanceStatus = null;

  private String chequeProcessingOperatingSessionSchedule = null;

  private String chequeProcessingOperatingSessionStatus = null;

  private String chequeProcessingOperatingSessionUsageLog = null;

  private String chequeProcessingOperatingSessionReference = null;

  private String chequeProcessingOperatingSessionServiceProviderReference = null;

  private String chequeProcessingOperatingSessionType = null;

  private String chequeProcessingOperatingSessionServiceProviderSchedule = null;

  private String chequeProcessingOperatingSessionServiceType = null;

  private String chequeProcessingOperatingSessionServiceConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return chequeProcessingServicingSessionReference
  **/

  public String getChequeProcessingServicingSessionReference() {
    return chequeProcessingServicingSessionReference;
  }

  public void setChequeProcessingServicingSessionReference(String chequeProcessingServicingSessionReference) {
    this.chequeProcessingServicingSessionReference = chequeProcessingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return chequeprocessingOperatingSessionInitiateActionRecord
  **/

  public Object getChequeprocessingOperatingSessionInitiateActionRecord() {
    return chequeprocessingOperatingSessionInitiateActionRecord;
  }

  public void setChequeprocessingOperatingSessionInitiateActionRecord(Object chequeprocessingOperatingSessionInitiateActionRecord) {
    this.chequeprocessingOperatingSessionInitiateActionRecord = chequeprocessingOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Chequeprocessing Operating Session instance (e.g. initialised, pending, active) 
   * @return chequeprocessingOperatingSessionInstanceStatus
  **/

  public String getChequeprocessingOperatingSessionInstanceStatus() {
    return chequeprocessingOperatingSessionInstanceStatus;
  }

  public void setChequeprocessingOperatingSessionInstanceStatus(String chequeprocessingOperatingSessionInstanceStatus) {
    this.chequeprocessingOperatingSessionInstanceStatus = chequeprocessingOperatingSessionInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timetable of Cheque Processing Operating Session 
   * @return chequeProcessingOperatingSessionSchedule
  **/

  public String getChequeProcessingOperatingSessionSchedule() {
    return chequeProcessingOperatingSessionSchedule;
  }

  public void setChequeProcessingOperatingSessionSchedule(String chequeProcessingOperatingSessionSchedule) {
    this.chequeProcessingOperatingSessionSchedule = chequeProcessingOperatingSessionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Cheque Processing Operating Session 
   * @return chequeProcessingOperatingSessionStatus
  **/

  public String getChequeProcessingOperatingSessionStatus() {
    return chequeProcessingOperatingSessionStatus;
  }

  public void setChequeProcessingOperatingSessionStatus(String chequeProcessingOperatingSessionStatus) {
    this.chequeProcessingOperatingSessionStatus = chequeProcessingOperatingSessionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Cheque Processing Operating Session 
   * @return chequeProcessingOperatingSessionUsageLog
  **/

  public String getChequeProcessingOperatingSessionUsageLog() {
    return chequeProcessingOperatingSessionUsageLog;
  }

  public void setChequeProcessingOperatingSessionUsageLog(String chequeProcessingOperatingSessionUsageLog) {
    this.chequeProcessingOperatingSessionUsageLog = chequeProcessingOperatingSessionUsageLog;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The configuration of Cheque Processing Operating Session 
   * @return chequeProcessingOperatingSessionServiceConfiguration
  **/

  public String getChequeProcessingOperatingSessionServiceConfiguration() {
    return chequeProcessingOperatingSessionServiceConfiguration;
  }

  public void setChequeProcessingOperatingSessionServiceConfiguration(String chequeProcessingOperatingSessionServiceConfiguration) {
    this.chequeProcessingOperatingSessionServiceConfiguration = chequeProcessingOperatingSessionServiceConfiguration;
  }


}

