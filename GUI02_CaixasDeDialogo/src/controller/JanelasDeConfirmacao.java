package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class JanelasDeConfirmacao {

	public static void main(String[] args) {
		
		int opt1 = JOptionPane.showConfirmDialog(null,"Janela de Confirma��o 1");
		
		switch (opt1) {
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null,"Voc� clicou em \"Cancelar\"");
			break;
			
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null,"Voc� clicou em \"Sim\"");
			break;
			
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null,"Voc� clicou em \"N�o\"");
			break;
			
		default:
		JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
		break;													
		}
		
		int opt2 = JOptionPane.showConfirmDialog(null,"Janela de Confirma��o 2","T�tulo da Janela de Confirma��o 3",
			JOptionPane.OK_CANCEL_OPTION);
		
		switch (opt2) {
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null,"Voc� clicou em \"Cancelar\"");
			break;
			
		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(null,"Voc� clicou em \"OK\"");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
			break;													
		}
		
		int opt3 = JOptionPane.showConfirmDialog(null,"Janela de Confirma��o 3","T�tulo da Janela de Confirma��o 3", 
				JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
			
			switch (opt3) {
			case JOptionPane.YES_OPTION:
				JOptionPane.showMessageDialog(null,"Voc� clicou em \"Sim\"");
				break;
				
			case JOptionPane.NO_OPTION:
				JOptionPane.showMessageDialog(null,"Voc� clicou em \"N�o\"");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
				break;													
			}
			
			ImageIcon iconFoto = new ImageIcon("img/ic_download.gif");
			int opt4 = JOptionPane.showConfirmDialog(null,"Janela de Confirma��o 4","T�tulo da Janela de Confirma��o 4", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, iconFoto);
				
				switch (opt4) {
				case JOptionPane.YES_OPTION:
					JOptionPane.showMessageDialog(null,"Voc� clicou em \"Sim\"");
					break;
					
				case JOptionPane.NO_OPTION:
					JOptionPane.showMessageDialog(null,"Voc� clicou em \"N�o\"");
					break;
					
				case JOptionPane.CANCEL_OPTION:
					JOptionPane.showMessageDialog(null,"Voc� clicou em \"Cancelar\"");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
					break;													
				}
		

	}

}
