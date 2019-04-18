package controller;

import util.Teclado;

public class Exercicio_09 {

	public static void main(String[] args) {

		// Instanciando e pedindo o valor das Variáveis
		int num;
		num = Teclado.lerInt("Digite um valor de 1 a 7: ");

		if (num == 1) {

			System.out.println("Dia correspondente: DOMINGO");

		} else if (num == 2) {

			System.out.println("Dia correspondente: SEGUNDA-FEIRA");

		} else if (num == 3) {

			System.out.println("Dia correspondente: TERÇA-FEIRA");

		} else if (num == 4) {

			System.out.println("Dia correspondente: QUARTA-FEIRA");

		} else if (num == 5) {

			System.out.println("Dia correspondente: QUINTA-FEIRA");

		} else if (num == 6) {

			System.out.println("Dia correspondente: SEXTA-FEIRA");

		} else if (num == 7) {

			System.out.println("Dia correspondente: SÁBADO");

		} else {

			System.out.println("DIGITE UM VALOR VÁLIDO!");

		}
		
	}

}