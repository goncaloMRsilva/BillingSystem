package billingsystem;

public class ChargingReply {
    private int requestID;
    private String result;
    private int GSU;
    
    public ChargingReply() {}
    

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getGSU() {
		return GSU;
	}

	public void setGSU(int gSU) {
		GSU = gSU;
	}
    
    
}
