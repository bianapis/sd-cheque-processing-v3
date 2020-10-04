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
 * SDChequeProcessingConfigureOutputModelChequeProcessingServiceConfigurationRecord
 */
public class SDChequeProcessingConfigureOutputModelChequeProcessingServiceConfigurationRecord   {
  private String chequeProcessingServiceConfigurationSettingDescription = null;

  private SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup chequeProcessingServiceConfigurationSetup = null;

  private SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription chequeProcessingServiceSubscription = null;

  private SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement chequeProcessingServiceAgreement = null;

  private String chequeProcessingServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return chequeProcessingServiceConfigurationSettingDescription
  **/

  public String getChequeProcessingServiceConfigurationSettingDescription() {
    return chequeProcessingServiceConfigurationSettingDescription;
  }

  public void setChequeProcessingServiceConfigurationSettingDescription(String chequeProcessingServiceConfigurationSettingDescription) {
    this.chequeProcessingServiceConfigurationSettingDescription = chequeProcessingServiceConfigurationSettingDescription;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return chequeProcessingServiceStatus
  **/

  public String getChequeProcessingServiceStatus() {
    return chequeProcessingServiceStatus;
  }

  public void setChequeProcessingServiceStatus(String chequeProcessingServiceStatus) {
    this.chequeProcessingServiceStatus = chequeProcessingServiceStatus;
  }


}

