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
public class CommissionsApiServiceImpl implements CommissionsApiService {

	public SDCommissionsActivateOutputModel activate(SDCommissionsActivateInputModel request){
		return JsonReader.read("activate-SDCommissionsActivateOutputModel.json",new TypeReference<SDCommissionsActivateOutputModel>(){});
	}
	
	public SDCommissionsConfigureOutputModel configure(String sdReferenceId, SDCommissionsConfigureInputModel request){
		return JsonReader.read("configure-SDCommissionsConfigureOutputModel.json",new TypeReference<SDCommissionsConfigureOutputModel>(){});
	}
	
	public CRCommissionTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCommissionTransactionControlInputModel request){
		return JsonReader.read("control-CRCommissionTransactionControlOutputModel.json",new TypeReference<CRCommissionTransactionControlOutputModel>(){});
	}
	
	public BQCalculationExchangeOutputModel exchangeCalculation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCalculationExchangeInputModel request){
		return JsonReader.read("exchange-BQCalculationExchangeOutputModel.json",new TypeReference<BQCalculationExchangeOutputModel>(){});
	}
	
	public BQCheckExchangeOutputModel exchangeCheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCheckExchangeInputModel request){
		return JsonReader.read("exchange-BQCheckExchangeOutputModel.json",new TypeReference<BQCheckExchangeOutputModel>(){});
	}
	
	public BQPaymentExchangeOutputModel exchangePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentExchangeOutputModel.json",new TypeReference<BQPaymentExchangeOutputModel>(){});
	}
	
	public CRCommissionTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCommissionTransactionExchangeInputModel request){
		return JsonReader.read("exchange-CRCommissionTransactionExchangeOutputModel.json",new TypeReference<CRCommissionTransactionExchangeOutputModel>(){});
	}
	
	public CRCommissionTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCommissionTransactionExecuteInputModel request){
		return JsonReader.read("execute-CRCommissionTransactionExecuteOutputModel.json",new TypeReference<CRCommissionTransactionExecuteOutputModel>(){});
	}
	
	public SDCommissionsFeedbackOutputModel feedback(String sdReferenceId, SDCommissionsFeedbackInputModel request){
		return JsonReader.read("feedback-SDCommissionsFeedbackOutputModel.json",new TypeReference<SDCommissionsFeedbackOutputModel>(){});
	}
	
	public CRCommissionTransactionInitiateOutputModel initiate(String sdReferenceId, CRCommissionTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRCommissionTransactionInitiateOutputModel.json",new TypeReference<CRCommissionTransactionInitiateOutputModel>(){});
	}
	
	public BQCheckInitiateOutputModel initiateCheck(String sdReferenceId, String crReferenceId, BQCheckInitiateInputModel request){
		return JsonReader.read("initiate-BQCheckInitiateOutputModel.json",new TypeReference<BQCheckInitiateOutputModel>(){});
	}
	
	public CRCommissionTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCommissionTransactionRequestInputModel request){
		return JsonReader.read("request-CRCommissionTransactionRequestOutputModel.json",new TypeReference<CRCommissionTransactionRequestOutputModel>(){});
	}
	
	public BQCalculationRetrieveOutputModel retrieveCalculation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCalculationRetrieveOutputModel.json",new TypeReference<BQCalculationRetrieveOutputModel>(){});
	}
	
	public BQCheckRetrieveOutputModel retrieveCheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCheckRetrieveOutputModel.json",new TypeReference<BQCheckRetrieveOutputModel>(){});
	}
	
	public BQPaymentRetrieveOutputModel retrievePayment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentRetrieveOutputModel.json",new TypeReference<BQPaymentRetrieveOutputModel>(){});
	}
	
	public CRCommissionTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCommissionTransactionRetrieveOutputModel.json",new TypeReference<CRCommissionTransactionRetrieveOutputModel>(){});
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
	
	public SDCommissionsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCommissionsRetrieveOutputModel.json",new TypeReference<SDCommissionsRetrieveOutputModel>(){});
	}
	
	public CRCommissionTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCommissionTransactionUpdateInputModel request){
		return JsonReader.read("update-CRCommissionTransactionUpdateOutputModel.json",new TypeReference<CRCommissionTransactionUpdateOutputModel>(){});
	}
	
	public BQCalculationUpdateOutputModel updateCalculation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCalculationUpdateInputModel request){
		return JsonReader.read("update-BQCalculationUpdateOutputModel.json",new TypeReference<BQCalculationUpdateOutputModel>(){});
	}
	
	public BQCheckUpdateOutputModel updateCheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCheckUpdateInputModel request){
		return JsonReader.read("update-BQCheckUpdateOutputModel.json",new TypeReference<BQCheckUpdateOutputModel>(){});
	}
	
	public BQPaymentUpdateOutputModel updatePayment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentUpdateInputModel request){
		return JsonReader.read("update-BQPaymentUpdateOutputModel.json",new TypeReference<BQPaymentUpdateOutputModel>(){});
	}
	
}
