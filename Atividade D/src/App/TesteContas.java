package App;

import Model.*;

public class TesteContas {
	public static void main(String[] args) {
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupança cp = new ContaPoupança();
		
		c.Depositar(630);
		cc.Depositar(630);
		cp.Depositar(630);
		
		c.Atualiza(0.1);
		cc.Atualiza(0.1);
		cp.Atualiza(0.1);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.printf("Saldo Total: ", adc.GetSaldoTotal() , "\n");   
	}

}
