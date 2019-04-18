package controller;

import util.Teclado;

public class BubbleSortEx1 {
	
	public static void main(String args[]) {
		int[] vet = new int[5];
		int aux = 0;
		int i = 0;
		
		for(int x = 0; x < vet.length; x++) {
			vet[x] = Teclado.lerInt("Digite 5 números aleatórios:");
		}
		
		System.out.println("Vetor desordenado: ");
		
		for(i = 0; i<5; i++) {
			System.out.println(" "+vet[i]);
		}
		
		System.out.println(" ");
		
		for (i = 0; i<5; i++) {
			for (int j = 0; j<4; j++) {
				if(vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j+1];	
					vet[j+1] = aux;
				}
			}
		}
		
		System.out.println("Vetor ordenado:");
		for(i = 0; i<5; i++) {
			System.out.println(" "+vet[i]);
		}
	}

}
