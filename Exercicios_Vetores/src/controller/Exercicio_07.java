package controller;

import util.Teclado;

public class Exercicio_07 {

	public static void main(String[] args) {
		String dias[] = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira",
				"Quinta-Feira", "Sexta-Feira", "Sábado"};
		
		int num;
		
		num = Teclado.lerInt("Digite o número do dia da semana: ");
		num--;
		
		if((num < 0) || (num >= 7)){
			System.out.println("Não corresponde a um dia da semana");			
		}else{
			System.out.println(dias[num]);
		}
		
	}

}
