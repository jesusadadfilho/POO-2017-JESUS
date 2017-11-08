package cap4;

public class Banco {

	public static void main(String args []) {
		Funcionario joao;
		joao = new Funcionario();
		joao.gente.nome = "joao";
		joao.salario = 5000;
		joao.departamento = "finanças";
		joao.dataDeEntrada.dia = 3 ;
		joao.dataDeEntrada.mes = 12;
		joao.dataDeEntrada.ano = 10;
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.gente.nome = "jesus";
		f2.gente.nome = "jesus";
		f1.salario = 100;
		f2.salario = 100;
		
		f2 = f1;
		
		if(f1 == f2) {
			System.out.println("São iguais");
		}
		else {
			System.out.println("São diferentes");
		}
		
		joao.receberAumento(25);
		joao.DadosFuncionario();
	}
}
