package cap4;

public class Funcionario {
	String departamento;
	int salario;
	Data dataDeEntrada = new Data();
	Pessoa gente = new Pessoa();
	
	
	
	void receberAumento(int valor) {
		this.salario += valor;
	}
	
	void DadosFuncionario() {
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario "+ this.salario);
		System.out.println("Data de entrada "+ this.dataDeEntrada.dia);
		System.out.println("Nome: "+ this.gente.nome);
		System.out.println("Ganho anual: " + this.calculoGanhoAnual());

	}
	
	int calculoGanhoAnual() {
		return (this.salario *12);
	}
}
