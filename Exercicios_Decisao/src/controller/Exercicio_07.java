package controller;

import util.Teclado;

public class Exercicio_07 {

	public static void main(String[] args) {

		//Instanciando e pedindo o valor da Vari�vel
		int num;
		num = Teclado.lerInt("Informe um n�mero: ");
		
		if(num < 1000){
			
			System.out.println("\n" + num + " � menor que 1000");
			
		}else if(num >= 1000 && num <= 5000){
			
			System.out.println("\n" + num + " est� entre 1000 e 5000");
			
		}else{
			
			System.out.println("\n" + num + " � maior que 5000");
			
		}
		
	}

}
