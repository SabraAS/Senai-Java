package controller;

import util.Teclado;

public class Exercicio_15 {

	public static void main(String[] args) {

		// Instanciando e perguntando o valor das Vari�veis
		String nome, situacao;
		double nota1, nota2, media;

		nome = Teclado.lerTexto("Digite seu nome: ");

		nota1 = Teclado.lerDouble("\nDigite a 1� nota: ");
		nota2 = Teclado.lerDouble("Digite a 2� nota: ");

		media = (nota1 + nota2) / 2;

		if (media < 3) {

			situacao = "REPROVADO";
			System.out.println("\nALUNO: " + nome);
			System.out.println("M�DIA: " + media);
			System.out.println("SITUA��O: " + situacao);

		} else if (media >= 3 && media < 7) {

			situacao = "PROVA FINAL";
			System.out.println("\nALUNO: " + nome);
			System.out.println("M�DIA: " + media);
			System.out.println("SITUA��O: " + situacao);

		} else {

			situacao = "APROVADO";
			System.out.println("\nALUNO: " + nome);
			System.out.println("M�DIA: " + media);
			System.out.println("SITUA��O: " + situacao);

		}

	}
	
}