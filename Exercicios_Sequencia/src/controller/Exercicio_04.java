package controller;

import util.Teclado;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		// Instanciando as vari�veis
		double valorProduto, desconto, valorFinal;
		
		// Perguntando o valor das vari�veis
		valorProduto = Teclado.lerDouble("Digite o valor do produto: ");
		desconto = Teclado.lerDouble("Digite a porcentagem do desconto: ");
		
		valorFinal = valorProduto - (valorProduto * (desconto / 100));
		
		System.out.println("\nO valor final do produto ser�: " + valorFinal);
		
	}

}