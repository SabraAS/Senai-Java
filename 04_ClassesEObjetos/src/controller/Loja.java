package controller;

import model.Funcionario;

public class Loja {

	public static void main(String[] args) {

		//Funcionário 1 - 1º Objeto
		Funcionario func = new Funcionario();
		func.matricula = 12600;
		func.nome = "Bob Dantes";
		func.cpf = 224586;
		System.out.println("Funcionário 1:");
		System.out.println("Nome: " + func.nome);
		System.out.println("Matrícula: " + func.matricula);
		System.out.println("CPF: " + func.cpf);
		
		//Funcionário 2 - 2º Objeto
		Funcionario func2 = new Funcionario();
		func2.matricula = 63255;
		func2.nome = "Alan Maranhão";
		func2.cpf = 458553;
		System.out.println("\nFuncionário 2:");
		System.out.println("Nome: " + func2.nome);
		System.out.println("Matrícula: " + func2.matricula);
		System.out.println("CPF: " + func2.cpf);
		
		//Funcionário 3 - 3º Objeto
		Funcionario func3 = new Funcionario();
		func3.matricula = 59760;
		func3.nome = "Charles Delta";
		func3.cpf = 234471;
		System.out.println("\nFuncionário 3:");
		System.out.println("Nome: " + func3.nome);
		System.out.println("Matrícula: " + func3.matricula);
		System.out.println("CPF: " + func3.cpf);
		
	}

}
