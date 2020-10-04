package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement;
import org.bian.dto.SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup;
import org.bian.dto.SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecord
 */
public class SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecord   {
  private String chequeProcessingServiceConfigurationSettingReference = null;

  private String chequeProcessingServiceConfigurationSettingType = null;

  private SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup chequeProcessingServiceConfigurationSetup = null;

  private SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription chequeProcessingServiceSubscription = null;

  private SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement chequeProcessingServiceAgreement = null;


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

  public SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup getChequeProcessingServiceConfigurationSetup() {
    return chequeProcessingServiceConfigurationSetup;
  }

  public void setChequeProcessingServiceConfigurationSetup(SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup chequeProcessingServiceConfigurationSetup) {
    this.chequeProcessingServiceConfigurationSetup = chequeProcessingServiceConfigurationSetup;
  }


  /**
   * Get chequeProcessingServiceSubscription
   * @return chequeProcessingServiceSubscription
  **/

  public SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription getChequeProcessingServiceSubscription() {
    return chequeProcessingServiceSubscription;
  }

  public void setChequeProcessingServiceSubscription(SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription chequeProcessingServiceSubscription) {
    this.chequeProcessingServiceSubscription = chequeProcessingServiceSubscription;
  }


  /**
   * Get chequeProcessingServiceAgreement
   * @return chequeProcessingServiceAgreement
  **/

  public SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement getChequeProcessingServiceAgreement() {
    return chequeProcessingServiceAgreement;
  }

  public void setChequeProcessingServiceAgreement(SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement chequeProcessingServiceAgreement) {
    this.chequeProcessingServiceAgreement = chequeProcessingServiceAgreement;
  }


}

