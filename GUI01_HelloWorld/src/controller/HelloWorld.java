package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {
	public static void main(String[] args) {
		
		JFrame tela = new JFrame("Programa��o Desktop");
		JLabel texto = new JLabel("Al�, Mundo!");
		
		tela.setLayout(null);
		tela.getContentPane().add(texto);
		
		texto.setBounds(30, 20, 210, 20);
		
		tela.setSize(400,100);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
