package billingsystem;

import java.util.Date;

public class CDR {
    private Date timeStamp;
    private int MSISDN;
    private int service;
    private String chargingType; 
    private int bucket;
    private int counterValue;
    private int tarifarioAplicado;
    
    
    public CDR() {}
    
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(int mSISDN) {
		MSISDN = mSISDN;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	public String getChargingType() {
		return chargingType;
	}
	public void setChargingType(String chargingType) {
		this.chargingType = chargingType;
	}
	public int getBucket() {
		return bucket;
	}
	public void setBucket(int bucket) {
		this.bucket = bucket;
	}
	public int getCounterValue() {
		return counterValue;
	}
	public void setCounterValue(int counterValue) {
		this.counterValue = counterValue;
	}
	public int getTarifarioAplicado() {
		return tarifarioAplicado;
	}
	public void setTarifarioAplicado(int tarifarioAplicado) {
		this.tarifarioAplicado = tarifarioAplicado;
	}
    
    
}
