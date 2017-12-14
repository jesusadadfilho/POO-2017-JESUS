package Model;

public class Carro {
	private String placa;
	private long chassi;
	private String modelo;
	private String ano;
	
	public boolean clonado(Carro c) {
		if(this.placa == c.placa || this.chassi == c.chassi  || this.modelo == c.modelo || this.ano == c.ano) {
			return true;
		}
		return false;
	}

}
