package controller;

import javax.swing.JOptionPane;

public class Ex_04 {

	public static void main(String[] args) {
		int antecessor,sucessor;
		int num = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um n�mero inteiro: "));
		
		antecessor = num - 1;
		sucessor = num + 1;
		
		JOptionPane.showMessageDialog(null, "O antecessor desse n�mero �: "
				+ antecessor);
	
		JOptionPane.showMessageDialog(null, "O sucessor desse n�mero �: "
				+ sucessor);
	}
	
	
}
