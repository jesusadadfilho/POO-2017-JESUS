package TerceiraQuestao;

public class Apartamento {
	Titular dono;
	String endere�o;
	int cep;
	int numero;
	
	public Apartamento(String endere�o) {
		this.endere�o = endere�o;
	}
	
	void venda(Titular dono) {
		this.dono = dono;
	}

	
}
