package controller;

import util.Teclado;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		// Instanciando e perguntando o valor das Vari�veis
		int idade;
		idade = Teclado.lerInt("Digite a sua idade: ");
		
		if(idade < 18){
			
			System.out.println("Voc� � menor de idade");
			
		}else if(idade >= 18 && idade < 65){
			
			System.out.println("Voc� � maior de idade");
			
		}else{
			
			System.out.println("Voc� � maior de 65 anos");
			
		}
		
	}
	
}