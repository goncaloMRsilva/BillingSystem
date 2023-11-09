package billingsystem;

public class TarifarioManager {
	
	public String determinarTarifarioAplicavel(ChargingRequest chargingRequest, BillingAccount billingAccount) {
	    String servico = chargingRequest.getService();
	    String MSISDN = chargingRequest.getMSISDN();
	    boolean roaming = chargingRequest.isRoaming();
	    int counterA = billingAccount.getCounterA();
	    int counterB = billingAccount.getCounterB();
	    int counterC = billingAccount.getCounterC();
	    int bucket1 = billingAccount.getBucket1();
	    int bucket2 = billingAccount.getBucket2();
	    int bucket3 = billingAccount.getBucket3();
	    boolean periodoNoturno = false;
	    boolean diaSemana = true;
	    boolean redeLocal = true;
	    boolean fimDeSemana = true;
	    
	    
	    if ("A".equals(servico)) {
	    	
	        if (temSaldoSuficienteNoBucketA(MSISDN, bucket1, roaming, counterA, bucket3) && counterA <= 100 && diaSemana) {
	            return "Alfa1";
	        } else if (temSaldoSuficienteNoBucketB(MSISDN, bucket2, counterB, periodoNoturno) && redeLocal && bucket2 > 1000) {
	            return "Alfa2";
	        } else if (temSaldoSuficienteNoBucketC(MSISDN, bucket3, counterC, fimDeSemana) && roaming && bucket3 > 1000) {
	            return "Alfa3";
	        }
	        
	    } else if ("B".equals(servico)) {
	    	
	        if (serviceBtemSaldoSuficienteNoBucketA(MSISDN, bucket1, counterA, roaming, bucket3) && diaSemana && fimDeSemana && !periodoNoturno) {
	            return "Beta1";
	        } else if (serviceBtemSaldoSuficienteNoBucketB(MSISDN, bucket2, counterB, periodoNoturno) && redeLocal && bucket2 > 1000) {
	            return "Beta2";
	        } else if (serviceBtemSaldoSuficienteNoBucketC(MSISDN, bucket3, counterC, fimDeSemana) && roaming && bucket3 > 1000) {
	            return "Beta3";
	        }
	        
	    }

	    return "Não Elegível - Critérios não atendidos";
	}
	
	
	private boolean temSaldoSuficienteNoBucketA(String MSISDN, int bucketA, boolean roaming, int counterA, int bucketC) {
		//2 euros sao 200 centimos
		int custoPorMinuto = roaming ? 200 : 100;
		
		 // Aplica desconto de 0.25€/min se counterA for maior que 10
		if(counterA > 10) {
			custoPorMinuto -= 25;
		}
		
		// Aplica desconto adicional de 0.10€/min se saldo no bucketC for maior que 50 euros
		if(bucketC > 5000) {
			custoPorMinuto -= 10;
		}
		
		//1 euro sao 100 centimos
	    if (bucketA >= custoPorMinuto) { // Verifica se o saldo no buckteA e suficiente para o tarifrio Alfa1
	        return true;
	    }
	    
	    return false;
	}
	
	
	private boolean temSaldoSuficienteNoBucketB(String MSISDN, int bucketB, int counterB, boolean periodoNoturno) {

	    int custoPorMinuto = periodoNoturno ? 25 : 50;

	    // Aplica desconto de 0.2€/min se counterB for maior que 10
	    if (counterB > 10) {
	        custoPorMinuto -= 20;
	    }

	    // Aplica desconto adicional de 0.05€/min se saldo no bucketB for maior que 15
	    //bucket é em centimos
	    if (bucketB > 1500) {
	        custoPorMinuto -= 5;
	    }

	    if (bucketB >= custoPorMinuto) { // Verifica se o saldo no bucketB e suficiente para o tarifrio Alfa2
	        return true;
	    }
	    
	    return false;
	}


	private boolean temSaldoSuficienteNoBucketC(String MSISDN, int bucketC, int counterC, boolean fimDeSemana) {
	    // 10 euros sao 1000 centimos
	    int custoPorMinuto = fimDeSemana ? 25 : 100;

	    // Aplica desconto de 0.2€/minuto se counterC for maior que 10
	    if (counterC > 10) {
	        custoPorMinuto -= 20;
	    }

	    // Aplica desconto adicional de 0.05€/minuto se saldo no bucketC for maior que 15
	    if (bucketC > 1500) {
	        custoPorMinuto -= 5;
	    }

	    if (bucketC >= custoPorMinuto) { // Verifica se o saldo no bucketC e suficiente para o tarifrio Alfa3
	        return true;
	    }
	    
	    return false;
	}
	
	
	private boolean serviceBtemSaldoSuficienteNoBucketA(String MSISDN, int bucketA, int counterA, boolean roaming, int bucketC) {
	    int custoPorUnidade = roaming ? 20 : 10; 

	    if (counterA > 10) {
	        custoPorUnidade -= 2.5;
	    }

	    if (bucketC > 5000) {
	        custoPorUnidade -= 1;
	    }

	    if (bucketA >= custoPorUnidade) { 
	        return true;
	    }
	    
	    return false;
	}
	
	
	private boolean serviceBtemSaldoSuficienteNoBucketB(String MSISDN, int bucketB, int counterB, boolean periodoNoturno) {
	    double custoPorUnidade = periodoNoturno ? 2.5 : 5;

	    if (counterB > 10) {
	        custoPorUnidade -= 2;
	    }

	    if (bucketB > 1500) {
	        custoPorUnidade -= 0.5;
	    }

	    if (bucketB >= custoPorUnidade) { 
	    	return true;
	    }
	    
	    return false;
	}
	
	
	private boolean serviceBtemSaldoSuficienteNoBucketC(String MSISDN, int bucketC, int counterC, boolean fimDeSemana) {
	    int custoPorUnidade = fimDeSemana ? 25 : 10; 

	    if (counterC > 10) {
	        custoPorUnidade -= 2;
	    }

	    if (bucketC > 1500) {
	        custoPorUnidade -= 0.5;
	    }

	    if (bucketC >= custoPorUnidade) {
	        return true;
	    }
	    
	    return false;
	}




}
