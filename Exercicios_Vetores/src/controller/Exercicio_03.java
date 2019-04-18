package controller;

import util.Teclado;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int soma = 0;
		
		for(int i = 0; i < a.length; i++){			
			a[i] = Teclado.lerInt("Digite o " + (i + 1) + "° elemento do vetor A: ");
		}
		
		for(int y = 0; y < a.length; y++){
			if(a[y] % 2 != 0){
				soma = a[y] + soma;	
			}			
		}
		
		System.out.println("A soma dos valores ímpares do vetor A é " + soma);
	}

}