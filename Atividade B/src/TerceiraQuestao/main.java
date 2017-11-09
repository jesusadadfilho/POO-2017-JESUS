package TerceiraQuestao;

public class main {
	public static void main(String args[]) {
		Veiculo Hulk = new Veiculo("hulk");
		Montadora Fiat = new Montadora("fiat");
		Hulk.Montadora = Fiat;
		Fiat.Dono = "jesus";
		Hulk.Montadora.RendimentoMensal = 1222;
		System.out.println(Hulk.Montadora.RendimentoAnual());
	}

}
