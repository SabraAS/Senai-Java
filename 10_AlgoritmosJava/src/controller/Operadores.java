package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {

		// Nome
		String nome;
		nome = Teclado.lerTexto("Digite seu nome: ");

		// Notas
		double not1, not2, not3, not4, media;
		not1 = Teclado.lerInt("Digite a 1� nota: ");
		not2 = Teclado.lerInt("Digite a 2� nota: ");
		not3 = Teclado.lerInt("Digite a 3� nota: ");
		not4 = Teclado.lerInt("Digite a 4� nota: ");

		// Media
		media = (not1 + not2 + not3 + not4) / 4;

		System.out.println(nome + " a sua m�dia �: " + media);
	}
}