package controller;

import util.Teclado;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		// Instanciando e pedindo o valor da Vari�vel
		int num;
		num = Teclado.lerInt("Informe um n�mero: ");
		
		if(num > 1000){
			
			System.out.println(num + " � maior que 1000");
			
		}else if(num == 1000){
			
			System.out.println(num + " � igual a 1000");
			
		}else{
			
			System.out.println(num + " � menor que 1000");
			
		}
		
	}

}
