package Model;

public class Saudacao {
	private String Texto;
	private String Destinatario;
	
	public Saudacao(String t, String d) {
		this.Texto = t;
		this.Destinatario = d;
	}
	
	public String obterSaudacao() {
		return this.Texto + "," + this.Destinatario;
	}

}
