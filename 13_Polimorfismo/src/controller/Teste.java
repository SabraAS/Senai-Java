package controller;

import model.ContaCorrente;
import model.ContaEspecial;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente("Michael Oliveira", "0001", "123456",
				250);
		System.out.println("Titular: " + cc.getTitular());
		System.out.println("Saldo: " + cc.calcularSaldo());
		
		ContaEspecial cce = new ContaEspecial("Fabr�cio Curvello", "0034", "987654",
				0.50, 500);
		
		System.out.println("Titular: " + cce.getTitular());
		System.out.println("Saldo: " + cce.calcularSaldo());

	}

}
