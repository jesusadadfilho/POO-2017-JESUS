package model;

public class Circulo implements FigurasGeometricas, Comparavel {
	public double Raio;
	@Override
	public double CalculaArea() {
		return Raio * Raio * 3.14;
	}

	@Override
	public double CalculaPerimetro() {
		return 2 * 3.14 * Raio;
	}
	
	public int comparar(FigurasGeometricas calcula) {
		if (this.CalculaArea() < calcula.CalculaArea()){
			return -1;
	    }else if (this.CalculaArea() == calcula.CalculaArea()){
	        return 0;
	    }else{
	        return 1;
	    }
		}

	
	

}
