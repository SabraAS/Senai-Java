package controller;

import util.Teclado;

public class Exercicio_05 {

	public static void main(String[] args) {

		// Instanciando as variáveis
		int num, a, b, c;
		num = Teclado.lerInt("Digite um número de 3 dígitos: ");
		 
	    a= num / 100; 
	    b= (num % 100) / 10; 
	    c= (num % 100) % 10; 
	    
	    // Imprimindo os valores
	    System.out.println(c + "" + b + "" + a); 

	}

}