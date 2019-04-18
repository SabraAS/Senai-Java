package model;

import javax.swing.JOptionPane;

public class NaoPerecivel extends Produto {
	
	private String setor;
	private double valor;
	public NaoPerecivel(String setor, double valor) {
		super();
		this.setor = setor;
		this.valor = valor;
	}
	public NaoPerecivel() {
		super();
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return super.toString() +"NaoPerecivel [setor=" + setor + ", valor=" + valor + "]";
	}
	@Override
	public boolean realizarCompra() {
		if (getQuantidade() < 100){
			JOptionPane.showMessageDialog(null, toString());
			return true;
		}
		JOptionPane.showMessageDialog(null, toString());
		return false;
		
	
		
	}
	
	

}
