package Model;

public class ContaPoupan�a extends Conta {
	
	
	public void Atualiza(double taxa) {
		this.Saldo += this.Saldo * 3 * taxa;
	}
}
