package cap3;

public class QuartaQuestao {
	public static void main(String args[]) {
		int fatorial =1;
		System.out.println("O fatorial de 0 é 1");
		for (int i =1; i<=10; i++) {
			System.out.printf("O fatorial de %d * (%d!) = %d\n",i,i-1,fatorial);
			fatorial = fatorial * (i +1);
		}
	}

}
