package controller;

import util.Teclado;

public class Exercicio_05 {

	public static void main(String[] args) {

		int a[] = new int[5];
		int b[] = new int[5];

		for(int i = 0; i < a.length; i++){
			a[i] = Teclado.lerInt("Digite um valor: ");
			b[i] = a[i] * a[i];
		}

		System.out.println();
		System.out.println("Os valores de B, que são os valores de A multiplicados por 3, são: ");
		System.out.println();

		for(int y = 0; y < b.length; y++){
			System.out.println("A" + (y + 1) + ": " + a[y] + "  |  B" + (y + 1) + ": " + b[y]);
		}

	}

}