package controller;

public class EscopoDeVariavel {

	static int x = 1; // Variável global
	
	//Método main
	public static void main(String[] args) {

		int x = 5;
		System.out.println("X no início de main() é " + x);

		metodoA();
		metodoB(x);
		metodoA();
		metodoB(x);
	}

	public static void metodoA() {
		int x = 25;
		System.out.println("\nVariável local x ao entrar no métodoA é " + x);
		x = x + 1;
		System.out.println("Variável local x antes de sair do métodoA é " + x);
	}

	public static void metodoB() {
		System.out.println("\nVariável x ao entrar no métodoB é " + x + " global.");
		x = x * 10;
		System.out.println("Variável x antes de sair do métodoB é " + x);
	}
	
	public static void metodoB(int x){
		System.out.println("\nVariável x ao entrar no métodoB é " + x + " global.");
		x = x * 10;
		System.out.println("Variável x antes de sair do métodoB é " + x);
	}
}