package SextaQuestao.Model;

public class ContaCorrente extends Conta {

	@Override
	public void debito(double valor) {
		this.Saldo += valor;	
	}

	@Override
	public void Saque(double valor) {
		this.Saldo -= valor;
	}

}
