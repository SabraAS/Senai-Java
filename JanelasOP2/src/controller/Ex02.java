package controller;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Veiculo;

public class Ex02 {
public static void main(String[] args) {
		
		
		Veiculo a1 = new Veiculo();
		a1.setPlaca(JOptionPane.showInputDialog(null, "Digite sua placa"));
		a1.setChassi(JOptionPane.showInputDialog(null, "Digite o chassi"));
		a1.setMarca(JOptionPane.showInputDialog(null, "Digite a marca"));
		a1.setModelo(JOptionPane.showInputDialog(null, "Digite o modelo"));
		
		
		String Tipo[] = {"Moto", "Carro de passeio", "Utilit�rio", "Caminh�o", "�nibus"};
		String Combustivel[] = {"Gasolina", "�lcool", "Eletricidade", "GNV", "H�brido", "Flex"};
		Object objeto1 = JOptionPane.showInputDialog(null, "Tipo", "Qual seu ve�culo", JOptionPane.PLAIN_MESSAGE, null,Tipo,Tipo[0]);
		Object objeto2 = JOptionPane.showInputDialog(null, "Tipo de combustivel", "Escolha", JOptionPane.PLAIN_MESSAGE, null,Combustivel,Combustivel[0]);
		
		if (objeto1.equals("Moto")) {
			a1.setTipo("Moto");
		}else if(objeto1.equals("Carro de Passeio")) {
			a1.setTipo("Carro de Passeio");	
		}else if (objeto1.equals("Utilit�rio")) {
			a1.setTipo("Utilit�rio");	
		}else if (objeto1.equals("Caminh�o")) {
			a1.setTipo("Caminh�o");
		}else if (objeto1.equals("�nibus")) {
			a1.setTipo("�nibus");
		}
		
		if (objeto2.equals("Gasolina")) {
			a1.setCombustivel("Gasolina");
		}else if (objeto2.equals("�lcool")) {
			a1.setCombustivel("�lcool");	
		}else if (objeto2.equals("Eletricidade")) {
			a1.setCombustivel("Eletricidade");	
		}else if (objeto2.equals("GNV")) {
			a1.setCombustivel("GNV");	
		}else if (objeto2.equals("H�brido")) {
			a1.setCombustivel("H�brido");
		}else if (objeto2.equals("Flex")) {
			a1.setCombustivel("Flex");
		}
		
		
		
		
		JOptionPane.showMessageDialog(null, a1.toString());
		
		
			
		}
	

}
