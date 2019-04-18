package controller;

import util.Teclado;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		// Instanciando e pedindo o valor da Variável
		int num;
		num = Teclado.lerInt("Informe um número: ");
		
		if(num > 1000){
			
			System.out.println(num + " é maior que 1000");
			
		}else if(num == 1000){
			
			System.out.println(num + " é igual a 1000");
			
		}else{
			
			System.out.println(num + " é menor que 1000");
			
		}
		
	}

}
