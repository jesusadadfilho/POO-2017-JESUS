package Model;

public class Desconto {
	private double valor;
	private double desconto;
	
	public Desconto(double v, double d) {
		this.valor = v;
		this.desconto = d;
	}
	
	public double Calcula(){
		return this.valor * (1- this.desconto/100);
	}

}
