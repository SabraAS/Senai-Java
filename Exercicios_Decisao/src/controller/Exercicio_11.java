package controller;

import util.Teclado;

public class Exercicio_11 {

	public static void main(String[] args) {

		// Instanciando e perguntando os valores das Variáveis
		int ano, anoAtual;

		ano = Teclado.lerInt("Informe o ano que você nasceu: ");
		anoAtual = Teclado.lerInt("\nInforme o ano atual: ");

		if (anoAtual < ano) {

			System.out.println("\n\nDados inseridos estão incorretos");

		} else {

			System.out.println("\nVocê tem " + (anoAtual - ano) + " anos");

		}
	}

}