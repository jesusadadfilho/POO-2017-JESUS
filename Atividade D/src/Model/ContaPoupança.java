package Model;

public class ContaPoupanša extends Conta {
	
	
	public void Atualiza(double taxa) {
		this.Saldo += this.Saldo * 3 * taxa;
	}
}
