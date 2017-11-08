package cap3;

public class SextaQuestão {
	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		int x = 1;
		for (int i = 1; i <= 100; i++) {
			if (i == 1) {
				System.out.println(a);
			}
			else {
				if (i == 2) {
					System.out.println(b);
					x = b;
					b = a + b;
					a = x;
				}
				else {
					System.out.println(b);
					x = b;
					b = a + b;
					a = x;
				}
			}
		}
	}

}
