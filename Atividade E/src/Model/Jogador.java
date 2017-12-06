package Model;

public class Jogador {
	private int Forca;
	private int nivel;
	private int pontos_atuais;
	
	public Jogador(int f, int n, int p) {
		this.Forca = f;
		this.nivel = n;
		this.pontos_atuais = p;
	}
	
	public int Ataque() {
		return this.pontos_atuais += this.Forca / this.nivel;
	}
	
	public void atacar(Jogador b) {
		this.pontos_atuais -= b.Ataque();
		b.pontos_atuais += b.Ataque();
	}
	public int GetPontos() {
		return this.pontos_atuais;
	}

}
