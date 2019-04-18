package controller;

import util.Teclado;

public class Exercicio_15 {

	public static void main(String[] args) {

		// Instanciando e perguntando o valor das Variáveis
		String nome, situacao;
		double nota1, nota2, media;

		nome = Teclado.lerTexto("Digite seu nome: ");

		nota1 = Teclado.lerDouble("\nDigite a 1ª nota: ");
		nota2 = Teclado.lerDouble("Digite a 2ª nota: ");

		media = (nota1 + nota2) / 2;

		if (media < 3) {

			situacao = "REPROVADO";
			System.out.println("\nALUNO: " + nome);
			System.out.println("MÉDIA: " + media);
			System.out.println("SITUAÇÃO: " + situacao);

		} else if (media >= 3 && media < 7) {

			situacao = "PROVA FINAL";
			System.out.println("\nALUNO: " + nome);
			System.out.println("MÉDIA: " + media);
			System.out.println("SITUAÇÃO: " + situacao);

		} else {

			situacao = "APROVADO";
			System.out.println("\nALUNO: " + nome);
			System.out.println("MÉDIA: " + media);
			System.out.println("SITUAÇÃO: " + situacao);

		}

	}
	
}