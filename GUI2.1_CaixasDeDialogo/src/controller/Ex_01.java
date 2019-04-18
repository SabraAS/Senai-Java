package controller;

import javax.swing.JOptionPane;



public class Ex_01 {

	public static void main(String[] args) {
		
		
		
		String nome = JOptionPane.showInputDialog("Insira seu nome completo: ");
		JOptionPane.showMessageDialog(null, "Você Digitou: " + nome);
		
		String sexo = JOptionPane.showInputDialog("Insira seu sexo:  ");
		JOptionPane.showMessageDialog(null, "Você Digitou: " + sexo);
		
		
	}
	
	
}
