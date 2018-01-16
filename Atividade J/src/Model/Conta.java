package Model;

import Model.Exceptions.SaldoInsuficienteException;

public class Conta {
    private double Saldo;

    void sacar(double valor){
        if (this.Saldo < valor) {
            throw new SaldoInsuficienteException("Saldo Insuficiente,tente um valor menor");
        } else {
            this.Saldo-=valor;
        }
    }

    void deposita(double valor){
        if(valor > 0){
            this.Saldo += valor;
        }
    }
}
