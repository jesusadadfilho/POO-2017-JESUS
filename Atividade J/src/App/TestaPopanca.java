package App;

import Model.*;
import Model.Exceptions.ValorInvalidoException;

public class TestaPopanca {
    public static void main(String[] args){
    	Conta cp = new ContaPoupanca();
    	try {
    		cp.deposita(-100);
    		}catch (ValorInvalidoException e) {
    			System.out.println(e.getMessage());
    	}
    }
}
