package controller;

import util.Teclado;

public class Exercicio_11 {

	public static void main(String[] args) {

		int a[] = new int[10];
		int maior = 0, menor = 0;
		double media = 0;
		
		for(int i = 0; i < a.length; i++){
			a[i] = Teclado.lerInt("Digite o " + (i + 1) + "º número do vetor A");
			if(maior < a[i]){
				maior = a[i];
			}else if(i == 0){
				maior = a[i];
			}
			
			if(menor > a[i]){
				menor = a[i];
			}else if(i == 0){
				menor = a[i];
			}
			media = media + a[i];
		}

		media = media / 10;
		
		for(int i = 0; i < a.length; i++){
			System.out.println("\n" + (i + 1) + "º = " + a[i]);
		}
		
		System.out.println("\n\nMAIOR: " + maior);
		System.out.println("\nMENOR: " + menor);
		System.out.println("\nMÉDIA: " + media);
	}

}
