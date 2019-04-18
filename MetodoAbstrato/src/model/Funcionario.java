package model;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
	
	private double SalarioBruto;
	private double desconto;
	public Funcionario(int matricula, String nome, double salarioBruto, double desconto) {
		super(matricula, nome);
		SalarioBruto = salarioBruto;
		this.desconto = desconto;
	}
	public Funcionario() {
		super();
	}
	public double getSalarioBruto() {
		return SalarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		SalarioBruto = salarioBruto;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	@Override
	public String toString() {
		return super.toString() + "Funcionario [SalarioBruto=" + SalarioBruto + ", desconto=" + desconto + "]";
	}
	@Override
	public void calculaSalario() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //arredonda o número
		double salario = SalarioBruto-desconto;
		JOptionPane.showMessageDialog(null, toString() + "Seu salário é: " + nf.format(salario));
		
	}
	

}
