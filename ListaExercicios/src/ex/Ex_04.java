package ex;

import util.Teclado;

public class Ex_04 {
	
	public static void main(String args[]) {
		 int n1 = Teclado.lerInt("Digite a nota do primeira avaliação: ");
		 int n2 = Teclado.lerInt("Digite a nota da segunda avaliação: ");
		 int n3 = Teclado.lerInt("Digite a nota da terceira avaliação: ");
		 int media = (n1 + n2 + n3) / 3;
		if (media >= 7) {
			System.out.println("A média é " + media + " e você está aprovado");
			
		} else if(media >= 5 || media < 7){
			System.out.println("A média é " +media + " e você está de recuperação");
			
		}else {
			System.out.println("A média é " +media + " e você está reprovado");
		}
		
		
	}

}
