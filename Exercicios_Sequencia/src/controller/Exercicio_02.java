package controller;

import util.Teclado;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		// Instanciando as variáveis
		double salar, salarMin,result;
		
		// Perguntando os valores
		salarMin = Teclado.lerDouble("Digite o valor do atual salário mínimo: ");
		salar = Teclado.lerDouble("Agora digite o valor do seu salário: ");
		
		result = salar / salarMin;
		
		System.out.println("\nVocê recebe " + result + " salário(s) mínimo(s)");
	}

}
