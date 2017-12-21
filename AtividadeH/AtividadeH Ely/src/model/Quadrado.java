package model;

public class Quadrado implements FigurasGeometricas, Comparavel  {
	public double lado;

	@Override
	public double CalculaArea() {
		
		return lado * lado;
	}

	@Override
	public double CalculaPerimetro() {
		return lado * 4;
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
