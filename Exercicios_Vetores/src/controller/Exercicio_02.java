package controller;

import util.Teclado;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		int soma = 0;
		
		for(int i = 0; i < a.length; i++){			
			a[i] = Teclado.lerInt("Digite o " + (i + 1) + "° elemento do vetor A: ");
		}
		
		for(int y = 0; y < a.length; y++){
			soma = a[y] + soma;
		}
		
		System.out.println("A soma dos valores do vetor A é " + soma);
	}

}
