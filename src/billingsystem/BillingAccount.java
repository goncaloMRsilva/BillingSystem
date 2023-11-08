package billingsystem;

import java.util.Date;

public class BillingAccount {
    private String MSISDN;
    private int bucket1; //cent
    private int bucket2; //cent
    private int bucket3; //cent
    private int counterA;
    private int counterB;
    private int counterC;
    private Date counterD;
    private String tarifarioServicoA;
    private String tarifarioServicoB;
    
    
    public BillingAccount() {}
    
    
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public int getBucket1() {
		return bucket1;
	}
	public void setBucket1(int bucket1) {
		this.bucket1 = bucket1;
	}
	public int getBucket2() {
		return bucket2;
	}
	public void setBucket2(int bucket2) {
		this.bucket2 = bucket2;
	}
	public int getBucket3() {
		return bucket3;
	}
	public void setBucket3(int bucket3) {
		this.bucket3 = bucket3;
	}
	public int getCounterA() {
		return counterA;
	}
	public void setCounterA(int counterA) {
		this.counterA = counterA;
	}
	public int getCounterB() {
		return counterB;
	}
	public void setCounterB(int counterB) {
		this.counterB = counterB;
	}
	public int getCounterC() {
		return counterC;
	}
	public void setCounterC(int counterC) {
		this.counterC = counterC;
	}
	public Date getCounterD() {
		return counterD;
	}
	public void setCounterD(Date counterD) {
		this.counterD = counterD;
	}
	public String getTarifarioServicoA() {
		return tarifarioServicoA;
	}
	public void setTarifarioServicoA(String tarifarioServicoA) {
		this.tarifarioServicoA = tarifarioServicoA;
	}
	public String getTarifarioServicoB() {
		return tarifarioServicoB;
	}
	public void setTarifarioServicoB(String tarifarioServicoB) {
		this.tarifarioServicoB = tarifarioServicoB;
	}
    
    
}
