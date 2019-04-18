package controller;

import javax.swing.JOptionPane;

public class Ex_07 {

	public static void main(String[] args) {
		int resultado, resultado2, resultado3, resultado4, resultado5, resultado6, resultado7, resultado8, resultado9, resultado10;
		int numero = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um número: "));

		resultado = numero * 1;
		resultado2 = numero * 2;
		resultado3 = numero * 3;
		resultado4 = numero * 4;
		resultado5 = numero * 5;
		resultado6 = numero * 6;
		resultado7 = numero * 7;
		resultado8 = numero * 8;
		resultado9 = numero * 9;
		resultado10 = numero * 10;

		JOptionPane.showMessageDialog(null, "Seu número multiplicado até 10: \n"
				+ resultado +"\n"+ resultado2 +"\n"+ resultado3 +"\n"+ resultado4 +"\n"+ resultado5+"\n"+
				 resultado6 +"\n"+ resultado7+"\n" + resultado8 +"\n" + resultado9 +"\n"
				+ resultado10);

	}

}
