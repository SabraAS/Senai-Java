package controller;

import util.Teclado;

public class Exercicio_21 {

	public static void main(String[] args) {

		int i, menores, idade;
		i = 1;
		menores = 0;

		while (i <= 10) {

			idade = Teclado.lerInt("Digite sua idade: ");

			if (idade < 18) {
				menores++;
			}
			i++;

		}
		
		System.out.println("Das pessoas " + menores + " são menores de idade");

	}

}