package billingsystem;

import java.util.Date;

public class BillingAccount {
    private String MSISDN;
    private int bucketA;
    private int bucketB;
    private int bucketC;
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
	public int getBucketA() {
		return bucketA;
	}
	public void setBucketA(int bucketA) {
		this.bucketA = bucketA;
	}
	public int getBucketB() {
		return bucketB;
	}
	public void setBucketB(int bucketB) {
		this.bucketB = bucketB;
	}
	public int getBucketC() {
		return bucketC;
	}
	public void setBucketC(int bucketC) {
		this.bucketC = bucketC;
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
