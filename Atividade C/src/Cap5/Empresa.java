package Cap5;

public class Empresa {
	Funcionario[] empregados;
	String Cnpj;
	Pessoa Dono;
	int i = 0;
	
	public Empresa() {
		this.empregados = new Funcionario[10];
	}
	
	void adiciona(Funcionario a) {
		if(this.i < this.empregados.length) {	
			this.empregados[this.i] = a;
			this.i++;
			}
		else {
			Funcionario[] novo = new Funcionario[this.empregados.length + 10];
			for(int i = 0; i < this.empregados.length;i++) {
				novo[i] = this.empregados[i]; 
			}
			this.empregados = novo;
			this.empregados[this.i] = a;
			this.i++;
		}
	}
	void MostrarFuncionarios() {
		for(int i = 0; i < this.empregados.length; i++) {
			if(this.empregados!= null) {
				this.empregados[i].DadosFuncionario();
			}
		}
	}
	
	boolean contem(Funcionario f) {
		for(int i = 0; i < this.empregados.length; i++) {
			if(f == this.empregados[i]) {
				return true;
			}
		}
		return false;
	
	}

}
