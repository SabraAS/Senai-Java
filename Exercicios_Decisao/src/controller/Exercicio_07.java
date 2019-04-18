package controller;

import util.Teclado;

public class Exercicio_07 {

	public static void main(String[] args) {

		//Instanciando e pedindo o valor da Variável
		int num;
		num = Teclado.lerInt("Informe um número: ");
		
		if(num < 1000){
			
			System.out.println("\n" + num + " é menor que 1000");
			
		}else if(num >= 1000 && num <= 5000){
			
			System.out.println("\n" + num + " está entre 1000 e 5000");
			
		}else{
			
			System.out.println("\n" + num + " é maior que 5000");
			
		}
		
	}

}
