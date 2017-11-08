package cap3;

public class RepetiçoesFor {
	public static void main(String args[]){
		primeiroloop:
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i == 30) {
				for ( i = 30; i < 100; i++) {
					System.out.println(i);
					if (i < 70) {
						i = 10;
						continue primeiroloop;
					}
				}
			}
		}
	}

}
