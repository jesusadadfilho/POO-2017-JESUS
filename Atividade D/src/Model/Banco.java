package Model;

public class Banco {
	
	private Conta[] contas;
	//private int index;
	
	// void banco() {
		//this.index = 0;
	//}
	public void adiciona(Conta c) {
		this.contas[this.contas.length] = c;
	}
	
	public Conta pegaConta(int index) {
		return this.contas[index];
	}
	
	public void pegaTotalDeContas() {
		for(Conta c: this.contas) {
			System.out.println(c.GetSaldo());
		}
	}

}
