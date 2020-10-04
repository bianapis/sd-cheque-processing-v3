package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingActivateInputModel
 */
public class SDChequeProcessingActivateInputModel   {
  private Object chequeProcessingActivationActionTaskRecord = null;

  private String chequeProcessingCenterReference = null;

  private String chequeProcessingServiceReference = null;

  private SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecord chequeProcessingServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return chequeProcessingCenterReference
  **/

  public String getChequeProcessingCenterReference() {
    return chequeProcessingCenterReference;
  }

  public void setChequeProcessingCenterReference(String chequeProcessingCenterReference) {
    this.chequeProcessingCenterReference = chequeProcessingCenterReference;
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

  public SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecord getChequeProcessingServiceConfigurationRecord() {
    return chequeProcessingServiceConfigurationRecord;
  }

  public void setChequeProcessingServiceConfigurationRecord(SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecord chequeProcessingServiceConfigurationRecord) {
    this.chequeProcessingServiceConfigurationRecord = chequeProcessingServiceConfigurationRecord;
  }


}

