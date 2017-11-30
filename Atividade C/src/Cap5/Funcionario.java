package Cap5;

public class Funcionario {
	private String departamento;
	private int salario;
	private Data dataDeEntrada = new Data();
	private Pessoa gente = new Pessoa();
	private int indetificador;
	
	public Funcionario(String nome) {
		this.gente.nome = nome;
		this.indetificador++;
		
	}
	public Funcionario() {
		this.indetificador++;
	}
	
	public void receberAumento(int valor) {
		this.salario += valor;
	}
	public void setSalario(int valor) {
		this.salario = valor;
	}
	public int GetSalario() {
		return this.salario;
	}
	public Funcionario GetPosicao(int pos) {
		return this;
		
	}
	void DadosFuncionario() {
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario "+ this.salario);
		System.out.println("Data de entrada "+ this.dataDeEntrada.dia);
		System.out.println("Nome: "+ this.gente.nome);
		System.out.println("Ganho anual: " + this.calculoGanhoAnual());

	}
	
	public int calculoGanhoAnual() {
		return (this.salario *12);
	}
}
