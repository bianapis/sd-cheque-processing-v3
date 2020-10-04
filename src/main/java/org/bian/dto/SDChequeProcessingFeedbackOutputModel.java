package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingFeedbackOutputModelChequeProcessingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingFeedbackOutputModel
 */
public class SDChequeProcessingFeedbackOutputModel   {
  private String chequeProcessingFeedbackActionTaskReference = null;

  private Object chequeProcessingFeedbackActionTaskRecord = null;

  private SDChequeProcessingFeedbackOutputModelChequeProcessingFeedbackActionRecord chequeProcessingFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return chequeProcessingFeedbackActionTaskReference
  **/

  public String getChequeProcessingFeedbackActionTaskReference() {
    return chequeProcessingFeedbackActionTaskReference;
  }

  public void setChequeProcessingFeedbackActionTaskReference(String chequeProcessingFeedbackActionTaskReference) {
    this.chequeProcessingFeedbackActionTaskReference = chequeProcessingFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return chequeProcessingFeedbackActionTaskRecord
  **/

  public Object getChequeProcessingFeedbackActionTaskRecord() {
    return chequeProcessingFeedbackActionTaskRecord;
  }

  public void setChequeProcessingFeedbackActionTaskRecord(Object chequeProcessingFeedbackActionTaskRecord) {
    this.chequeProcessingFeedbackActionTaskRecord = chequeProcessingFeedbackActionTaskRecord;
  }


  /**
   * Get chequeProcessingFeedbackActionRecord
   * @return chequeProcessingFeedbackActionRecord
  **/

  public SDChequeProcessingFeedbackOutputModelChequeProcessingFeedbackActionRecord getChequeProcessingFeedbackActionRecord() {
    return chequeProcessingFeedbackActionRecord;
  }

  public void setChequeProcessingFeedbackActionRecord(SDChequeProcessingFeedbackOutputModelChequeProcessingFeedbackActionRecord chequeProcessingFeedbackActionRecord) {
    this.chequeProcessingFeedbackActionRecord = chequeProcessingFeedbackActionRecord;
  }


}

