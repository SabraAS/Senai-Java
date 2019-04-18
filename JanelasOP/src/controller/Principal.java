package controller;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Funcionario;

public class Principal {
	
	public static void main(String[] args) {
	
		Funcionario f1 = new Funcionario();
		
		f1.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
		f1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua matrícula")));
		f1.setCargo(JOptionPane.showInputDialog(null, "Digite seu cargo"));
		f1.setMesesEmpresa(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos meses" +  "você tem de empresa")));
		JOptionPane.showMessageDialog(null, f1.toString());
		
		
		Aluno a1 = new Aluno();
		a1.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
		a1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua matrícula")));
		a1.setNomeResponsavel(JOptionPane.showInputDialog("Digite o nome do seu responsável"));
		a1.setDtNasc(JOptionPane.showInputDialog(null, "Digite sua data de nascimento"));
		a1.setVaiPassar(Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Digite true se for passar ou false se for reprovar")));
		
		JOptionPane.showMessageDialog(null, a1.toString());
}

}
