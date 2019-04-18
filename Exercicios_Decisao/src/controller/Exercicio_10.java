package controller;

import util.Teclado;

public class Exercicio_10 {

	public static void main(String[] args) {

		// Instanciando e peguntando o valor da Variável
		String estado;
		estado = Teclado.lerTexto("Digite o nome de um estado brasileiro: ");

		if (estado.equals("Rio de Janeiro") || estado.equals("São Paulo") || estado.equals("Minas Gerais") || estado.equals("Espírito Santo")) {

			System.out.println(estado + " está na região Sudeste");

		} else {

			System.out.println(estado + " não está na região Sudeste");

		}
	}

}