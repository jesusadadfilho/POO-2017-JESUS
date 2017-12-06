package Model;

public class Conta {
	private String numero;
	private double saldo;
	public boolean sacar(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	public double consultarSaldo() {
		return this.saldo;
	}
	public boolean transferir(double valor, Conta c) {
		if(this.sacar(valor)) {
			c.depositar(valor);
			return true;
		}
		return false;
	}

}
