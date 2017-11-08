package cap3;

public class QuintaQuestão {
	public static void main(String args[]) {
		long fatorial =1;
		System.out.println("O fatorial de 0 é 1");
		for (long i =1; i<=30; i++) {
			System.out.printf("O fatorial de %d * (%d!) = %d\n",i,i-1,fatorial);
			fatorial = fatorial * (i +1);
		}
	}

}
