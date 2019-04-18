package model;

public class ItemDePedido {
	
	private Notebook notebook;
	


	public ItemDePedido(int qtde, double subtotal,Notebook notebook) {
		super();
		this.notebook = notebook;
		this.qtde = qtde;
		this.subtotal = subtotal;
	}

	public Notebook getNotebook() {
		return notebook;
	}

	private int qtde;
	private double subtotal;
	
	public ItemDePedido() {
		super();
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
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

	public void mostrar() {
		// Mostrar item de pedido
		System.out.println("\n\nItem de Pedido:\n");
		System.out.println("Quantidade: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);
		
	}
	
}
