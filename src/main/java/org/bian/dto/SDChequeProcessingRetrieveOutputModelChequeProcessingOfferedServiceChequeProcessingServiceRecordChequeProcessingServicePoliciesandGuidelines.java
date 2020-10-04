package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecordChequeProcessingServicePoliciesandGuidelines
 */
public class SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecordChequeProcessingServicePoliciesandGuidelines   {
  private String chequeProcessingServiceEligibility = null;

  private String chequeProcessingServiceIntendedUses = null;

  private String chequeProcessingServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return chequeProcessingServiceEligibility
  **/

  public String getChequeProcessingServiceEligibility() {
    return chequeProcessingServiceEligibility;
  }

  public void setChequeProcessingServiceEligibility(String chequeProcessingServiceEligibility) {
    this.chequeProcessingServiceEligibility = chequeProcessingServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return chequeProcessingServiceIntendedUses
  **/

  public String getChequeProcessingServiceIntendedUses() {
    return chequeProcessingServiceIntendedUses;
  }

  public void setChequeProcessingServiceIntendedUses(String chequeProcessingServiceIntendedUses) {
    this.chequeProcessingServiceIntendedUses = chequeProcessingServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return chequeProcessingServicePricingandTerms
  **/

  public String getChequeProcessingServicePricingandTerms() {
    return chequeProcessingServicePricingandTerms;
  }

  public void setChequeProcessingServicePricingandTerms(String chequeProcessingServicePricingandTerms) {
    this.chequeProcessingServicePricingandTerms = chequeProcessingServicePricingandTerms;
  }


}

