package controller;

import util.Teclado;

public class Exercicio_05 {

	public static void main(String[] args) {

		// Instanciando as vari�veis
		int num, a, b, c;
		num = Teclado.lerInt("Digite um n�mero de 3 d�gitos: ");
		 
	    a= num / 100; 
	    b= (num % 100) / 10; 
	    c= (num % 100) % 10; 
	    
	    // Imprimindo os valores
	    System.out.println(c + "" + b + "" + a); 

	}

}