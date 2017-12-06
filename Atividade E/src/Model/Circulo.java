package Model;

public class Circulo {
	private double Raio;
	
	public Circulo(double R) {
		this.Raio = R;
	}
	
	public double Area() {
		return this.Raio * this.Raio * 3.14;
	}
	
	public double perimetro() {
		return this.Raio * 2 * 3.14;
	}

}
