package Model;

public class SeguroDeVida implements Tributavel {

    private double valor;
    private String Titular;
    private  int numeroApolice;
    @Override
    public double getValorImposto() {
        return 42 + this.valor * 0.02;
    }

    public String setTitular(String titular) {
        return this.Titular = titular;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String getTitular() {
        return Titular;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    @Override
    public String getTipo() {
        return null;
    }
}
