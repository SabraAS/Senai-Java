package controller;

import javax.swing.JOptionPane;

import model.Estagiario;
import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula" )));
		f1.setNome(JOptionPane.showInputDialog("Digite seu nome" ));
		f1.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario bruto" )));
		f1.setDesconto(Double.parseDouble(JOptionPane.showInputDialog("Digite seu desconto" )));
		
		f1.calculaSalario();
		
		Estagiario e1 = new Estagiario();
		
		e1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula" )));
		e1.setNome(JOptionPane.showInputDialog("Digite seu nome" ));
		e1.setBolsaAuxilio(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario bruto" )));
		e1.setBonus(Double.parseDouble(JOptionPane.showInputDialog("Digite seu desconto" )));
		
		e1.calculaSalario();
		

	}

}
