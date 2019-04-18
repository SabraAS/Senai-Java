package controller;

import java.util.Arrays;
import util.Teclado;

public class Exercicio_15 {

	public static void main(String[] args) {
			
	        int a[] = new int[15];
	        
	        for (int i = 0; i < 15; i++){
	        	a[i] = Teclado.lerInt("Digite um número");
	        }
	        
	        System.out.println("\nVetor original");
	        
	        for (int i = 0 ; i < 15; i++){
	        	System.out.println(a[i]);
	        }
	        
	        Arrays.sort(a);
	        
	        System.out.println("\nVetor organizado de forma decrescente:");
	        for(int i = 14 ; i >= 0; i--){
	        	System.out.println(a[i]);
        }	        
    }
}