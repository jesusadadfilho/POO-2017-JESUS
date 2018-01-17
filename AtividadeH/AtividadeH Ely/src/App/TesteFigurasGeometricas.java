package App;
import model.*;

public class TesteFigurasGeometricas {

	public static void main(String[] args) {
		Quadrado a = new Quadrado();
		a.lado = 3;
		System.out.println(a.CalculaArea());
		Circulo b = new Circulo();
		b.Raio = 2;
		System.out.println(b.CalculaArea());
		System.out.println(a.comparar(b));
		

	}

}
