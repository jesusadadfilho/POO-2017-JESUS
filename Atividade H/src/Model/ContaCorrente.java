package Model;

public class ContaCorrente extends Conta implements Tributavel {
    @Override
    public double getValorImposto() {
        return this.GetSaldo() * 0.01;
    }

    @Override
    public void Atualiza(double taxa) {

    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public String getTitular() {
        return null;
    }
}
