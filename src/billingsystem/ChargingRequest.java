package billingsystem;

import java.util.Date;

public class ChargingRequest {
	private int requestID;
	private Date timestamp;
	private String service;
	private boolean roaming;
	private int MSISDN;
	private int RSU;
	
	public ChargingRequest() {}

	
	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public boolean isRoaming() {
		return roaming;
	}

	public void setRoaming(boolean roaming) {
		this.roaming = roaming;
	}

	public int getMSISDN() {
		return MSISDN;
	}

	public void setMSISDN(int mSISDN) {
		MSISDN = mSISDN;
	}

	public int getRSU() {
		return RSU;
	}

	public void setRSU(int rSU) {
		RSU = rSU;
	}
	
	
}
