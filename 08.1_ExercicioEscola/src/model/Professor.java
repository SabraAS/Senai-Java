package model;

public class Professor {

	private String nome;
	private String telefone;
	private String registroFuncional;
	private String dataDeNascimento;

	public Professor(String nome, String telefone, String registroFuncional, String dataDeNascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
		this.registroFuncional = registroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRegistroFuncional() {
		return registroFuncional;
	}

	public void setRegistroFuncional(String registroFuncional) {
		this.registroFuncional = registroFuncional;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public void mostrar() {
		System.out.println("\nProfessor: \n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Data de Nascimento: " + this.dataDeNascimento);
		System.out.println("Registro Funcional: " + this.registroFuncional);
	}
}