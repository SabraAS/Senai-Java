package model;

public class Notebook {

	public String note;
	public int numeroNote;
	public String modelo;
	public String descricao;
	public int estoque;
	public double precoUnitario;
	public String figura;
	public String dataCadastro;

	public Notebook() {
		super();
	}

	public Notebook(String note, int numeroNote, String modelo, String descricao,
			int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		super();
		this.note = note;
		this.numeroNote = numeroNote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}

	public void mostrar() {
		// IMPRIMINDO NOTES
		System.out.println("\n\n" + this.note + ":");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Descri��o: " + this.descricao);
		System.out.println("N�mero do Notebook: " + this.numeroNote);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("Pre�o Unit�rio: " + this.precoUnitario);
		System.out.println("Figura: " + this.figura);
		System.out.println("Data de Cadastro: " + this.dataCadastro);
	}
}