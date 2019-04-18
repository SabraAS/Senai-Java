package controller;

import util.Teclado;

public class Exercicio_07 {

	public static void main(String[] args) {
		String dias[] = {"Domingo", "Segunda-Feira", "Ter�a-Feira", "Quarta-Feira",
				"Quinta-Feira", "Sexta-Feira", "S�bado"};
		
		int num;
		
		num = Teclado.lerInt("Digite o n�mero do dia da semana: ");
		num--;
		
		if((num < 0) || (num >= 7)){
			System.out.println("N�o corresponde a um dia da semana");			
		}else{
			System.out.println(dias[num]);
		}
		
	}

}
