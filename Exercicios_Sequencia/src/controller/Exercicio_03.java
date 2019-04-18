package controller;

import util.Teclado;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		// Instanciando as variáveis
		double valor, result1, result2;
		
		// Perguntando os valores ao Usuário
		valor = Teclado.lerDouble("Digite um valor: ");
		
		result1 = valor * 1.18;
		result2 = valor - (valor * 0.65);
		
		System.out.println("\n"+valor + " com acréscimo de 18% é igual a " + result1);
		System.out.println(valor + " com desconto de 65% é igual a " + result2);
	}

}
