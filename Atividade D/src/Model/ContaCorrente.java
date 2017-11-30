package Model;

public class ContaCorrente extends Conta {
	
	

	public void Atualiza(double taxa) {
		this.Saldo += this.Saldo * 2 * taxa;
	}
	
	public void Depositar(double valor) {
		this.Saldo += valor - 0.1;
	}

}
