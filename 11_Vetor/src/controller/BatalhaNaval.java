package controller;

import util.Teclado;

public class BatalhaNaval {

	public static void main(String[] args) {
		
		//Primeiro índice da linha, depois o índice da coluna
		String arena[] [] = new String[4][5];
		
		for (int i = 0; i < 4; i++){
			
			for (int j = 0; j < 5; j++){
			
				arena [i][j] = "Água";
				
			}			
		}
		
		arena[2][2] = "Barco";
		arena[1][3] = "Submarino";
		arena[3][3] = "Porta-Aviões";
		arena[0][2] = "Navio";
				
		int linha = Teclado.lerInt("Digite a coordenada linha: ");
		int coluna = Teclado.lerInt("Digite a coordenada da coluna: ");
		
		System.out.println("Você acertou: " + arena[linha][coluna]);
		
	}
}