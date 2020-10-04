package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingConfigureInputModel
 */
public class SDChequeProcessingConfigureInputModel   {
  private Object chequeProcessingConfigurationActionTaskRecord = null;

  private String chequeProcessingServicingSessionReference = null;

  private String chequeProcessingServiceReference = null;

  private SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecord chequeProcessingServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return chequeProcessingConfigurationActionTaskRecord
  **/

  public Object getChequeProcessingConfigurationActionTaskRecord() {
    return chequeProcessingConfigurationActionTaskRecord;
  }

  public void setChequeProcessingConfigurationActionTaskRecord(Object chequeProcessingConfigurationActionTaskRecord) {
    this.chequeProcessingConfigurationActionTaskRecord = chequeProcessingConfigurationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return chequeProcessingServiceReference
  **/

  public String getChequeProcessingServiceReference() {
    return chequeProcessingServiceReference;
  }

  public void setChequeProcessingServiceReference(String chequeProcessingServiceReference) {
    this.chequeProcessingServiceReference = chequeProcessingServiceReference;
  }


  /**
   * Get chequeProcessingServiceConfigurationRecord
   * @return chequeProcessingServiceConfigurationRecord
  **/

  public SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecord getChequeProcessingServiceConfigurationRecord() {
    return chequeProcessingServiceConfigurationRecord;
  }

  public void setChequeProcessingServiceConfigurationRecord(SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecord chequeProcessingServiceConfigurationRecord) {
    this.chequeProcessingServiceConfigurationRecord = chequeProcessingServiceConfigurationRecord;
  }


}

