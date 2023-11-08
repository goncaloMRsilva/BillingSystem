package billingsystem;

public class BetaTarifario {
    private String id;
    private int maxChamadas;
    private double precoPorUnidadeLocal;
    private double precoPorUnidadeEstrangeiro;
    private int bonusUnidades;
    private double descontoSaldoBucketC;
    private double descontoUnidadeExcedente;
    
    public BetaTarifario() {}
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMaxChamadas() {
		return maxChamadas;
	}
	public void setMaxChamadas(int maxChamadas) {
		this.maxChamadas = maxChamadas;
	}
	public double getPrecoPorUnidadeLocal() {
		return precoPorUnidadeLocal;
	}
	public void setPrecoPorUnidadeLocal(double precoPorUnidadeLocal) {
		this.precoPorUnidadeLocal = precoPorUnidadeLocal;
	}
	public double getPrecoPorUnidadeEstrangeiro() {
		return precoPorUnidadeEstrangeiro;
	}
	public void setPrecoPorUnidadeEstrangeiro(double precoPorUnidadeEstrangeiro) {
		this.precoPorUnidadeEstrangeiro = precoPorUnidadeEstrangeiro;
	}
	public int getBonusUnidades() {
		return bonusUnidades;
	}
	public void setBonusUnidades(int bonusUnidades) {
		this.bonusUnidades = bonusUnidades;
	}
	public double getDescontoSaldoBucketC() {
		return descontoSaldoBucketC;
	}
	public void setDescontoSaldoBucketC(double descontoSaldoBucketC) {
		this.descontoSaldoBucketC = descontoSaldoBucketC;
	}
	public double getDescontoUnidadeExcedente() {
		return descontoUnidadeExcedente;
	}
	public void setDescontoUnidadeExcedente(double descontoUnidadeExcedente) {
		this.descontoUnidadeExcedente = descontoUnidadeExcedente;
	}
    
    
}
