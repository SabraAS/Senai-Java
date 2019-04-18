package controller;

import util.Teclado;

public class Exercicio_12 {

	public static void main(String[] args) {

		int a[] = new int[5];
		int b[] = new int[5];
		
		for(int i = 0; i < a.length; i++){
			a[i] = Teclado.lerInt("Digite o " + (i + 1) + "º número do vetor A: ");
			b[i] = Teclado.lerInt("Digite o " + (i + 1) + "º número do vetor B: ");
		}
		
		System.out.print("\n\nNúmeros Repetidos: ");
		
		for(int i = 0; i < a.length; i++){
			
			for(int y = 0; y < b.length; y++){
				
				if(a[i] == b[y]){
				
					System.out.print(a[i] + " ");
				
				}				
			}
		}
	}

}
