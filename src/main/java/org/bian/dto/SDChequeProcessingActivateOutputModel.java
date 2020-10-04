package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingActivateOutputModel
 */
public class SDChequeProcessingActivateOutputModel   {
  private String chequeProcessingActivationActionTaskReference = null;

  private Object chequeProcessingActivationActionTaskRecord = null;

  private String chequeProcessingServicingSessionReference = null;

  private Object chequeProcessingServicingSessionRecord = null;

  private SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecord chequeProcessingServiceConfigurationRecord = null;

  private String chequeProcessingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return chequeProcessingActivationActionTaskReference
  **/

  public String getChequeProcessingActivationActionTaskReference() {
    return chequeProcessingActivationActionTaskReference;
  }

  public void setChequeProcessingActivationActionTaskReference(String chequeProcessingActivationActionTaskReference) {
    this.chequeProcessingActivationActionTaskReference = chequeProcessingActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return chequeProcessingActivationActionTaskRecord
  **/

  public Object getChequeProcessingActivationActionTaskRecord() {
    return chequeProcessingActivationActionTaskRecord;
  }

  public void setChequeProcessingActivationActionTaskRecord(Object chequeProcessingActivationActionTaskRecord) {
    this.chequeProcessingActivationActionTaskRecord = chequeProcessingActivationActionTaskRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return chequeProcessingServicingSessionRecord
  **/

  public Object getChequeProcessingServicingSessionRecord() {
    return chequeProcessingServicingSessionRecord;
  }

  public void setChequeProcessingServicingSessionRecord(Object chequeProcessingServicingSessionRecord) {
    this.chequeProcessingServicingSessionRecord = chequeProcessingServicingSessionRecord;
  }


  /**
   * Get chequeProcessingServiceConfigurationRecord
   * @return chequeProcessingServiceConfigurationRecord
  **/

  public SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecord getChequeProcessingServiceConfigurationRecord() {
    return chequeProcessingServiceConfigurationRecord;
  }

  public void setChequeProcessingServiceConfigurationRecord(SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecord chequeProcessingServiceConfigurationRecord) {
    this.chequeProcessingServiceConfigurationRecord = chequeProcessingServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return chequeProcessingServicingSessionStatus
  **/

  public String getChequeProcessingServicingSessionStatus() {
    return chequeProcessingServicingSessionStatus;
  }

  public void setChequeProcessingServicingSessionStatus(String chequeProcessingServicingSessionStatus) {
    this.chequeProcessingServicingSessionStatus = chequeProcessingServicingSessionStatus;
  }


}

