package controller;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		
		String time[] = {"Botafogo", "Flamengo", "Fluminense", "Vasco", "Outros"};
	
		Object objeto = JOptionPane.showInputDialog(null, "Escolha seu time", "Escolha sei time", JOptionPane.PLAIN_MESSAGE, null,time,time[0]);
		/*vazio;t�tulo da janela;texto da janela; tipo de imagem (da pr�pria janela), 
		 * vazio, vetor de origem dos dados, posi��o do vetor onde ser� recuperado o valor padr�o.
		 */
		
		
		if (objeto.equals("Botafogo")) {
			JOptionPane.showMessageDialog(null,  "Time pequeno");
		}else {
			
			if(objeto.equals("Flamengo")){
			JOptionPane.showMessageDialog(null,  "Licen�a que o rei chegou");
				
			}else {
				if (objeto .equals("Fluminense")) {
					JOptionPane.showMessageDialog(null,  "Florminense");
					
				}else {
					if(objeto.equals("Vasco")) {
						JOptionPane.showMessageDialog(null,  "Cuidado pra n�o cair");
					}else {
						if(objeto.equals("Outros")){
							JOptionPane.showMessageDialog(null,  "Se for pra torcer pra tome pequeno que seja o Botafogo");
						}
					}
				}
			}
		}
	}

}
