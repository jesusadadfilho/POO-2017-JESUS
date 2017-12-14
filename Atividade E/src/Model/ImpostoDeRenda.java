package Model;

public class ImpostoDeRenda {
	private double RendaBruta;
	
	public double CalculaImposto() {
		if(this.RendaBruta < 1000) {
			return this.RendaBruta * 0.05;
		}
		return this.RendaBruta *0.1;
	}
	
	public double RendaLiquida() {
		return this.RendaBruta - this.CalculaImposto();
	}

}
