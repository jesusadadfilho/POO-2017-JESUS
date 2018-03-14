package Model;

import Model.Exceptions.SaldoInsuficienteException;

public class Conta implements Comparable<Conta>  {
    protected double Saldo;

    void sacar(double valor){
        if (this.Saldo < valor) {
            throw new SaldoInsuficienteException("Saldo Insuficiente,tente um valor menor");
        } else {
            this.Saldo-=valor;
        }
    }

    public void deposita(double valor){
        if(valor > 0){
            this.Saldo += valor;
        }
    }
	public double consultarSaldo() {
		return this.Saldo;
	}

	@Override
	public int compareTo(Conta o) {
		if(this.consultarSaldo() > o.consultarSaldo()){
            return -1;
        }else if(o.consultarSaldo() < this.consultarSaldo()){
            return 1;
        }else {
            return 0;
        }
	}

	
}
