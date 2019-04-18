package ex;

import util.Teclado;

public class Ex_01 {
	
	public static void main(String args[]) {		
		int quant = Teclado.lerInt("Digite a quantidade das pessoas(tem que ser menor que 100 pessoas):");
		
		double[] alt = new double[quant];
		double[] altF = new double[quant];
		double[] altM = new double[quant];
		String[] sexo = new String[quant];
		double media = 0;
		double mediaF = 0;
		double mediaM = 0;
		double maior = 0;
		int quantM = 0;
		int quantF = 0;
		
		for(int i = 0; i < quant; i++) {
			alt[i] = Teclado.lerDouble("Digite a altura em metros:");
			sexo[i] = Teclado.lerTexto("Digite o sexo com M ou F:");
			media = media + alt[i];
			maior = Math.max(maior, alt[i]);
			if (sexo[i].equals("F")) {
				altF[i] = alt[i];
				quantF++;
			} else {
				altM[i] = alt[i];
				quantM++;
			}
			mediaF = mediaF + altF[i];
			mediaM = mediaM + altM[i];
		}
		media = media/quant;
		mediaF = mediaF/quantF;
		mediaM = mediaM/quantM;
		
		System.out.println("A média das alturas é " + media);
		System.out.println("A média das alturas das mulheres é " + mediaF + " e a dos homens é " + mediaM);
		System.out.println("A maior altura é " + maior);
		System.out.println("A quantidade de homens é " + quantM);
	}

}
