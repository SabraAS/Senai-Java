package controller;

import util.Teclado;

public class Exercicio {
	
	public static void main(String[] args) {
		
		
		Double altura[] = new Double[10];
		Double peso[] = new Double[10];
		Double imc[]= new Double[10];
		String nome[] = new String[10];
		
		for(int i = 0; i < altura.length; i++) {
			altura[i] = Teclado.lerDouble(" Digite a altura:");
			peso[i] = Teclado.lerDouble(" Digite o peso:");
			nome[i] = Teclado.lerTexto(" Digite o nome:");
			imc[i] = peso[i] / (altura[i] * altura[i]);
			
				
			
		}
		for(int i = 0 ; i < imc.length; i++) {
			System.out.println("O imc é: " + imc[i]);
			
		}
		
		
		
		
		
	}
	
	
	

}