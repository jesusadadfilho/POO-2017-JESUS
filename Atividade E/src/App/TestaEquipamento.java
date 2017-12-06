package App;
import Model.Equipamento;

public class TestaEquipamento {

	public static void main(String[] args) {
		Equipamento a = new Equipamento();
		Equipamento b = new Equipamento();
		a.liga();
		b.desliga();
		a.inverte();
		b.inverte();
		if(a.estaLigado()) {
			System.out.println("esta ligado1");
		}
		if(b.estaLigado()) {
			System.out.println("esta ligado2");
		}
		

	}

}
