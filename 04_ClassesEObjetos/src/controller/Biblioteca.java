package controller;

import model.Livro;

public class Biblioteca {

	public static void main(String[] args) {
		
		//Livro 1 - 1º Objeto
		Livro book = new Livro();
		book.isbn = 321466;
		book.nome = "Percy Jackson";
		book.autor = "Jack Sparow";
		book.editora = "Arqueiro";
		System.out.println("Livro 1:");
		System.out.println("Nome: " + book.nome);
		System.out.println("Autor: " + book.autor);
		System.out.println("Editora: " + book.editora);
		System.out.println("ISBN: " + book.isbn);
		
		//Livro 1 - 1º Objeto
		Livro book2 = new Livro();
		book2.isbn = 427789;
		book2.nome = "Você é o próximo";
		book2.autor = "Matt Handson";
		book2.editora = "Penide";
		System.out.println("\nLivro 2:");
		System.out.println("Nome: " + book2.nome);
		System.out.println("Autor: " + book2.autor);
		System.out.println("Editora: " + book2.editora);
		System.out.println("ISBN: " + book2.isbn);
		
		//Livro 1 - 1º Objeto
		Livro book3 = new Livro();
		book3.isbn = 245568;
		book3.nome = "Asas de destruição";
		book3.autor = "Fernando Relento";
		book3.editora = "Ferreiro";
		System.out.println("\nLivro 3:");
		System.out.println("Nome: " + book3.nome);
		System.out.println("Autor: " + book3.autor);
		System.out.println("Editora: " + book3.editora);
		System.out.println("ISBN: " + book3.isbn);
		
	}

}
