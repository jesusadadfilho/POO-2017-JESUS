package cap3;
import java.util.Scanner;
public class OitavaQuestão {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a;
		System.out.printf("digite algo:");
		a = ler.nextInt();
		for (int i =1; i <=a; i++) {
			for (int j = 1; j <= i; j++) {
				int b = i * j;
				if (i == j) {
					System.out.printf("%d\n", b);
				}
				else {
					System.out.printf("%d ", b);
				}
			}
	
		}
	}

}
