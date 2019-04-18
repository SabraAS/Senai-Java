package controller;

public class EscopoDeVariavel {

	static int x = 1; // Vari�vel global
	
	//M�todo main
	public static void main(String[] args) {

		int x = 5;
		System.out.println("X no in�cio de main() � " + x);

		metodoA();
		metodoB(x);
		metodoA();
		metodoB(x);
	}

	public static void metodoA() {
		int x = 25;
		System.out.println("\nVari�vel local x ao entrar no m�todoA � " + x);
		x = x + 1;
		System.out.println("Vari�vel local x antes de sair do m�todoA � " + x);
	}

	public static void metodoB() {
		System.out.println("\nVari�vel x ao entrar no m�todoB � " + x + " global.");
		x = x * 10;
		System.out.println("Vari�vel x antes de sair do m�todoB � " + x);
	}
	
	public static void metodoB(int x){
		System.out.println("\nVari�vel x ao entrar no m�todoB � " + x + " global.");
		x = x * 10;
		System.out.println("Vari�vel x antes de sair do m�todoB � " + x);
	}
}