package model;

public class ItemDePedido {

	private String itemDeP;
	private int qtde;
	private double subtotal;

	public ItemDePedido() {
		super();
	}
	
	public String getItemDeP() {
		return itemDeP;
	}

	public void setItemDeP(String itemDeP) {
		this.itemDeP = itemDeP;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public ItemDePedido(String itemDeP, int qtde, double subtotal) {
		super();
		this.itemDeP = itemDeP;
		this.qtde = qtde;
		this.subtotal = subtotal;
	}

	public void mostrar() {
		// IMPRIMINDO ITENS:
		System.out.println("\n\n\n" + this.itemDeP + ":");
		System.out.println("Quantidade: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);
	}
}