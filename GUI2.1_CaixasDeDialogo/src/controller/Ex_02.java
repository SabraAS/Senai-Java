package controller;

import javax.swing.JOptionPane;

public class Ex_02 {

	public static void main(String[] args) {

		int resultado1, resultado2;

		int num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um número inteiro: "));

		int num2 = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um número inteiro: "));

		int num3 = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um número inteiro: "));
		int num4 = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um número inteiro: "));

		resultado1 = num1 + num2 + num3 + num4;

		resultado2 = num1 * num2 * num3 * num4;

		JOptionPane.showMessageDialog(null, "As soma desses números é: "
				+ resultado1);
		
		JOptionPane.showMessageDialog(null, "As multiplicações desses números são: "
				+ resultado2);
	}

}
