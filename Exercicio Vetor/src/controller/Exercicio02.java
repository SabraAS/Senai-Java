package controller;

import util.Teclado;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		int num1[] = new int [10];
		int aux = 0;
		
		for (int i = 0; i < 10; i++) {
			num[i] = Teclado.lerInt("Digite um número: ");
			
			if ((num[i] % 3 == 0) || (num[i] % 5 == 0)) {
				num1[aux] = num[i];
				aux++;
			}
		}
		
		for (int i = 0; i< aux; i++) {
			System.out.println("Vetor resultado: " + num1[i]);
		}
	}
	
	
	
}
