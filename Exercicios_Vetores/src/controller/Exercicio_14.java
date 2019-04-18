package controller;

import util.Teclado;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		int a[] = new int[15];
		int b[] = new int[15];
		int fat = 1;
		
		for(int i = 0; i < a.length; i++){
			
			a[i] = Teclado.lerInt("Digite o " + (i + 1) + "º número do vetor A: ");
			
			for(int j = 1; j <= a[i]; j++){
				fat = fat * j;
			}
			b[i] = fat;
			fat = 1;
		}

		System.out.println("\n\nOs números correspondentes do vetor A, porém fatorados:");
		
		for(int i = 0; i < a.length; i++){
			System.out.println("N° " + (i + 1) + ": " + b[i]);
		}		
	}
}