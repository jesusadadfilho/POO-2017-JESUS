package App;


import Model.*;

public class TesteAnimal{
	
	public static void main(String [] args){
		
		Bovino boi =   (Bovino) new Animal();
		Peixe piaba =  (Peixe) new Animal();
		
		boi.setProducaoLeite(45.6);
		
		System.out.println("Producao de leite: " + boi.getProducaoLeite());
	}
}