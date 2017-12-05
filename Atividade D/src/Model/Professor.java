package Model;

public class Professor extends Funcionario {
	
	private String titulacao;
	
	public void setTitulacao(String n) {
		this.titulacao = n;
	}
	
	public String getTitulacao() {
		return this.titulacao;
	}
	
	public double setSalarioPrimeiraParcela() {
		return this.getSalario();
	}
	

	public double setSalarioSegundaParcela() {
		return 0;
	}

}
