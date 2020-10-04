package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingConfigureOutputModelChequeProcessingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingConfigureOutputModel
 */
public class SDChequeProcessingConfigureOutputModel   {
  private String chequeProcessingConfigurationActionTaskReference = null;

  private Object chequeProcessingConfigurationActionTaskRecord = null;

  private SDChequeProcessingConfigureOutputModelChequeProcessingServiceConfigurationRecord chequeProcessingServiceConfigurationRecord = null;

  private String chequeProcessingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return chequeProcessingConfigurationActionTaskReference
  **/

  public String getChequeProcessingConfigurationActionTaskReference() {
    return chequeProcessingConfigurationActionTaskReference;
  }

  public void setChequeProcessingConfigurationActionTaskReference(String chequeProcessingConfigurationActionTaskReference) {
    this.chequeProcessingConfigurationActionTaskReference = chequeProcessingConfigurationActionTaskReference;
  }


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
   * Get chequeProcessingServiceConfigurationRecord
   * @return chequeProcessingServiceConfigurationRecord
  **/

  public SDChequeProcessingConfigureOutputModelChequeProcessingServiceConfigurationRecord getChequeProcessingServiceConfigurationRecord() {
    return chequeProcessingServiceConfigurationRecord;
  }

  public void setChequeProcessingServiceConfigurationRecord(SDChequeProcessingConfigureOutputModelChequeProcessingServiceConfigurationRecord chequeProcessingServiceConfigurationRecord) {
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

