package controller;

import util.Teclado;

public class Exercicio_10 {

	public static void main(String[] args) {

		// Instanciando e peguntando o valor da Vari�vel
		String estado;
		estado = Teclado.lerTexto("Digite o nome de um estado brasileiro: ");

		if (estado.equals("Rio de Janeiro") || estado.equals("S�o Paulo") || estado.equals("Minas Gerais") || estado.equals("Esp�rito Santo")) {

			System.out.println(estado + " est� na regi�o Sudeste");

		} else {

			System.out.println(estado + " n�o est� na regi�o Sudeste");

		}
	}

}