package model;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Estagiario extends Pessoa {

	private double bolsaAuxilio;
	private double bonus;
	public Estagiario(int matricula, String nome, double bolsaAuxilio, double bonus) {
		super(matricula, nome);
		this.bolsaAuxilio = bolsaAuxilio;
		this.bonus = bonus;
	}
	public Estagiario() {
		super();
	}
	public double getBolsaAuxilio() {
		return bolsaAuxilio;
	}
	public void setBolsaAuxilio(double bolsaAuxilio) {
		this.bolsaAuxilio = bolsaAuxilio;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString() + "Estagiario [bolsaAuxilio=" + bolsaAuxilio + ", bonus=" + bonus + "]";
	}
	@Override
	public void calculaSalario() {
		double salario = bolsaAuxilio + bonus;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		JOptionPane.showMessageDialog(null, "Seu salário é" + nf.format(salario));
		
	}
	
	
	
}
