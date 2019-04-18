package controller;

import model.Professor;
import model.Aluno;

public class Teste {
	
	public static void main(String[] args) {
		
		Professor prof = new Professor("Eduardo Silva", "92156-1579", "15/01/2016", "02/05/1991");
		Professor prof2 = new Professor("Carlos Eduardo Cardoso", "92198-1973", "15/01/2016", "26/10/1985");
		Professor prof3 = new Professor("Fabiana", "91862-7614", "19/07/2015", "10/01/19989");
		
		Aluno alun = new Aluno("Jorge Lucas", "92564-8973", "24578-65", "25/10/2000", 1549);
		Aluno alun2 = new Aluno("João Pedro", "98957-7971", "87600-15", "25/06/2000", 1550);
		Aluno alun3 = new Aluno("João Gabriel", "92564-1903", "28134-26", "20/01/1999", 1540);
		Aluno alun4 = new Aluno("Felipe", "90284-4589", "84615-14", "14/05/2000", 1553);
		Aluno alun5 = new Aluno("Maurício", "92571-0186", "14256-75", "02/03/2000", 1552);
		Aluno alun6 = new Aluno("Leonardo", "98881-0509", "98765-12", "10/02/2000", 1551);
		Aluno alun7 = new Aluno("Renata", "98280-6973", "12345-33", "29/12/2000", 1548);
		Aluno alun8 = new Aluno("Gabrielle", "94238-7614", "15188-99","17/11/2000", 1547);
		
		alun.mostrar();
		alun2.mostrar();
		alun3.mostrar();
		alun4.mostrar();
		alun5.mostrar();
		alun6.mostrar();
		alun7.mostrar();
		alun8.mostrar();
		
		prof.mostrar();
		prof2.mostrar();
		prof3.mostrar();
	}

}