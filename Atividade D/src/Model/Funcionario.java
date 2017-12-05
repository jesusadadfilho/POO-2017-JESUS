package Model;

public class Funcionario extends Pessoa{
	
	private int matricula;
	private double salario;
	
	
	public void setMatricula(int n) {
		this.matricula = n;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setSalario(double n) {
		this.salario = n;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public double setSalarioPrimeiraParcela() {
		return (getSalario() * 60) / 100;
	}
	
	public double setSalarioSegundaParcela() {
		return (getSalario() * 40) / 100;
	}

}
