package controller;

import javax.swing.JOptionPane;


public class Ex01 {
	public static void main(String[] args) {
		
		double valor;
		double valorTotal;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor"));
		
		String Comissao[] = {"sem", "10%", "13%", "15%"};
		Object objeto1 = JOptionPane.showInputDialog(null, "Comissao", "Escolha", JOptionPane.PLAIN_MESSAGE, null,Comissao,Comissao[0]);
		
		if (objeto1.equals("sem")) {
			valorTotal = valor;
		}else if (objeto1.equals("10%")) {
			valorTotal = valor * 1.1;
		}else if (objeto1.equals("13%")) {
			valorTotal = valor * 1.13;
		}else {
			valorTotal = valor * 1.15;
		}
		
		JOptionPane.showMessageDialog(null, valorTotal);
		
	

	}
}
