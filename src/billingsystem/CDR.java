package billingsystem;

import java.util.Date;

public class CDR {
    private Date timeStamp;
    private String MSISDN;
    private String service;
    private String chargingType; 
    private String bucket;
    private int counterValue;
    private String tarifarioAplicado;
    
    
    public CDR() {}
    
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getChargingType() {
		return chargingType;
	}
	public void setChargingType(String chargingType) {
		this.chargingType = chargingType;
	}
	public String getBucket() {
		return bucket;
	}
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	public int getCounterValue() {
		return counterValue;
	}
	public void setCounterValue(int counterValue) {
		this.counterValue = counterValue;
	}
	public String getTarifarioAplicado() {
		return tarifarioAplicado;
	}
	public void setTarifarioAplicado(String tarifarioAplicado) {
		this.tarifarioAplicado = tarifarioAplicado;
	}
    
    
}
