package controller;

import util.Teclado;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		// Instanciando e perguntando o valor da Vari�vel ao Usu�rio
		int num1, num2, num3, maior;
		
		num1 = Teclado.lerInt("Digite o 1� n�mero: "); 
		num2 = Teclado.lerInt("Digite o 2� n�mero: ");
		num3 = Teclado.lerInt("Digite o 3� n�mero: ");
		
		maior = num1;
		
		if(maior < num2){
			
			maior = num2;
			
		}
		
		if(maior < num3){
			
			maior = num3;
			
		}
		
		System.out.println("O maior n�mero � " + maior);
		
	}

}