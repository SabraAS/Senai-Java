package controller;

import model.Usuario;

public class Cadastro {
	
	public static void main(String[] args) {
		
		//Criando (instanciando) um objeto da Classe Usuario
		//ClasseDeOrigem objeto = new ClasseDeOrigem();
		Usuario user = new Usuario();
		user.nome = "Jo�o da Silva Sauro";
		user.endereco = "Rua Sem Fim, 72";
		System.out.println("Nome do usu�rio: " + user.nome);
		System.out.println("Endere�o do usu�rio: " + user.endereco);
		
		Usuario user2 = new Usuario();
		user2.nome = "Fabr�cio Curvello";
		user2.endereco = "Rua S�o Francisco Xavier, 417";
		System.out.println("Nome do usu�rio: " + user2.nome);
		System.out.println("Endere�o do usu�rio: " + user2.endereco);
		
		Usuario user3 = new Usuario();
		user3.nome = "Gabriel Stofel";
		user3.endereco = "Rua Nossa Senhora de Copacabana, 246";
		System.out.println("Nome do usu�rio: " + user3.nome);
		System.out.println("Endere�o do usu�rio: " + user3.endereco);
		
	}
}
