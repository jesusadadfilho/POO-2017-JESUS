package Model;

public class Conta {
	protected double Saldo;
	
	public void Depositar(double Valor) {
		this.Saldo += Valor;
	}
	
	public void Sacar(Double Valor) {
		this.Saldo -= Valor;
	}
	
	public double GetSaldo() {
		return this.Saldo;
	}
	
	public void Atualiza(double taxa) {
		this.Saldo += this.Saldo * taxa;
	}

}
