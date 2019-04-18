package controller;

import util.Teclado;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		int a[] = new int[8];
		int b[] = new int[8];
		
		for(int i = 0; i < a.length; i++){
			a[i] = Teclado.lerInt("Digite um valor: ");
			b[i] = a[i] * 3;
		}
		
		System.out.println();
		System.out.println("Os valores de B, que são os valores de A multiplicados por 3, são: ");
		System.out.println();
		
		for(int y = 0; y < b.length; y++){
			System.out.println((y + 1) + "° número: " + b[y]);
		}

	}

}
