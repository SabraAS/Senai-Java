package controller;

import util.Teclado;

public class Exercicio_24 {

	public static void main(String[] args) {
		int num, i;
		num = 0;
		
		for(i = -1; num >= 0; i++){			
		
			num = Teclado.lerInt("Digite um número positivo:");
		
		}
		
		System.out.println("\n\nVocê digitou " + i + " números positivos");
	}
}