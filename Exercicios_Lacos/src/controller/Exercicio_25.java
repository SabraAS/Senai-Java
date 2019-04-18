package controller;

public class Exercicio_25 {

	public static void main(String[] args) {
		
		int i; 
		double alturaC, alturaJ;
		i = 0;
		alturaC = 1.5;
		alturaJ = 1.1;
		
		while(alturaJ < alturaC){
			
			alturaC = alturaC + 0.02;
			alturaJ = alturaJ + 0.03;
			i++;
			
		}
		
		System.out.println("Levará " + i + " anos para Juca ser mais alto que Chico");
		
	}

}