package cap3;
import java.io.IOException;
import java.util.Scanner;
public class SetimaQuestão {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a;
		System.out.printf("digite algo:\n");
		a = ler.nextInt();
		while (a != 1) {
			if(a % 2 == 0 && a != 2) {
				a = a /2;
				System.out.printf("%d->",a);
			}
			else {
				if (a%2 !=0) {
					a = a * 3 +1;
					System.out.printf("%d->",a);
				}
				else {
					a = a /2;
					System.out.printf("%d",a);
				}

			}
		}

	}

}
