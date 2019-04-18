package controller;

import model.Professor;
import model.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Professor prof = new Professor("Professor", "102030", 2, 1285496, "Lucas Rapaz", "Técnico em T.I.");
		Aluno alu = new Aluno("Aluno", "159753", 3, 125463, "Pedro Vasconvasco", "Tarde", "T.I.");
		
		System.out.println(prof + "\n\n" + alu);
		
	}

}
