package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedService
 */
public class SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedService   {
  private String chequeProcessingServiceReference = null;

  private SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecord chequeProcessingServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return chequeProcessingServiceReference
  **/

  public String getChequeProcessingServiceReference() {
    return chequeProcessingServiceReference;
  }

  public void setChequeProcessingServiceReference(String chequeProcessingServiceReference) {
    this.chequeProcessingServiceReference = chequeProcessingServiceReference;
  }


  /**
   * Get chequeProcessingServiceRecord
   * @return chequeProcessingServiceRecord
  **/

  public SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecord getChequeProcessingServiceRecord() {
    return chequeProcessingServiceRecord;
  }

  public void setChequeProcessingServiceRecord(SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedServiceChequeProcessingServiceRecord chequeProcessingServiceRecord) {
    this.chequeProcessingServiceRecord = chequeProcessingServiceRecord;
  }


}

