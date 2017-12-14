package QuintaQuestao.Model;

public class Gerente extends Funcionario {

    double salario;
    double lucro;
    @Override
    double getBonificação() {
        return super.bonificação * (salario / lucro);
    }
}
