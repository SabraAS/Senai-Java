package ex;

import util.Teclado;

public class Ex_04 {
	
	public static void main(String args[]) {
		 int n1 = Teclado.lerInt("Digite a nota do primeira avalia��o: ");
		 int n2 = Teclado.lerInt("Digite a nota da segunda avalia��o: ");
		 int n3 = Teclado.lerInt("Digite a nota da terceira avalia��o: ");
		 int media = (n1 + n2 + n3) / 3;
		if (media >= 7) {
			System.out.println("A m�dia � " + media + " e voc� est� aprovado");
			
		} else if(media >= 5 || media < 7){
			System.out.println("A m�dia � " +media + " e voc� est� de recupera��o");
			
		}else {
			System.out.println("A m�dia � " +media + " e voc� est� reprovado");
		}
		
		
	}

}
