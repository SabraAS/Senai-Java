package controller;

import util.Teclado;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		// Instanciando as variáveis
		double numerador, denominador, result;
		
		// Perguntando o valor das Variáveis
		numerador = Teclado.lerDouble("Digite o valor do numerador: ");
		denominador = Teclado.lerDouble("Digite o valor do denominador: ");
		
		result = numerador / denominador;
		
		System.out.println("O valor final é: " + result);
	}

}