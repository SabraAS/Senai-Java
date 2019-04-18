package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaixaDeTexto extends JFrame {
	JTextField caixaDeTexto = new JTextField(20);
	public CaixaDeTexto(){
		super("Caixa de Texto");
		
		
		caixaDeTexto.setText("Digite algo aqui");
		caixaDeTexto.setToolTipText("Digita logo!!");
		
		caixaDeTexto.addKeyListener(new KeyListener() {
			
		public void keyTyped(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
			caixaDeTexto.setText(caixaDeTexto.getText().toUpperCase());	
		}
		public void keyPressed(KeyEvent e) {
		}
		});
		
		JButton botao1 = new JButton("Bot�o 1");
		botao1.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, caixaDeTexto.getText());
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(caixaDeTexto);
		painel.add(botao1);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
		
	}
	 

	public static void main(String[] args) {
		new CaixaDeTexto();

	}

}
