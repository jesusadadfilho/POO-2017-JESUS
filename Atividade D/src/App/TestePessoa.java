package App;

import Model.Funcionario;
import Model.Pessoa;
import Model.Professor;
import model .*;

public class TestePessoa{
	
	public static void main(String [] args) {
		
		Pessoa pessoa = new Pessoa();
		Funcionario f1 = new Funcionario();
		Professor p1 = new Professor();
		
		pessoa.setNome("Irineu");
		pessoa.setSobrenome("Da Silva");
		
		f1.setSalario(1000.0);
		
		
		p1.setSalario(10000.0);
		p1.setTitulacao("Doutor");
		
		System.out.println(pessoa.getNomeCompleto());
		
		System.out.println("Titulação do prof: " + p1.getTitulacao());
		
		System.out.println("Primeira parcela: " + f1.setSalarioPrimeiraParcela());
		System.out.println("Segunda parcela:" + f1.setSalarioSegundaParcela());
		System.out.println("Primeira parcela do prof: " + p1.setSalarioPrimeiraParcela());
		System.out.println("Segunda parcela do prof: " + p1.setSalarioSegundaParcela());
	}
}