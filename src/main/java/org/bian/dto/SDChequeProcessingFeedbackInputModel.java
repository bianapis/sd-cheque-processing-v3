package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDChequeProcessingFeedbackInputModelChequeProcessingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDChequeProcessingFeedbackInputModel
 */
public class SDChequeProcessingFeedbackInputModel   {
  private Object chequeProcessingFeedbackActionTaskRecord = null;

  private SDChequeProcessingFeedbackInputModelChequeProcessingFeedbackActionRecord chequeProcessingFeedbackActionRecord = null;


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

  public SDChequeProcessingFeedbackInputModelChequeProcessingFeedbackActionRecord getChequeProcessingFeedbackActionRecord() {
    return chequeProcessingFeedbackActionRecord;
  }

  public void setChequeProcessingFeedbackActionRecord(SDChequeProcessingFeedbackInputModelChequeProcessingFeedbackActionRecord chequeProcessingFeedbackActionRecord) {
    this.chequeProcessingFeedbackActionRecord = chequeProcessingFeedbackActionRecord;
  }


}

