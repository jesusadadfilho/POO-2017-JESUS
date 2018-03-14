package App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import Model.*;

public class TestaDivisao {
    @SuppressWarnings("unchecked")
	public static void main(String args[]){
        int i = 789;
        List<Conta> contas = new ArrayList<>();
        Conta a = new Conta();
        Conta b = new Conta();
        Conta c = new Conta();
        Conta d = new Conta();
        contas.add(a);
        contas.add(b);
        contas.add(c);
        contas.add(d);
        a.deposita(100);
        b.deposita(10);
        c.deposita(1000);
        d.deposita(50);
        Collections.sort(contas);
        for(Conta conta : contas) {
        	System.out.println("" + conta.consultarSaldo());
        }
    }
}
