package controller;

import javax.swing.JOptionPane;

import model.Carro;
import model.Moto;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.setAutonomia(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a autonomia" )));
		c1.setVelocidadeM(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a velocidade máxima")));
		c1.setTipoCombustivel(JOptionPane.showInputDialog(null, "Digite o tipo de combustivel"));
		c1.setQntPortas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de portas")));
		
		JOptionPane.showMessageDialog(null, c1.toString());
		
		Moto m1 = new Moto();
		m1.setAutonomia(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a autonomia" )));
		m1.setVelocidadeM(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a velocidade máxima")));
		m1.setCilindrada(JOptionPane.showInputDialog(null, "Digite a cilindrada"));
		m1.setConsumoMedio(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o consumo médio")));
		
		JOptionPane.showMessageDialog(null, m1.toString());
	}

}
