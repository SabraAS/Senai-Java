package controller;

import util.Teclado;

public class Exercicio_23 {

	public static void main(String[] args) {
		
		int i, num, soma, media;
		i = 1;
		soma = 0;
		
		do{
			
			num = Teclado.lerInt("Digite o " + i + "� n�mero");
			soma = soma + num;
			i++;
			
		}while(i <= 20);
		
		media = soma / 20;
		
		System.out.println("A m�dia de todos estes n�meros � " + media);
		
	}

}