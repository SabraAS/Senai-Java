package ex;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();
		
		if(numero != 2) {
		for (int i = 2; i < numero; i++) {
			if ((numero % i) != 0) {
			System.out.println("� primo");
			}else {
				System.out.println("N�o � primo");
			}break;
			}
		}else if(numero ==2){
			System.out.println("� primo");
			
		}else if(numero == 0){
			System.out.println("N�o � primo");
			
		}
	}
}
			


		
