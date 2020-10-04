package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement
 */
public class SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceAgreement   {
  private String chequeProcessingServiceAgreementReference = null;

  private String chequeProcessingServiceUserReference = null;

  private String chequeProcessingServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return chequeProcessingServiceAgreementReference
  **/

  public String getChequeProcessingServiceAgreementReference() {
    return chequeProcessingServiceAgreementReference;
  }

  public void setChequeProcessingServiceAgreementReference(String chequeProcessingServiceAgreementReference) {
    this.chequeProcessingServiceAgreementReference = chequeProcessingServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return chequeProcessingServiceUserReference
  **/

  public String getChequeProcessingServiceUserReference() {
    return chequeProcessingServiceUserReference;
  }

  public void setChequeProcessingServiceUserReference(String chequeProcessingServiceUserReference) {
    this.chequeProcessingServiceUserReference = chequeProcessingServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return chequeProcessingServiceAgreementTermsandConditions
  **/

  public String getChequeProcessingServiceAgreementTermsandConditions() {
    return chequeProcessingServiceAgreementTermsandConditions;
  }

  public void setChequeProcessingServiceAgreementTermsandConditions(String chequeProcessingServiceAgreementTermsandConditions) {
    this.chequeProcessingServiceAgreementTermsandConditions = chequeProcessingServiceAgreementTermsandConditions;
  }


}

