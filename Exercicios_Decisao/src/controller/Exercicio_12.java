package controller;

import util.Teclado;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		// Instanciando e peguntando o valor da Variável
		int a, b;
		
		a = Teclado.lerInt("Informe o 1º número: ");
		b = Teclado.lerInt("Informe o 2º número: ");
		
		if(a > b){
			
			System.out.println(a + " é maior que " + b);
			
		}else if(b > a){
			
			System.out.println(b + " é maior que " + a);
			
		}else{
			
			System.out.println(a + " e " + b + " são iguais");
			
		}
	}

}