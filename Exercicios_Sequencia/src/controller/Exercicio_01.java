package controller;

import util.Teclado;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		// Instanciando as vari�veis
		double numerador, denominador, result;
		
		// Perguntando o valor das Vari�veis
		numerador = Teclado.lerDouble("Digite o valor do numerador: ");
		denominador = Teclado.lerDouble("Digite o valor do denominador: ");
		
		result = numerador / denominador;
		
		System.out.println("O valor final �: " + result);
	}

}