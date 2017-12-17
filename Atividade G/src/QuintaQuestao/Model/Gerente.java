package QuintaQuestao.Model;

public class Gerente extends Funcionario {

    double salario;
    double lucro;
	@Override
	double getBonificacao() {
		double boniicacao = super.Bonificacao;
		return boniicacao * (salario / lucro);
	}
    
}
