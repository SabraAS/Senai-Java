package controller;

import javax.swing.JOptionPane;

public class Ex_06 {

	public static void main(String[] args) {

		String capital = JOptionPane
				.showInputDialog("Diga a capital do Brasil: ");

		if (capital.equals ("Bras�lia")) {

			JOptionPane.showMessageDialog(null, "Voc� acertou , Parab�ns !! "
					+ capital);
		} else {
			JOptionPane.showMessageDialog(null, "Voc� errou ");
		}

	}
}
