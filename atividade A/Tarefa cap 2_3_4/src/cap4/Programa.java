package cap4;

public class Programa {
	public static void main(String args[]) {
		conta minhaConta;
		minhaConta = new conta();
		minhaConta.dono = "jesus";
		minhaConta.saldo = 5000;
		minhaConta.numero = 123;
		minhaConta.limite = 500000;
		minhaConta.cpf = "123.456.789-0";
		conta conta2 = new conta();
		conta2.dono ="jesus";
		conta2.depositar(minhaConta.saldo);
		System.out.println(conta2.saldo);
		minhaConta.transferir(conta2, 200);
		System.out.println(conta2.saldo);
		System.out.println(minhaConta.saldo);
		boolean conseguiu = minhaConta.sacar(3255);
		if (conseguiu) {
			System.out.printf("O seu saldo atual é R$ %.2f \n",minhaConta.saldo);
		}
		else {
			System.out.printf("Não foi possivel realizar o saque, seu saldo atual é R$ %.2f \n",minhaConta.saldo);
		}
	}

}
