package controller;

import javax.swing.JOptionPane;

public class Ex_04 {

	public static void main(String[] args) {
		int antecessor,sucessor;
		int num = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um número inteiro: "));
		
		antecessor = num - 1;
		sucessor = num + 1;
		
		JOptionPane.showMessageDialog(null, "O antecessor desse número é: "
				+ antecessor);
	
		JOptionPane.showMessageDialog(null, "O sucessor desse número é: "
				+ sucessor);
	}
	
	
}
