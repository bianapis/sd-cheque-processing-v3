package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecord
 */
public class SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecord   {
  private String chequeProcessingServiceConfigurationSettingReference = null;

  private String chequeProcessingServiceConfigurationSettingType = null;

  private SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup chequeProcessingServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return chequeProcessingServiceConfigurationSettingReference
  **/

  public String getChequeProcessingServiceConfigurationSettingReference() {
    return chequeProcessingServiceConfigurationSettingReference;
  }

  public void setChequeProcessingServiceConfigurationSettingReference(String chequeProcessingServiceConfigurationSettingReference) {
    this.chequeProcessingServiceConfigurationSettingReference = chequeProcessingServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return chequeProcessingServiceConfigurationSettingType
  **/

  public String getChequeProcessingServiceConfigurationSettingType() {
    return chequeProcessingServiceConfigurationSettingType;
  }

  public void setChequeProcessingServiceConfigurationSettingType(String chequeProcessingServiceConfigurationSettingType) {
    this.chequeProcessingServiceConfigurationSettingType = chequeProcessingServiceConfigurationSettingType;
  }


  /**
   * Get chequeProcessingServiceConfigurationSetup
   * @return chequeProcessingServiceConfigurationSetup
  **/

  public SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup getChequeProcessingServiceConfigurationSetup() {
    return chequeProcessingServiceConfigurationSetup;
  }

  public void setChequeProcessingServiceConfigurationSetup(SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup chequeProcessingServiceConfigurationSetup) {
    this.chequeProcessingServiceConfigurationSetup = chequeProcessingServiceConfigurationSetup;
  }


}

