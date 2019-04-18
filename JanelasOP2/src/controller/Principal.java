package controller;

import javax.swing.JOptionPane;

import model.Aluno;


public class Principal {
	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno();
		a1.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
		a1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua matrícula")));
		a1.setDtNasc(JOptionPane.showInputDialog(null, "Digite sua data de nascimento"));
		
		String EstadoCivil[] = {"Divorciado", "Solteiro", "Casado", "Viúvo"};
		String Sexo[] = {"Masculino", "Feminino"};
		Object objeto1 = JOptionPane.showInputDialog(null, "Sexo", "Qual seu sexo", JOptionPane.PLAIN_MESSAGE, null,Sexo,Sexo[0]);
		Object objeto2 = JOptionPane.showInputDialog(null, "Sua situação amorosa", "Escolha", JOptionPane.PLAIN_MESSAGE, null,EstadoCivil,EstadoCivil[0]);
		
		if (objeto1.equals("Masculino")) {
			a1.setSexo("Masculino");
		}else {
			a1.setSexo("Feminino");	
		}
		
		if (objeto2.equals("Solteiro")) {
			a1.setSexo("Solteiro");
		}else if (objeto2.equals("Casado")) {
			a1.setSexo("Casado");	
		}else if (objeto2.equals("Viúvo")) {
			a1.setSexo("Viúvo");	
		}else if (objeto2.equals("Divorciado")) {
			a1.setSexo("Divorciado");	
		}
		
		
		
		
		JOptionPane.showMessageDialog(null, a1.toString());
		
		
			
		}
	}


