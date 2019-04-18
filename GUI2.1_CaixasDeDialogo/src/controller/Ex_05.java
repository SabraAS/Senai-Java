package controller;

import javax.swing.JOptionPane;

public class Ex_05 {

	public static void main(String[] args) {
		int resultado;
		int num = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um número inteiro: "));

		if (num >= 20) {
			resultado = num / 2;
			JOptionPane.showMessageDialog(null, "A metade deste número é: "
					+ resultado);
		} else {
			JOptionPane.showMessageDialog(null, "Seu número é: " + num);
		}

	}

}
