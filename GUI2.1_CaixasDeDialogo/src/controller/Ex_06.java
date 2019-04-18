package controller;

import javax.swing.JOptionPane;

public class Ex_06 {

	public static void main(String[] args) {

		String capital = JOptionPane
				.showInputDialog("Diga a capital do Brasil: ");

		if (capital.equals ("Brasília")) {

			JOptionPane.showMessageDialog(null, "Você acertou , Parabéns !! "
					+ capital);
		} else {
			JOptionPane.showMessageDialog(null, "Você errou ");
		}

	}
}
