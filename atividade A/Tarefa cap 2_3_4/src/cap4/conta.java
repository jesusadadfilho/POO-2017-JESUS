package cap4;

class conta {
	int numero;
	String dono;
	String cpf;
	double saldo;
	double limite;
	
	

	
	void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean transferir(conta destino, int valor){
		if (this.saldo < valor) {
			return false;
		}
		else {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		
	}
	
	boolean sacar(double quantidade) {
		if (this.saldo < quantidade) {
			return false;
		}
		else {
			this.saldo -= quantidade;
			return true;
		}
	}

}
