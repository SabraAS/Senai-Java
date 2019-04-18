package controller;

import util.Teclado;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		// Instanciando e perguntando o valor da Variável ao Usuário
		int num1, num2, num3, maior;
		
		num1 = Teclado.lerInt("Digite o 1º número: "); 
		num2 = Teclado.lerInt("Digite o 2º número: ");
		num3 = Teclado.lerInt("Digite o 3º número: ");
		
		maior = num1;
		
		if(maior < num2){
			
			maior = num2;
			
		}
		
		if(maior < num3){
			
			maior = num3;
			
		}
		
		System.out.println("O maior número é " + maior);
		
	}

}