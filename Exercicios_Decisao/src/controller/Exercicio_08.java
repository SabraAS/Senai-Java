package controller;

import util.Teclado;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		// Instanciando e pedindo o valor das Variáveis
		int num;
		num = Teclado.lerInt("Digite um valor: ");
		
if(num < 1000){
			
			System.out.println("\n" + num + " é menor que 1000");
			
		}else if(num >= 1000 && num < 5000){
			
			System.out.println("\n" + num + " está entre 1000 e 5000");
			
		}else if(num >= 5000 && num <= 8000){
			
			System.out.println("\n" + num + " está entre 5000 e 8000");
			
		}else{
			
			System.out.println("\n" + num + " está acima de 8000");
			
		}
		
	}

}
