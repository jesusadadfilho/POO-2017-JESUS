package Model;

public class Peixe extends Animal{
		
	private int profundidade;
	
	public void setProducaoLeite(int valor){
		this.profundidade = valor;
	}
	
	public float getProducaoLeite(){
		return this.profundidade;
	}
}