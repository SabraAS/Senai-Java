package controller;

import util.Teclado;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		// Instanciando e peguntando o valor da Vari�vel
		int a, b;
		
		a = Teclado.lerInt("Informe o 1� n�mero: ");
		b = Teclado.lerInt("Informe o 2� n�mero: ");
		
		if(a > b){
			
			System.out.println(a + " � maior que " + b);
			
		}else if(b > a){
			
			System.out.println(b + " � maior que " + a);
			
		}else{
			
			System.out.println(a + " e " + b + " s�o iguais");
			
		}
	}

}