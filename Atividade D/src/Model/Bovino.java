package Model;

public class Bovino extends Animal{
		
	private double producaoLeite;
	
	public void setProducaoLeite(double valor){
		this.producaoLeite = valor;
	}
	
	public double getProducaoLeite(){
		return this.producaoLeite;
	}
}