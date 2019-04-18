package controller;

import model.Usuario;

public class Cadastro {
	
	public static void main(String[] args) {
		
		//Criando (instanciando) um objeto da Classe Usuario
		//ClasseDeOrigem objeto = new ClasseDeOrigem();
		Usuario user = new Usuario();
		user.nome = "João da Silva Sauro";
		user.endereco = "Rua Sem Fim, 72";
		System.out.println("Nome do usuário: " + user.nome);
		System.out.println("Endereço do usuário: " + user.endereco);
		
		Usuario user2 = new Usuario();
		user2.nome = "Fabrício Curvello";
		user2.endereco = "Rua São Francisco Xavier, 417";
		System.out.println("Nome do usuário: " + user2.nome);
		System.out.println("Endereço do usuário: " + user2.endereco);
		
		Usuario user3 = new Usuario();
		user3.nome = "Gabriel Stofel";
		user3.endereco = "Rua Nossa Senhora de Copacabana, 246";
		System.out.println("Nome do usuário: " + user3.nome);
		System.out.println("Endereço do usuário: " + user3.endereco);
		
	}
}
