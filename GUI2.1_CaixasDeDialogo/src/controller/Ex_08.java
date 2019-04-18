package controller;

import javax.swing.JOptionPane;

public class Ex_08 {
public static void main(String[] args) {
	

		
	
String estado = JOptionPane.showInputDialog("Digite o estado onde você reside:  ");
	
if (estado.equals ("RJ"))JOptionPane.showMessageDialog(null, "Carioca ");
	
	else if(estado.equals ("SP"))JOptionPane.showMessageDialog(null, "Paulista ");
	
else if(estado.equals  ("MG"))JOptionPane.showMessageDialog(null, "mineiro");
{
	JOptionPane.showMessageDialog(null, "outro");

}
		
	




}
}
