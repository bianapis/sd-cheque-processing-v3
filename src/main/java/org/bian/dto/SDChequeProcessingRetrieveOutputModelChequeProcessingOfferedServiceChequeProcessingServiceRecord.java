package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecordChequeProcessingServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecord
 */
public class SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecord   {
  private String chequeProcessingServiceType = null;

  private String chequeProcessingServiceVersion = null;

  private String chequeProcessingServiceDescription = null;

  private SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecordChequeProcessingServicePoliciesandGuidelines chequeProcessingServicePoliciesandGuidelines = null;

  private String chequeProcessingServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return chequeProcessingServiceType
  **/

  public String getChequeProcessingServiceType() {
    return chequeProcessingServiceType;
  }

  public void setChequeProcessingServiceType(String chequeProcessingServiceType) {
    this.chequeProcessingServiceType = chequeProcessingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return chequeProcessingServiceVersion
  **/

  public String getChequeProcessingServiceVersion() {
    return chequeProcessingServiceVersion;
  }

  public void setChequeProcessingServiceVersion(String chequeProcessingServiceVersion) {
    this.chequeProcessingServiceVersion = chequeProcessingServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return chequeProcessingServiceDescription
  **/

  public String getChequeProcessingServiceDescription() {
    return chequeProcessingServiceDescription;
  }

  public void setChequeProcessingServiceDescription(String chequeProcessingServiceDescription) {
    this.chequeProcessingServiceDescription = chequeProcessingServiceDescription;
  }


  /**
   * Get chequeProcessingServicePoliciesandGuidelines
   * @return chequeProcessingServicePoliciesandGuidelines
  **/

  public SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecordChequeProcessingServicePoliciesandGuidelines getChequeProcessingServicePoliciesandGuidelines() {
    return chequeProcessingServicePoliciesandGuidelines;
  }

  public void setChequeProcessingServicePoliciesandGuidelines(SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecordChequeProcessingServicePoliciesandGuidelines chequeProcessingServicePoliciesandGuidelines) {
    this.chequeProcessingServicePoliciesandGuidelines = chequeProcessingServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return chequeProcessingServiceSchedule
  **/

  public String getChequeProcessingServiceSchedule() {
    return chequeProcessingServiceSchedule;
  }

  public void setChequeProcessingServiceSchedule(String chequeProcessingServiceSchedule) {
    this.chequeProcessingServiceSchedule = chequeProcessingServiceSchedule;
  }


}

