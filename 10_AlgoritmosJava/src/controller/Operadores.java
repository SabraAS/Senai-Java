package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {

		// Nome
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");

		// Notas
		double not1, not2, not3, not4, media;
		not1 = Teclado.lerInt("Digite a 1ª nota: ");
		not2 = Teclado.lerInt("Digite a 2ª nota: ");
		not3 = Teclado.lerInt("Digite a 3ª nota: ");
		not4 = Teclado.lerInt("Digite a 4ª nota: ");

		// Media
		media = (not1 + not2 + not3 + not4) / 4;

		System.out.println(nome + " a sua média é: " + media);
	}
}