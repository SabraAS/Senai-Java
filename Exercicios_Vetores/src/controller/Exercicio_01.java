package controller;

import util.Teclado;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		String nome[] = new String[5];
		String profissao[] = new String[5];
		
		for(int i = 0; i < profissao.length; i++){
			nome[i] = Teclado.lerTexto("Digite o nome do " + (i + 1) +"� funcion�rio: ");
			profissao[i] = Teclado.lerTexto("Digite a profiss�o do(a) " + nome[i] + ": ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int y = 0; y < 5; y++){
			System.out.println("Nome: " + nome[y]);
			System.out.print("   Profiss�o: " + profissao[y]);
			System.out.println();
		}
	}

}
