package Model;

public class Pessoa {
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome,String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	private String nome;
	private String sobrenome;
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setSobrenome(String n) {
		this.sobrenome = n;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public String getNomeCompleto() {
		return this.getNome() + " " + this.getSobrenome();
	}
}
