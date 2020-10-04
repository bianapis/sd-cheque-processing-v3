package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingRetrieveInputModelChequeProcessingOfferedService;
import org.bian.dto.SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingRetrieveInputModel
 */
public class SDChequeProcessingRetrieveInputModel   {
  private Object chequeProcessingRetrieveActionTaskRecord = null;

  private String chequeProcessingRetrieveActionRequest = null;

  private SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecord chequeProcessingRetrieveActionRecord = null;

  private SDChequeProcessingRetrieveInputModelChequeProcessingOfferedService chequeProcessingOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return chequeProcessingRetrieveActionRequest
  **/

  public String getChequeProcessingRetrieveActionRequest() {
    return chequeProcessingRetrieveActionRequest;
  }

  public void setChequeProcessingRetrieveActionRequest(String chequeProcessingRetrieveActionRequest) {
    this.chequeProcessingRetrieveActionRequest = chequeProcessingRetrieveActionRequest;
  }


  /**
   * Get chequeProcessingRetrieveActionRecord
   * @return chequeProcessingRetrieveActionRecord
  **/

  public SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecord getChequeProcessingRetrieveActionRecord() {
    return chequeProcessingRetrieveActionRecord;
  }

  public void setChequeProcessingRetrieveActionRecord(SDChequeProcessingRetrieveInputModelChequeProcessingRetrieveActionRecord chequeProcessingRetrieveActionRecord) {
    this.chequeProcessingRetrieveActionRecord = chequeProcessingRetrieveActionRecord;
  }


  /**
   * Get chequeProcessingOfferedService
   * @return chequeProcessingOfferedService
  **/

  public SDChequeProcessingRetrieveInputModelChequeProcessingOfferedService getChequeProcessingOfferedService() {
    return chequeProcessingOfferedService;
  }

  public void setChequeProcessingOfferedService(SDChequeProcessingRetrieveInputModelChequeProcessingOfferedService chequeProcessingOfferedService) {
    this.chequeProcessingOfferedService = chequeProcessingOfferedService;
  }


}

