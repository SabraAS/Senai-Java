package controller;

import model.Carro;

public class Cadastro {

	public static void main(String[] args) {		// Início do método main
		
		//Carro 1 - Instanciando o 1º objeto
		Carro car = new Carro();
		
		//Preencher atributos do objeto com valores - O mesmo para os debaixo
		car.fabricante = "Toyota";
		car.modelo = "Civic";
		car.cor = "Preto";
		car.ano = 2010;
		System.out.println("Carro 1:");
		System.out.println("Fabricante: " + car.fabricante);
		System.out.println("Modelo: " + car.modelo);
		System.out.println("Cor: " + car.cor);
		System.out.println("Ano: " + car.ano);
		
		//Carro 2 - Instanciando o 2º objeto
		Carro car2 = new Carro();
		car2.fabricante = "Chevrolet";
		car2.modelo = "Corsa";
		car2.cor = "Cinza";
		car2.ano = 2008;
		System.out.println("\nCarro 2:");
		System.out.println("Fabricante: " + car2.fabricante);
		System.out.println("Modelo: " + car2.modelo);
		System.out.println("Cor: " + car2.cor);
		System.out.println("Ano: " + car2.ano);
								
		//Carro 3 - 3º objeto
		Carro car3 = new Carro();
		car3.fabricante = "Peugeot";
		car3.modelo = "Allure";
		car3.cor = "Vermelho";
		car3.ano = 2014;
		System.out.println("\nCarro 3:");
		System.out.println("Fabricante: " + car3.fabricante);
		System.out.println("Modelo: " + car3.modelo);
		System.out.println("Cor: " + car3.cor);
		System.out.println("Ano: " + car3.ano);
		
	}
}
