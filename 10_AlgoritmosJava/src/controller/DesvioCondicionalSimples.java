package controller;

import util.Teclado;

public class DesvioCondicionalSimples {

	public static void main(String[] args) {
		
		int a, b, x;
		a = Teclado.lerInt("Informe o 1� n�mero: ");
		b = Teclado.lerInt("Informe o 2� n�mero: ");
		x = a + b;
		
		if(x > 10){
			System.out.println("O valor da soma � " + x);
		}
		
	}

}
