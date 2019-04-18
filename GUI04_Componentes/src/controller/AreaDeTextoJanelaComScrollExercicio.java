package Controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AreaDeTextoJanelaComScrollExercicio extends JFrame{
	public AreaDeTextoJanelaComScrollExercicio(){
		super("Área de Texto janela com scroll");
		
		JLabel label = new JLabel("Digite uma mensagem: ");
		JTextArea areaDeTexto = new JTextArea(10,30);
		
		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(areaDeTexto);
		
		JScrollPane sp = new JScrollPane(painel,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
	add(sp);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,200);
	setVisible(true);
	}

	public static void main(String[] args) {
		new AreaDeTextoJanelaComScrollExercicio();

	}

}
