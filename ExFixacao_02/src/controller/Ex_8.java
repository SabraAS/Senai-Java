package controller;
import util.Teclado;
public class Ex_8 {
	public static void main(String[] args){
		try{
			int a = Teclado.lerInt("Digite um n�mero");
			System.out.println("O n�mero digitado foi: "+a);
		} catch (NumberFormatException nfe){
			try{
				int a = Teclado.lerInt("Digite um n�mero");
				System.out.println("O n�mero digitado foi: "+a);
			} catch (NumberFormatException nfe1){
				try{
					int a = Teclado.lerInt("Digite um n�mero");
					System.out.println("O n�mero digitado foi: "+a);
			} catch(NumberFormatException nfe2){
				System.out.println("Excedeu o n�mero de tentativas");
			}
				
			}
		}
	}

}
