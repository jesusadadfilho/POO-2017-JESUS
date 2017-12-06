package Model;

public class SituacaoFinanceira {
	
	private double valorCreditos;
	private double valorDebitos;
	public SituacaoFinanceira(double C, double D) {
		this.valorCreditos = C;
		this.valorDebitos = D;
			
	}
	
	public double Saldo() {
		return this.valorCreditos - this.valorDebitos;
	}
	

}
