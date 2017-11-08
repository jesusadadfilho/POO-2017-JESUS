package cap3;

public class BalançoTrimestral {
	public static void main(String args[]) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarço = 17000;
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarço;
		double mediaMensal = gastosTrimestre / 3;
		System.out.println(gastosTrimestre);
		System.out.println("Valor da media mensal é :"+ mediaMensal);
		
	}

}
