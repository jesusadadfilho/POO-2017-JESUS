package Model;

public class Senha {
	private String valor;
	
	public Senha(String valor) {
		this.valor = valor;
	}
	
	public boolean iguais(String valor) {
		if(this.valor.equals(valor)) {
			return true;
		}
		return false;
	}
	
	public boolean iguaisTrim(String valor) {
		if(this.valor.trim().equals(valor.trim())) {
			return true;
		}
		return false;
	}
	
	public boolean tamanhoSeguro() {
		if(this.valor.length() > 6) {
			return true;
		}
		return false;
	}
	
	public boolean possuiMaiusculaMinuscula(){
        for (int i = 0; i < this.valor.length(); i++){
            char c =  this.valor.charAt(i);
           if(c >= 'A' && c <= 'Z'){
                return true;
           }
        }

        return false;
    }
	
	public boolean possuiNumero(){
        for (int i = 0; i < this.valor.length(); i++){
            char c =  this.valor.charAt(i);
            if (Character.isDigit(c)){
                return true;
            }
        }

        return false;
    }
	
	
	 public boolean ehValida(){
		 if(!this.possuiNumero() || !this.possuiMaiusculaMinuscula()) {
	            return false;
		 }
	     return true;
	    }


}
