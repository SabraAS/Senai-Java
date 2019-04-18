package model;

public abstract class Produto {

	private String descricao;
	private int quantidade;
	public Produto(String descricao, int quantidade) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	public Produto() {
		super();
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", quantidade=" + quantidade + "]";
	}
	
	public abstract boolean realizarCompra();
	
}
