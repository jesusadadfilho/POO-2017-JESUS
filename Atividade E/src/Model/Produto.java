package Model;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private int quantidade;
	private int quantidade_minima;
	
	public boolean Baixar(int valor) {
		if(this.quantidade - valor > this.quantidade_minima) {
			this.quantidade -= valor;
			return true;
		}
		return false;
	}
	public void Repor(int valor) {
		this.quantidade += valor;
	}
	
	public Produto(int c,String s,double v,int q,int qm) {
		this.codigo = c;
		this.descricao = s;
		this.valor = v;
		this.quantidade = q;
		this.quantidade_minima = qm;
	}
	public void reajusta(int v) {
		this.valor = this.valor + (this.valor/v);
	}
	@Override
	public String toString() {
		return this.codigo + "," + this.descricao + "," + this.quantidade + "," + this.valor;
	}
	

}
