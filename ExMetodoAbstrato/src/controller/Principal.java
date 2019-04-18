package controller;

import javax.swing.JOptionPane;

import model.NaoPerecivel;
import model.Perecivel;


public class Principal {
	
	public static void main(String[] args) {
		Perecivel c1 = new Perecivel();
		
		c1.setDescricao(JOptionPane.showInputDialog(null, "Digite a descricao do produto:"));
		c1.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade:")));
		c1.setDataValidade(JOptionPane.showInputDialog(null, "Digite a data de validade:"));
		c1.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor:")));
		
		JOptionPane.showMessageDialog(null, c1.realizarCompra());
		
		NaoPerecivel n1 = new NaoPerecivel();
		n1.setDescricao(JOptionPane.showInputDialog(null, "Digite a descricao do produto:"));
		n1.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade:")));
		n1.setSetor(JOptionPane.showInputDialog(null, "Digite o setor:"));
		n1.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor:")));
		
		JOptionPane.showMessageDialog(null, n1.realizarCompra());
		
}
}
