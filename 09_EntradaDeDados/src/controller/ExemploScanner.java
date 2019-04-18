package controller;

import java.util.Scanner;

public class ExemploScanner {

	private static Scanner sc;
	private static Scanner sc2;

	public static void main(String[] args) {

		String nome;

		System.out.println("Digite seu nome:");
		sc = new Scanner(System.in);
		nome = sc.next();

		System.out.println("Nome Digitado: " + nome);

		double salario;

		System.out.println("Digite o Salário que deseja: ");
		sc2 = new Scanner(System.in);
		salario = sc2.nextDouble();

		System.out.println("Salário Pretendido: " + salario);
	}
}