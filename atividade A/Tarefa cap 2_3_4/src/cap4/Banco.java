package cap4;

public class Banco {

	public static void main(String args []) {
		funcionario joao;
		joao = new funcionario();
		joao.nome = "joao";
		joao.salario = 5000;
		joao.departamento = "finanças";
		joao.dataDeEntrada.dia = 3 ;
		joao.dataDeEntrada.mes = 12;
		joao.dataDeEntrada.ano = 10;
		funcionario f1 = new funcionario();
		funcionario f2 = new funcionario();
		
		f1.nome = "jesus";
		f2.nome = "jesus";
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
