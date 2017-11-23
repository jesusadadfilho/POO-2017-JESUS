package Cap5;

public class TestaEmpresa {
	public static void main(String args[]) {
		Empresa fiat = new Empresa();
		Funcionario joao = new Funcionario();
		fiat.adiciona(joao);
		Funcionario jesus = new Funcionario();
		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			fiat.adiciona(f);
			}
		//fiat.MostrarFuncionarios();
		if(fiat.contem(jesus)){
			System.out.println("contem");
		}
		else {
			System.out.println("Não contem");
		}
	}

}
