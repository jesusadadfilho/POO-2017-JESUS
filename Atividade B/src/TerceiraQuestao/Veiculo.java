package TerceiraQuestao;

public class Veiculo {
	String Nome;
	int AnoDeFabricacao;
	Montadora Montadora = new Montadora("fiat");
	String Placa;
	int Potencia;
	
	public Veiculo(String Nome){
		this.Nome = Nome;
	}
	
	String NomeDaMontadora() {
		return this.Montadora.Marca;
	}
	
	
	

}
