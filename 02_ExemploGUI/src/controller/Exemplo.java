package controller;

import javax.swing.JOptionPane;

public class Exemplo {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog
		(null, "SENAI", "Exemplo GUI", 0);

		JOptionPane.showConfirmDialog
		(null, "Quer aumento de salário?", "Salário",
				javax.swing.JOptionPane.YES_NO_OPTION);
	}
}
