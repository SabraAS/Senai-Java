package controller;

import model.Produto;

public class Armazem {

	public static void main(String[] args) {
		
		//Lapis - 1º Objeto
		Produto lapis = new Produto();
		lapis.idProduto = 22;
		lapis.nomenClatura = "Lápis Faber Castell";
		lapis.descricao = "Nova Linha de lápis da Faber Castell";
		lapis.quantidade = 547;
		System.out.println("Produto 1:");
		System.out.println("Nomenclatura: " + lapis.nomenClatura);
		System.out.println("Descrição: " + lapis.descricao);
		System.out.println("ID do Produto: " + lapis.idProduto);
		System.out.println("Quantidade: " + lapis.quantidade);
		
		//Lapis - 2º Objeto
		Produto borracha = new Produto();
		borracha.idProduto = 15;
		borracha.nomenClatura = "Borracha Limpa Papel";
		borracha.descricao = "Borracha que apaga tinta de caneta";
		borracha.quantidade = 360;
		System.out.println("\nProduto 2:");
		System.out.println("Nomenclatura: " + borracha.nomenClatura);
		System.out.println("Descrição: " + borracha.descricao);
		System.out.println("ID do Produto: " + borracha.idProduto);
		System.out.println("Quantidade: " + borracha.quantidade);
		
		//Lapis - 3º Objeto
		Produto apontador = new Produto();
		apontador.idProduto = 31;
		apontador.nomenClatura = "Apontador Irias";
		apontador.descricao = "O apontador que aponta sua caneta";
		apontador.quantidade = 122;
		System.out.println("\nProduto 3:");
		System.out.println("Nomenclatura: " + apontador.nomenClatura);
		System.out.println("Descrição: " + apontador.descricao);
		System.out.println("ID do Produto: " + apontador.idProduto);
		System.out.println("Quantidade: " + apontador.quantidade);
		
	}

}
