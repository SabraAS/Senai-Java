package model;

import javax.swing.JOptionPane;

public class Perecivel extends Produto{
	
	private String dataValidade;
	private double valor;
	public Perecivel(String dataValidade, double valor) {
		super();
		this.dataValidade = dataValidade;
		this.valor = valor;
	}
	
	public Perecivel() {
		super();
	}
	
	public String getDataValidade() {
		return dataValidade;
	}
	
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		
		return super.toString() +"Perecivel [dataValidade=" + dataValidade + ", valor=" + valor + "]";
	}

	@Override
	public boolean realizarCompra() {
		if (getQuantidade() < 10){
			JOptionPane.showMessageDialog(null, toString());
			return true;
		}
		JOptionPane.showMessageDialog(null, toString());
		return false;
	}
	

}
