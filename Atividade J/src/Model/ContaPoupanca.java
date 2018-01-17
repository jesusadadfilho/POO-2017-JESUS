package Model;

import Model.Exceptions.ValorInvalidoException;

public class ContaPoupanca extends Conta {
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
		this.Saldo += valor - 0.10;
		}
		}
}
