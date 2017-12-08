package Model;

public class Pilha {
	private int index;
	private int[] vetor;
	
	public Pilha() {
        this.vetor = new int[5];
        this.index = 0;
    }
	
	public void empilhar(int i) {
		if(!estaCheia()) {
			this.vetor[this.index] = i;
			this.index++;
		}
	}
	
	public String exibir(){
        String texto =  "";
       for (int i = 0; i < this.index ; i++) {
            texto += this.vetor[i];
       }
       return texto;
   }
	
	private boolean estaCheia(){
        if (this.index == this.vetor.length)
            return true;
        return false;
   }
	 public int retornarTopo(){
	        return this.vetor[this.index-1];
	    }

}
