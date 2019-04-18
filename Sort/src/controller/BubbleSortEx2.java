package controller;


public class BubbleSortEx2 {
	
	public static void main(String args[]) {
		int[] vet = new int[10000];
		int aux = 0;
		int i = 0;
		
		for(int x = 0; x < vet.length; x++) {
			double valSorteado = Math.random();
			vet[x] = (int) (valSorteado * 10000);
		}
		
		System.out.println("Vetor desordenado: ");
		for(i = 0; i < 10000; i++) {
			System.out.println(" "+vet[i]);
		}
		
		System.out.println(" ");
		for (i = 0; i<10000; i++) {
			for (int j = 0; j < 9999; j++) {
				if(vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		
		System.out.println("Vetor ordenado:");
		for(i = 0; i < 10000; i++) {
			System.out.println(" "+vet[i]);
		}
	}

}
