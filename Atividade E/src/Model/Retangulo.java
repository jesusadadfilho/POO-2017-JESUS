package Model;

public class Retangulo {
	private double l1;
	private double l2;
	
	public Retangulo(double l1, double l2) {
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public double CalculaArea() {
		return this.l1 * this.l2;
	}
	
	public double CalculoDdePerimetro() {
		return (this.l1 *2) + (this.l2 * 2);
	}

	

}
