package Model;

public class JogadorE {
	private int vidas;
	public JogadorE() {
		this.vidas = 5;
	}
	
	public boolean isLimiteMaxVidas() {
		if(this.vidas == 5) {
			return true;
		}
		return false;
	}
	
	public boolean isLimiteMinVidas() {
		if(this.vidas == 0) {
			return true;
		}
		return false;
	}
	
	public void incrementa() {
		if(this.isLimiteMaxVidas()) {
		}
		else{
			this.vidas ++;
		}
	}
	
	public void decementa() {
		if(this.isLimiteMinVidas()) {
			
		}
		else {
			this.vidas --;
		}
	}
	
	public boolean doar(JogadorE b, int valor) {
		if(valor < b.vidas && valor+this.vidas <= 5) {
			this.vidas += valor;
			b.vidas -= valor;
			return true;
		}
		return false;
	}
	

}
