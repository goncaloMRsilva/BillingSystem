package billingsystem;

public class AlphaTarifario {
    private int id;
    private int maxChamadas;
    private double precoPorMinutoLocal;
    private double precoPorMinutoEstrangeiro;
    private int bonusChamadas;
    private double descontoSaldoBucketC;
    private double descontoMinutoExcedente;
    
    public AlphaTarifario() {}
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaxChamadas() {
		return maxChamadas;
	}
	public void setMaxChamadas(int maxChamadas) {
		this.maxChamadas = maxChamadas;
	}
	public double getPrecoPorMinutoLocal() {
		return precoPorMinutoLocal;
	}
	public void setPrecoPorMinutoLocal(double precoPorMinutoLocal) {
		this.precoPorMinutoLocal = precoPorMinutoLocal;
	}
	public double getPrecoPorMinutoEstrangeiro() {
		return precoPorMinutoEstrangeiro;
	}
	public void setPrecoPorMinutoEstrangeiro(double precoPorMinutoEstrangeiro) {
		this.precoPorMinutoEstrangeiro = precoPorMinutoEstrangeiro;
	}
	public int getBonusChamadas() {
		return bonusChamadas;
	}
	public void setBonusChamadas(int bonusChamadas) {
		this.bonusChamadas = bonusChamadas;
	}
	public double getDescontoSaldoBucketC() {
		return descontoSaldoBucketC;
	}
	public void setDescontoSaldoBucketC(double descontoSaldoBucketC) {
		this.descontoSaldoBucketC = descontoSaldoBucketC;
	}
	public double getDescontoMinutoExcedente() {
		return descontoMinutoExcedente;
	}
	public void setDescontoMinutoExcedente(double descontoMinutoExcedente) {
		this.descontoMinutoExcedente = descontoMinutoExcedente;
	}
    
    
}
