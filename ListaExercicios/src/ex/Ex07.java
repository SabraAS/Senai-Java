package ex;

import util.Teclado;

public class Ex07 {
	
	public static void main(String[] args) {
			
		
		int a, b, auxiliar, i, n;
	
		a=0;
		b=1;
		
		n= Teclado.lerInt("Digite um número: ");
		
		System.out.println(1);
		for (i=0; i<n; i++) {
			auxiliar = b + a;
			a = b;
			b = auxiliar;
			
			System.out.println("\n" + auxiliar);
		}
	
			}
		}
	
		


	 
	 
	  