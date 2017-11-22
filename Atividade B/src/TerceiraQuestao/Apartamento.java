package TerceiraQuestao;

public class Apartamento {
	Titular dono;
	String endereço;
	int cep;
	int numero;
	
	public Apartamento(String endereço) {
		this.endereço = endereço;
	}
	
	void venda(Titular dono) {
		this.dono = dono;
	}

	
}
