package App;
import Model.Conta;
public class TesteConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.depositar(300);
		c2.depositar(937);
		c2.sacar(65);
		c1.sacar(48);
		c1.transferir(56, c2);
		System.out.println(c1.consultarSaldo());
		System.out.println(c2.consultarSaldo());
	}

}
