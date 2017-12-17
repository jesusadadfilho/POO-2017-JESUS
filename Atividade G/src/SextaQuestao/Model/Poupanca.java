package SextaQuestao.Model;

public class Poupanca extends ContaCorrente {
	public void debito(double valor) {
		this.Saldo += valor;	
	}

	public void Saque(double valor) {
		this.Saldo -= valor;
	}

}
