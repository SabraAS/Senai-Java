package controller;

import model.Funcionario;

public class Loja {

	public static void main(String[] args) {

		//Funcion�rio 1 - 1� Objeto
		Funcionario func = new Funcionario();
		func.matricula = 12600;
		func.nome = "Bob Dantes";
		func.cpf = 224586;
		System.out.println("Funcion�rio 1:");
		System.out.println("Nome: " + func.nome);
		System.out.println("Matr�cula: " + func.matricula);
		System.out.println("CPF: " + func.cpf);
		
		//Funcion�rio 2 - 2� Objeto
		Funcionario func2 = new Funcionario();
		func2.matricula = 63255;
		func2.nome = "Alan Maranh�o";
		func2.cpf = 458553;
		System.out.println("\nFuncion�rio 2:");
		System.out.println("Nome: " + func2.nome);
		System.out.println("Matr�cula: " + func2.matricula);
		System.out.println("CPF: " + func2.cpf);
		
		//Funcion�rio 3 - 3� Objeto
		Funcionario func3 = new Funcionario();
		func3.matricula = 59760;
		func3.nome = "Charles Delta";
		func3.cpf = 234471;
		System.out.println("\nFuncion�rio 3:");
		System.out.println("Nome: " + func3.nome);
		System.out.println("Matr�cula: " + func3.matricula);
		System.out.println("CPF: " + func3.cpf);
		
	}

}
