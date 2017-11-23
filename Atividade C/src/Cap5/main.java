package Cap5;

public class main {
	
	public static void main(String args[]) {
		fibonacci fibo = new fibonacci();
		for (int i = 1; i <= 6; i++) {
			int resultado = fibo.calculaFibonacci(i);
			System.out.println(resultado);
			}
		
		
	}
}
