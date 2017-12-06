package App;
import Model.SituacaoFinanceira;

public class TestaSituacaoFinanceira {

	public static void main(String[] args) {
		SituacaoFinanceira conta = new SituacaoFinanceira(4000,2500);
		System.out.println(conta.Saldo());

	}

}
