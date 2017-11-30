package Cap6;

public class funcionario {
	private int idade;
	private String nome;
	private String departamento;
	private int salario;
	
	public void receberAumento(int valor) {
		this.salario += valor;
	}
	
	void DadosFuncionario() {
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario "+ this.salario);
		System.out.println("Nome: "+ this.nome);
		System.out.println("Ganho anual: " + this.calculoGanhoAnual());

	}
	
	public int calculoGanhoAnual() {
		return (this.salario *12);
	}
}
