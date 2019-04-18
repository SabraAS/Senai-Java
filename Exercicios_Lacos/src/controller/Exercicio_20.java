package controller;

public class Exercicio_20 {

	public static void main(String[] args) {
		
		int i, soma;
		i = 5;
		soma = 0;
		
		do{
			
			soma = i + soma;
			i = i + 5;
			
		}while(i < 50);
		
		System.out.println("O valor da soma dos números múltiplos de 5 que existem no intervalo de 0 a 50 é: " + soma);
		
	}

}