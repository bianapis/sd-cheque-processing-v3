/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ChequeProcessingApiServiceImpl implements ChequeProcessingApiService {

	public SDChequeProcessingActivateOutputModel activate(SDChequeProcessingActivateInputModel request){
		return JsonReader.read("activate-SDChequeProcessingActivateOutputModel.json",new TypeReference<SDChequeProcessingActivateOutputModel>(){});
	}
	
	public SDChequeProcessingConfigureOutputModel configure(String sdReferenceId, SDChequeProcessingConfigureInputModel request){
		return JsonReader.read("configure-SDChequeProcessingConfigureOutputModel.json",new TypeReference<SDChequeProcessingConfigureOutputModel>(){});
	}
	
	public CRChequeprocessingOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRChequeprocessingOperatingSessionControlOutputModel.json",new TypeReference<CRChequeprocessingOperatingSessionControlOutputModel>(){});
	}
	
	public BQFinancialTransactionInitiationExchangeOutputModel exchangeFinancialtransactioninitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialTransactionInitiationExchangeInputModel request){
		return JsonReader.read("exchange-BQFinancialTransactionInitiationExchangeOutputModel.json",new TypeReference<BQFinancialTransactionInitiationExchangeOutputModel>(){});
	}
	
	public CRChequeprocessingOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionExchangeInputModel request){
		return JsonReader.read("exchange-CRChequeprocessingOperatingSessionExchangeOutputModel.json",new TypeReference<CRChequeprocessingOperatingSessionExchangeOutputModel>(){});
	}
	
	public CRChequeprocessingOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionExecuteInputModel request){
		return JsonReader.read("execute-CRChequeprocessingOperatingSessionExecuteOutputModel.json",new TypeReference<CRChequeprocessingOperatingSessionExecuteOutputModel>(){});
	}
	
	public SDChequeProcessingFeedbackOutputModel feedback(String sdReferenceId, SDChequeProcessingFeedbackInputModel request){
		return JsonReader.read("feedback-SDChequeProcessingFeedbackOutputModel.json",new TypeReference<SDChequeProcessingFeedbackOutputModel>(){});
	}
	
	public CRChequeprocessingOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRChequeprocessingOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRChequeprocessingOperatingSessionInitiateOutputModel.json",new TypeReference<CRChequeprocessingOperatingSessionInitiateOutputModel>(){});
	}
	
	public CRChequeprocessingOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRChequeprocessingOperatingSessionRequestOutputModel.json",new TypeReference<CRChequeprocessingOperatingSessionRequestOutputModel>(){});
	}
	
	public CRChequeprocessingOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRChequeprocessingOperatingSessionRetrieveOutputModel.json",new TypeReference<CRChequeprocessingOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCancelledChequeHandlingRetrieveOutputModel retrieveCancelledchequehandling(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCancelledChequeHandlingRetrieveOutputModel.json",new TypeReference<BQCancelledChequeHandlingRetrieveOutputModel>(){});
	}
	
	public BQChequeExtractionRetrieveOutputModel retrieveChequeextraction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQChequeExtractionRetrieveOutputModel.json",new TypeReference<BQChequeExtractionRetrieveOutputModel>(){});
	}
	
	public BQFinancialTransactionInitiationRetrieveOutputModel retrieveFinancialtransactioninitiation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFinancialTransactionInitiationRetrieveOutputModel.json",new TypeReference<BQFinancialTransactionInitiationRetrieveOutputModel>(){});
	}
	
	public SDChequeProcessingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDChequeProcessingRetrieveOutputModel.json",new TypeReference<SDChequeProcessingRetrieveOutputModel>(){});
	}
	
	public CRChequeprocessingOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRChequeprocessingOperatingSessionUpdateOutputModel.json",new TypeReference<CRChequeprocessingOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQCancelledChequeHandlingUpdateOutputModel updateCancelledchequehandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCancelledChequeHandlingUpdateInputModel request){
		return JsonReader.read("update-BQCancelledChequeHandlingUpdateOutputModel.json",new TypeReference<BQCancelledChequeHandlingUpdateOutputModel>(){});
	}
	
}
