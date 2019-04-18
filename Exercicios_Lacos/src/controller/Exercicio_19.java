package controller;

public class Exercicio_19 {

	public static void main(String[] args) {
		int i, soma;
		soma = 0;

		for (i = 0; i <= 50; i = i + 2) {

			soma += i;

		}

		System.out.println("A soma dos números pares que existem no intervalo de 0 a 50 é: " + soma);
	}

}