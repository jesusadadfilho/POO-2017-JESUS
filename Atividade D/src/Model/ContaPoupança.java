package Model;

public class ContaPoupança extends Conta {
	
	
	public void Atualiza(double taxa) {
		this.Saldo += this.Saldo * 3 * taxa;
	}
}
