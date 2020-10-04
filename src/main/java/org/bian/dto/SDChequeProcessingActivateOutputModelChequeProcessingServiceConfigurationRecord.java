package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup;
import org.bian.dto.SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement;
import org.bian.dto.SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecord
 */
public class SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecord   {
  private String chequeProcessingServiceConfigurationSettingReference = null;

  private String chequeProcessingServiceConfigurationSettingDescription = null;

  private SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup chequeProcessingServiceConfigurationSetup = null;

  private SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription chequeProcessingServiceSubscription = null;

  private SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement chequeProcessingServiceAgreement = null;

  private String chequeProcessingServiceStatus = null;


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

  public SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup getChequeProcessingServiceConfigurationSetup() {
    return chequeProcessingServiceConfigurationSetup;
  }

  public void setChequeProcessingServiceConfigurationSetup(SDChequeProcessingActivateInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup chequeProcessingServiceConfigurationSetup) {
    this.chequeProcessingServiceConfigurationSetup = chequeProcessingServiceConfigurationSetup;
  }


  /**
   * Get chequeProcessingServiceSubscription
   * @return chequeProcessingServiceSubscription
  **/

  public SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription getChequeProcessingServiceSubscription() {
    return chequeProcessingServiceSubscription;
  }

  public void setChequeProcessingServiceSubscription(SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription chequeProcessingServiceSubscription) {
    this.chequeProcessingServiceSubscription = chequeProcessingServiceSubscription;
  }


  /**
   * Get chequeProcessingServiceAgreement
   * @return chequeProcessingServiceAgreement
  **/

  public SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement getChequeProcessingServiceAgreement() {
    return chequeProcessingServiceAgreement;
  }

  public void setChequeProcessingServiceAgreement(SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement chequeProcessingServiceAgreement) {
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

