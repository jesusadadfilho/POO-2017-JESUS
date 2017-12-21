package model;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public double calculaTributos() {
		return super.saldo * 0.1;
	}

}
