package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedService;
import org.bian.dto.SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingRetrieveOutputModel
 */
public class SDChequeProcessingRetrieveOutputModel   {
  private String chequeProcessingRetrieveActionTaskReference = null;

  private Object chequeProcessingRetrieveActionTaskRecord = null;

  private String chequeProcessingRetrieveActionResponse = null;

  private SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecord chequeProcessingRetrieveActionRecord = null;

  private SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedService chequeProcessingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return chequeProcessingRetrieveActionTaskReference
  **/

  public String getChequeProcessingRetrieveActionTaskReference() {
    return chequeProcessingRetrieveActionTaskReference;
  }

  public void setChequeProcessingRetrieveActionTaskReference(String chequeProcessingRetrieveActionTaskReference) {
    this.chequeProcessingRetrieveActionTaskReference = chequeProcessingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return chequeProcessingRetrieveActionTaskRecord
  **/

  public Object getChequeProcessingRetrieveActionTaskRecord() {
    return chequeProcessingRetrieveActionTaskRecord;
  }

  public void setChequeProcessingRetrieveActionTaskRecord(Object chequeProcessingRetrieveActionTaskRecord) {
    this.chequeProcessingRetrieveActionTaskRecord = chequeProcessingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return chequeProcessingRetrieveActionResponse
  **/

  public String getChequeProcessingRetrieveActionResponse() {
    return chequeProcessingRetrieveActionResponse;
  }

  public void setChequeProcessingRetrieveActionResponse(String chequeProcessingRetrieveActionResponse) {
    this.chequeProcessingRetrieveActionResponse = chequeProcessingRetrieveActionResponse;
  }


  /**
   * Get chequeProcessingRetrieveActionRecord
   * @return chequeProcessingRetrieveActionRecord
  **/

  public SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecord getChequeProcessingRetrieveActionRecord() {
    return chequeProcessingRetrieveActionRecord;
  }

  public void setChequeProcessingRetrieveActionRecord(SDChequeProcessingRetrieveOutputModelChequeProcessingRetrieveActionRecord chequeProcessingRetrieveActionRecord) {
    this.chequeProcessingRetrieveActionRecord = chequeProcessingRetrieveActionRecord;
  }


  /**
   * Get chequeProcessingOfferedService
   * @return chequeProcessingOfferedService
  **/

  public SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedService getChequeProcessingOfferedService() {
    return chequeProcessingOfferedService;
  }

  public void setChequeProcessingOfferedService(SDChequeProcessingRetrieveOutputModelChequeProcessingOfferedService chequeProcessingOfferedService) {
    this.chequeProcessingOfferedService = chequeProcessingOfferedService;
  }


}

