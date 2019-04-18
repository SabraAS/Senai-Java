package controller;

import javax.swing.JOptionPane;


public class Ex_03 {
	
	public static void main(String[] args) {
		double resultado;
		int dolar = Integer.parseInt(JOptionPane
				.showInputDialog("Insira um valor em dolarés que você deseja que seja convertido: "));
		
		resultado = dolar*1.72;
		
		JOptionPane.showMessageDialog(null, "Seu Valor em R$: "
				+ resultado);
		
		
		
	}

}
