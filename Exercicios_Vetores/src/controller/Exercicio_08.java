package controller;

import util.Teclado;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		String nome[] = new String[15];
		String situacao[] = new String[15];
		int PR1[] = new int [15];
		int PR2[] = new int [15];
		int media[] = new int[15];
		
		for(int i = 0; i < nome.length; i++){
			nome[i] = Teclado.lerTexto("Digite seu nome: ");
			PR1[i] = Teclado.lerInt("Digite a 1ª nota: ");
			PR2[i] = Teclado.lerInt("Digite a 2ª nota: ");
			media[i] = (PR1[i] + PR2[i]) / 2;
			
			if(media[i] >= 6){
				situacao[i] = "Aprovado";
			}else{
				situacao[i] = "Reprovado";
			}
			
		}
		
		for(int y = 0; y < nome.length; y++){
			System.out.println("Aluno: " + nome[y] + " || PR1: " + PR1[y] + " || PR2: " 
		    + PR2[y] + " || MÉDIA: " + media[y] + " || SITUAÇÃO: " + situacao[y]);
		}
		
	}

}