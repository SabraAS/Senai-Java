package controller;

import util.Teclado;

public class Exercicio_11 {

	public static void main(String[] args) {

		// Instanciando e perguntando os valores das Vari�veis
		int ano, anoAtual;

		ano = Teclado.lerInt("Informe o ano que voc� nasceu: ");
		anoAtual = Teclado.lerInt("\nInforme o ano atual: ");

		if (anoAtual < ano) {

			System.out.println("\n\nDados inseridos est�o incorretos");

		} else {

			System.out.println("\nVoc� tem " + (anoAtual - ano) + " anos");

		}
	}

}