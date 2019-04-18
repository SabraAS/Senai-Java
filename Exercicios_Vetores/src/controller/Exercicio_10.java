package controller;

import util.Teclado;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		String nome[] = new String[5];
		String telefone[] = new String[5];
		String endereco[] = new String[5];
		
		for(int i = 0; i < nome.length; i++){
			
			nome[i] = Teclado.lerTexto("Digite seu nome: ");
			telefone[i] = Teclado.lerTexto("Digite seu Telefone: ");
			endereco[i] = Teclado.lerTexto("Digite seu endereço: ");
			System.out.println();
			
		}
		
		int num = Teclado.lerInt("Digite um número para que seja mostrado os dados da pessoa correspondente: ");
		
		int resto = num - 1;
		
		System.out.println("NOME: " + nome[resto] + " || TEL: " + telefone[resto] + " || ENDEREÇO: " + endereco[resto]);

	}

}