package controller;
import util.Teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {
		try {
		double a = Teclado.lerDouble ("Digite o Numerador: ");
		double b = Teclado.lerDouble ("Digite o Denominador");
		
		double c = a/b;
		
		System.out.println("Resultado da divis�o de a por b: " + c);

	} catch (NumberFormatException nfe) {
		System.out.println("Caracter inv�lido!");
				
	} catch (ArithmeticException ae) {
		System.out.println("Divis�o por Zero");
		}
	}
}
