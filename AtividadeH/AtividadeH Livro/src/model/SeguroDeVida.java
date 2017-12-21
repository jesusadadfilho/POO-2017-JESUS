package model;

public class SeguroDeVida implements Tributavel {
	private double valor;
	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	@Override
	public String getTitular() {
		return null;
	}

	@Override
	public String getTipo() {
		return null;
	}

}
