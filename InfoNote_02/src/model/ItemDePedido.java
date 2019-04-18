package model;

public class ItemDePedido {

	public String itemDeP;
	public int qtde;
	public double subtotal;

	public ItemDePedido() {
		super();
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