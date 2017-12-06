package App;
import Model.Jogador;

public class TesteJogador {
	public static void main(String[] args) {
		Jogador p1 = new Jogador(10,2,3000);
		Jogador p2 = new Jogador(20,5,800);
		p1.atacar(p2);
		System.out.println(p1.GetPontos());
		System.out.println(p2.GetPontos());
	}

}
