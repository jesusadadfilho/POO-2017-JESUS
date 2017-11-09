package TerceiraQuestao;

public class Montadora {
	String Empresa;
	String DataDeFundacao;
	String Marca;
	String Dono;
	int NumeroDeFuncionarios;
	int RendimentoMensal;
	
	
	public Montadora(String Marca) {
		this.Marca = Marca;
	}
	
	void venda(String NovoDono, String NovaEmpresa) {
		this.Dono = NovoDono;
		this.Empresa = NovaEmpresa;
	}
	
	int RendimentoAnual() {
		int resultado = this.RendimentoMensal * 12;
		return resultado;
	}
	
	

}
