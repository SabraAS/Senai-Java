package ex;

import util.Teclado;

public class Ex_02 {
	public static void main(String[] args) {
		int v = Teclado.lerInt("Digite o tamanho do vetor (>39): ");
		if (v < 40) {
			System.out.println("Tamanho incorreto");
			main(args);
		}
		
		int x[] = new int[v];
		for (int i = 0; i < v; i++) {
			x[i] = Teclado.lerInt("Digite o termo: "+ i);
		}
		int y[] = new int[30];
		
		for (int i = 0; i < y.length; i++) {
			y[i] = x[i + 10];
		}
		
		for (int i = 0; i<y.length; i++) {
			System.out.println("Vetor Y: "+ y[i]);
		}
		
		int[] w = new int[v/2];
		
		for (int i = 0; i<w.length; i++) {
			if (i%2 == 0) {
			w[i] = x[i];
		}
	  }
		
			
	}

}
