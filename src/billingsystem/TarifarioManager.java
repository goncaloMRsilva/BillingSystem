package billingsystem;

public class TarifarioManager {
	
	public String determinarTarifarioAplicavel(ChargingRequest chargingRequest, BillingAccount billingAccount) {
	    String servico = chargingRequest.getService();
	    String MSISDN = chargingRequest.getMSISDN();
	    int counterA = billingAccount.getCounterA();
	    int bucket1 = billingAccount.getBucket1();
	    int bucket2 = billingAccount.getBucket2();
	    int bucket3 = billingAccount.getBucket3();
	    
	    
	    if ("A".equals(servico)) {
	        if (temSaldoSuficienteNoBucketA(MSISDN, bucket1)) {
	            return "Alfa1";
	        } else if (temSaldoSuficienteNoBucketB(MSISDN, bucket2) && counterA <= 100) {
	            return "Alfa2";
	        } else if (temSaldoSuficienteNoBucketC(MSISDN, bucket3) && counterA <= 100) {
	            return "Alfa3";
	        }
	    } else if ("B".equals(servico)) {
	    	
	    }

	    return "Não Elegível - Critérios não atendidos";
	}
	
	
	private boolean temSaldoSuficienteNoBucketA(String MSISDN, int bucketA) {
		//1 euros sao 100 centimos
	    if (bucketA >= 100) { // Verifica se o saldo no buckteA e suficiente para o tarifrio Alfa1
	        return true;
	    }
	    return false;
	}


	private boolean temSaldoSuficienteNoBucketB(String MSISDN, int bucketB) {
		//10 euros sao 1000 centimos
		if(bucketB >= 1000) { // Verifica se o saldo no buckteB e suficiente para o tarifrio Alfa2
			return true; 
		}
		return false;
	}

	private boolean temSaldoSuficienteNoBucketC(String MSISDN, int bucketC) {
		//10 euros sao 1000 centimos
		if(bucketC >= 1000) { // Verifica se o saldo no bucktec e suficiente para o tarifrio Alfa3
			return true; 
		}
		return false;
	}

}
