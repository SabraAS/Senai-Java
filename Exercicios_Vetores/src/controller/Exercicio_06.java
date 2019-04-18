package controller;

import util.Teclado;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		int a[] = new int[20];
		int b[] = new int[20];
		
		for(int i = 0; i < a.length; i++){
			a[i] = Teclado.lerInt("Digite um valor: ");
			b[19 - i] = a[i];
		}
		
		for(int y = 0; y < b.length; y++){
			System.out.println("A" + (y + 1) + ": " + a[y] + "   |  B" + (y + 1) + ": " + b[y]);
		}
		
	}

}
