package controller;
 import util.teclado;
public class BubbleSort {
	public static void main(String args[]){
		int[] vet = new int[10000];
		int aux = 0;
		int i = 0;
		int y = 0;
		
		for( int x = 0; x<10000; x++) {
			vet [x] = teclado.lerInt("digite 5 números");
		}
		
		System.out.println("Vetor desordenado: ");
		for(i = 0; i<5; i++){
			System.out.println(" "+vet[i]);
		}
		System.out.println(" ");
		
		for(i = 0; i<5; i++){
			for(int j = 0; j<4; j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor organizado:");
		for(i = 0; i<10000; i++){
			System.out.println(" "+vet[i]);
		}
	}
}

