package controller;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		int i, soma;
		soma = 0;
		
		for(i = 0; i <= 50; i++){
			
			soma = i + soma;
			
		}
		
		System.out.println("A soma dos números que existem no intervalo de 0 a 50 é: " + soma);
		
	}

}