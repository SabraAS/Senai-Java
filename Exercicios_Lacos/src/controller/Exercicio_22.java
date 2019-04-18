package controller;

import util.Teclado;

public class Exercicio_22 {

	public static void main(String[] args) {

		int i, num;
		i = 1;

		num = Teclado.lerInt("Digite um número positivo:");

		if (num > 0) {
			while (i <= num) {
				System.out.println(i);
				i++;
			}			
		}else{
			System.out.println("Seu número não é positivo");
		}

	}

}