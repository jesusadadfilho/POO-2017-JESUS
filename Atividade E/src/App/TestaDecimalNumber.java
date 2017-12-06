package App;
import Model.DecimalNumber;

public class TestaDecimalNumber {

	public static void main(String[] args) {
		DecimalNumber n = new DecimalNumber(5.7);
		System.out.println(n.retornaInt());
		System.out.println(n.retornaDoube());

	}

}
