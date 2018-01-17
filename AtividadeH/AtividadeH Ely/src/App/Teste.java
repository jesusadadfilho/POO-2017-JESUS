package App;
import model.*;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente a = new ContaCorrente();
        a.setNome("jesus");
        a.setSaldo(5467);
        
        ContaCorrente b = new ContaCorrente();
        b.setNome("vinao");
        b.setSaldo(5473);
        
        SeguroDeVida seg1 = new SeguroDeVida();
        SeguroDeVida seg2 = new SeguroDeVida();
        
        AuditoriaInterna aud = new AuditoriaInterna(10);
        aud.adicionar(a);
        aud.adicionar(b);
        aud.adicionar(seg1);
        aud.adicionar(seg2);
        
        System.out.println(aud.calcularTributos());

	}

}
