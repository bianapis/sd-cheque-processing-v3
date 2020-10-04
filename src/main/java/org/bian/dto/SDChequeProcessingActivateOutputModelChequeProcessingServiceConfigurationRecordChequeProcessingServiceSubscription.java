package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription
 */
public class SDChequeProcessingActivateOutputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceSubscription   {
  private String chequeProcessingServiceSubscriberReference = null;

  private String chequeProcessingServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return chequeProcessingServiceSubscriberReference
  **/

  public String getChequeProcessingServiceSubscriberReference() {
    return chequeProcessingServiceSubscriberReference;
  }

  public void setChequeProcessingServiceSubscriberReference(String chequeProcessingServiceSubscriberReference) {
    this.chequeProcessingServiceSubscriberReference = chequeProcessingServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return chequeProcessingServiceSubscriberAccessProfile
  **/

  public String getChequeProcessingServiceSubscriberAccessProfile() {
    return chequeProcessingServiceSubscriberAccessProfile;
  }

  public void setChequeProcessingServiceSubscriberAccessProfile(String chequeProcessingServiceSubscriberAccessProfile) {
    this.chequeProcessingServiceSubscriberAccessProfile = chequeProcessingServiceSubscriberAccessProfile;
  }


}

