package Model;

public class ContaPoupança extends Conta {
	
	
	public void Atualiza(double taxa) {
		super.Atualiza(taxa * 3);
		//this.Saldo += this.Saldo * 3 * taxa;
	}
}
