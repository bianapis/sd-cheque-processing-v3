package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup
 */
public class SDChequeProcessingConfigureInputModelChequeProcessingServiceConfigurationRecordChequeProcessingServiceConfigurationSetup   {
  private String chequeProcessingServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return chequeProcessingServiceConfigurationParameter
  **/

  public String getChequeProcessingServiceConfigurationParameter() {
    return chequeProcessingServiceConfigurationParameter;
  }

  public void setChequeProcessingServiceConfigurationParameter(String chequeProcessingServiceConfigurationParameter) {
    this.chequeProcessingServiceConfigurationParameter = chequeProcessingServiceConfigurationParameter;
  }


}

