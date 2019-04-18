package model;

import java.text.NumberFormat;

public class Imposto {
	
	private String nome;
	private double rendaB, desconto;
	public Imposto(String nome, double rendaB, double desconto) {
		super();
		this.nome = nome;
		this.rendaB = rendaB;
		this.desconto = desconto;
	}
	
	public Imposto() {
		super();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaB() {
		return rendaB;
	}
	public void setRendaB(double rendaB) {
		this.rendaB = rendaB;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double calculaRendaL() {
		double rendal = (rendaB - desconto);
		return rendal;
	
	}
	
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	public void rendaL (double rendal) {
		if (rendal>4000) {
			System.out.println(rendal*0.17);
		}else if (rendal>3000 && rendal<=4000) {
			System.out.println(rendal*0.10);
		}else if (rendal>1800 && rendal<=3000) {
			System.out.println(rendal*0.07);
		}else if (rendal<=1800) {
			System.out.println("Isento");
				}
		
		

	}
	
	

}
