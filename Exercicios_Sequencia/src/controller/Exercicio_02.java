package controller;

import util.Teclado;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		// Instanciando as vari�veis
		double salar, salarMin,result;
		
		// Perguntando os valores
		salarMin = Teclado.lerDouble("Digite o valor do atual sal�rio m�nimo: ");
		salar = Teclado.lerDouble("Agora digite o valor do seu sal�rio: ");
		
		result = salar / salarMin;
		
		System.out.println("\nVoc� recebe " + result + " sal�rio(s) m�nimo(s)");
	}

}
