package model;

public class Usuario {

	public int matricula;
	public String login;
	public String senha;
	public String nome;
	public String email;
	public String telefone;

	// Construtor padr�o de Classe
	// Objeto vazio para o momento que o usu�rio ainda n�o cadastrou dados
	public Usuario() {
		super();
		// Super faz refer�ncia � super Classe
		// Toda Classe java � sub Classe da Classe Object
	}

	// Construtor com atributos da Classe. Ser� utilizado para o usu�rio efetuar
	// o cadastro
	public Usuario(int matricula, String login, String senha, String nome,
			String email, String telefone) {
		super();
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = nome;
		this.telefone = telefone;
	}

	public void mostrar() {
		// Mostrando na Tela os valores do Objeto da Classe Usu�rio
		// IMPRIMINDO USU�RIO
		System.out.println("\n\nUsu�rio:\n");
		System.out.println("Matr�cula: " + this.matricula);
		System.out.println("Login: " + this.login);
		System.out.println("Senha: " + this.senha);
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}
}
