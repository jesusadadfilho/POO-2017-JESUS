package Model;

public class DecimalNumber {
	private double numero;
	public DecimalNumber(double n) {
		this.numero = n;
	}
	
	public int retornaInt() {
		return (int)this.numero;
	}
	
	public double retornaDoube() {
		return this.numero - (int)this.numero;
	}
	

}
