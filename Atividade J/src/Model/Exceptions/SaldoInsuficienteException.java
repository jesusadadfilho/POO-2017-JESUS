package Model.Exceptions;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensage){
        super(mensage);
    }
}
