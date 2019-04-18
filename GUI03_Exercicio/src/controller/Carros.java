package controller;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Carros extends JFrame{
		
		JTabbedPane abas = new JTabbedPane();
		
		ImageIcon mustang = new ImageIcon("img/1970_00065_01.jpg");
		ImageIcon uno = new ImageIcon("img/uno500x350.png");
		ImageIcon honda = new ImageIcon("img/honda500x350.png");
		JLabel c1 = new JLabel(mustang);
		JLabel c2 = new JLabel(uno);
		JLabel c3 = new JLabel(honda);
		//COMEÇO DO JLABEL1
		JLabel label1 = new JLabel("Fabricante: Ford");
		JLabel label1a = new JLabel("Modelo:mustang");
		JLabel label1b = new JLabel("Ano: 1970");
		JLabel label1c = new JLabel("Preço: 120.000,00");
		JLabel label1d = new JLabel("mustang");
	    //JPANEL COMEÇA AQUI		
		JPanel painel1 = new JPanel();
		JPanel painelprincipal1 = new JPanel();
		//FIM DO JLABEL1
		
		//COMEÇO DO JLABEL2
		JLabel label2 = new JLabel("Fabricante: Fiat");
		JLabel label2a = new JLabel("Modelo: Uno");
		JLabel label2b = new JLabel("Ano: 2016");
		JLabel label2c = new JLabel("Preço:50.000,00");
		JLabel label2d = new JLabel(uno);
		//JPANEL COMEÇA AQUI
		JPanel painel2 = new JPanel();
		JPanel painelprincipal2 = new JPanel();
		//FIM DO JLABEL2
		
		//COMEÇO DO JLABEL3
		JLabel label3 = new JLabel("Fabricante: Honda");
		JLabel label3a = new JLabel("Modelo: Honda City");
		JLabel label3b= new JLabel("Ano: 2016");
		JLabel label3c = new JLabel("Preço:80.000,00");
		JLabel label3d = new JLabel(honda);
		//JPANEL COMEÇA AQUI
		JPanel painel3 = new JPanel();
		JPanel painelprincipal3 = new JPanel();
		//FIM DO JLABEL3
			
	public Carros() {
		super("Inventário dos Carros");
		
		painelprincipal1.add(painel1);
		painelprincipal2.add(painel2);
		painelprincipal3.add(painel3);
		painel1.add(label1);
		painel1.add(label1a);
		painel1.add(label1b);
		painel1.add(label1c);
		painelprincipal1.add(c1);
		painel2.add(label2);
		painel2.add(label2a);
		painel2.add(label2b);
		painel2.add(label2c);
		painelprincipal2.add(label2d);
		painel3.add(label3);
		painel3.add(label3a);
		painel3.add(label3b);
		painel3.add(label3c);
		painelprincipal3.add(label3d);
		painelprincipal1.setLayout(new GridLayout(1,2));
		painelprincipal2.setLayout(new GridLayout(1,2));
		painelprincipal3.setLayout(new GridLayout(1,2));
		painel1.setLayout(new GridLayout(5,1));
		painel2.setLayout(new GridLayout(5,1));
		painel3.setLayout(new GridLayout(5,1));
		
		
		abas.addTab("Chevrolet", null, painelprincipal1,"Primeiro Painel");
		abas.addTab("Fiat", null, painelprincipal2,"Segundo Painel");
		abas.addTab("Honda", null, painelprincipal3,"Terceiro Painel");
		
		Container container = getContentPane();
		container.add(abas);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,270);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Carros();
	}

}


