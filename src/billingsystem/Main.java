package billingsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		TarifarioManager tm = new TarifarioManager();
		ChargingRequest cr = new ChargingRequest();
		BillingAccount ba = new BillingAccount();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		
		try {
			date = dateFormat.parse("2023-09-11");
			cr.setRequestID(1);
			cr.setTimestamp(date);
			cr.setService("A");
			cr.setRoaming(false);
			cr.setMSISDN("939423421");
			cr.setRSU(1);
			
			ba.setMSISDN("939423421");
			ba.setBucket1(3);
			ba.setBucket2(5);
			ba.setBucket3(15);
			ba.setCounterA(2);
			ba.setCounterB(5);
			ba.setCounterC(10);
			ba.setCounterD(date);
			ba.setTarifarioServicoA("Alfa1");
			ba.setTarifarioServicoB("Beta2");
			
			System.out.println(tm.determinarTarifarioAplicavel(cr, ba));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
