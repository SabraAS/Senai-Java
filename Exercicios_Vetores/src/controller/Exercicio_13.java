package controller;

import util.Teclado;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		String nome[] = new String[20];
		int sal[] = new int[20];
		int newSal[] = new int[20];
		
		for(int i = 0; i < nome.length; i++){
			nome[i] = Teclado.lerTexto("Digite seu nome: ");
			sal[i] = Teclado.lerInt("Agora digite seu salário: ");
			newSal[i] = sal[i] * 108/100;
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < nome.length; i++){
			System.out.println("NOME: " + nome[i]);
			System.out.println("NOVO SALÁRIO: " + newSal[i]);
			System.out.println();
		}

	}

}
