package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagens {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Mensagem 1");
		
	JOptionPane.showMessageDialog(null, "Mensagem 2",
			"T�tulo da Mensagem 2", JOptionPane.WARNING_MESSAGE);
	
	ImageIcon iconFoto = new ImageIcon ("img/ic_curtir.gif");
	JOptionPane.showMessageDialog(null, "Mensagem 3",
			"T�tulo da Mensagem 3", JOptionPane.PLAIN_MESSAGE,
			iconFoto);
		
	}

}
