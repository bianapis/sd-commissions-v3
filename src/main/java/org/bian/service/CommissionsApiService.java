/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CommissionsApiService {

	SDCommissionsActivateOutputModel activate(SDCommissionsActivateInputModel request);
	
	SDCommissionsConfigureOutputModel configure(String sdReferenceId, SDCommissionsConfigureInputModel request);
	
	CRCommissionTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCommissionTransactionControlInputModel request);
	
	BQCalculationExchangeOutputModel exchangeCalculation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCalculationExchangeInputModel request);
	
	BQCheckExchangeOutputModel exchangeCheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCheckExchangeInputModel request);
	
	BQPaymentExchangeOutputModel exchangePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentExchangeInputModel request);
	
	CRCommissionTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCommissionTransactionExchangeInputModel request);
	
	CRCommissionTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCommissionTransactionExecuteInputModel request);
	
	SDCommissionsFeedbackOutputModel feedback(String sdReferenceId, SDCommissionsFeedbackInputModel request);
	
	CRCommissionTransactionInitiateOutputModel initiate(String sdReferenceId, CRCommissionTransactionInitiateInputModel request);
	
	BQCheckInitiateOutputModel initiateCheck(String sdReferenceId, String crReferenceId, BQCheckInitiateInputModel request);
	
	CRCommissionTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCommissionTransactionRequestInputModel request);
	
	BQCalculationRetrieveOutputModel retrieveCalculation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCheckRetrieveOutputModel retrieveCheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRCommissionTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCommissionsRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCommissionTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCommissionTransactionUpdateInputModel request);
	
	BQCalculationUpdateOutputModel updateCalculation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCalculationUpdateInputModel request);
	
	BQCheckUpdateOutputModel updateCheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCheckUpdateInputModel request);
	
	BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request);
	
}
