/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ChequeProcessingApiService {

	SDChequeProcessingActivateOutputModel activate(SDChequeProcessingActivateInputModel request);
	
	SDChequeProcessingConfigureOutputModel configure(String sdReferenceId, SDChequeProcessingConfigureInputModel request);
	
	CRChequeprocessingOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionControlInputModel request);
	
	BQFinancialTransactionInitiationExchangeOutputModel exchangeFinancialtransactioninitiation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialTransactionInitiationExchangeInputModel request);
	
	CRChequeprocessingOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionExchangeInputModel request);
	
	CRChequeprocessingOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionExecuteInputModel request);
	
	SDChequeProcessingFeedbackOutputModel feedback(String sdReferenceId, SDChequeProcessingFeedbackInputModel request);
	
	CRChequeprocessingOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRChequeprocessingOperatingSessionInitiateInputModel request);
	
	CRChequeprocessingOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionRequestInputModel request);
	
	CRChequeprocessingOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQCancelledChequeHandlingRetrieveOutputModel retrieveCancelledchequehandling(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQChequeExtractionRetrieveOutputModel retrieveChequeextraction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFinancialTransactionInitiationRetrieveOutputModel retrieveFinancialtransactioninitiation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDChequeProcessingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRChequeprocessingOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRChequeprocessingOperatingSessionUpdateInputModel request);
	
	BQCancelledChequeHandlingUpdateOutputModel updateCancelledchequehandling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCancelledChequeHandlingUpdateInputModel request);
	
}
