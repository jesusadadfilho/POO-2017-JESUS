package Model;

public class Soma {
	private double Valor1;
	private double Valor2;
	
	public Soma(double v1, double v2) {
		this.Valor1 = v1;
		this.Valor2 = v2;
	}
	
	public double calculaSoma() {
		return this.Valor1 + this.Valor2;
	}

}
