package controller;

import util.Teclado;
import model.Imposto;

public class Ex1 {
	
	public static void main(String[] args) {
		
		String nome = Teclado.lerTexto("Digite seu nome: ");
		double rendaB= Teclado.lerDouble("Digite sua renda bruta: ");
		double desconto = Teclado.lerDouble("Digite o desconto: ");
		
		Imposto i1 = new Imposto(nome, rendaB, desconto);
		
		i1.rendaL(i1.calculaRendaL());
		/*
		 * ou  Contribuinte c1 = new Contribuinte();
		 * syso (c1.toString)
		 * c1.calculaImposto(c1.calculaRendaL());
		 */
		
	}

}
