package model;

public class Usuario {

	public int matricula;
	public String login;
	public String senha;
	public String nome;
	public String email;
	public String telefone;

	// Construtor padrão de Classe
	// Objeto vazio para o momento que o usuário ainda não cadastrou dados
	public Usuario() {
		super();
		// Super faz referência à super Classe
		// Toda Classe java é sub Classe da Classe Object
	}

	// Construtor com atributos da Classe. Será utilizado para o usuário efetuar
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
		// Mostrando na Tela os valores do Objeto da Classe Usuário
		// IMPRIMINDO USUÁRIO
		System.out.println("\n\nUsuário:\n");
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Login: " + this.login);
		System.out.println("Senha: " + this.senha);
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}
}
