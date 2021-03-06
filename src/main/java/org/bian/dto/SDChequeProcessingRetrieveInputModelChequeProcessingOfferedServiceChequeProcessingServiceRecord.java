package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingRetrieveInputModelChequeProcessingOfferedServiceChequeProcessingServiceRecord
 */
public class SDChequeProcessingRetrieveInputModelChequeProcessingOfferedServiceChequeProcessingServiceRecord   {
  private String chequeProcessingServiceVersion = null;


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


}

