package Model;

public class ManipuladorDeSeguroDeVida {
    private SeguroDeVida seguroDeVida;
    public void criarSeguro(double valor, String titular, int numeroApolice) {

        seguroDeVida.setTitular(titular);
        seguroDeVida.setValor(valor);
        seguroDeVida.setNumeroApolice(numeroApolice);
    }
}
