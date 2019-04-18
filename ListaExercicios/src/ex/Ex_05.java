package ex;

import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a velocidade máxima: ");
		double velM = scan.nextDouble();
		
		System.out.println("Digite a placa do carro: ");
		String placa= scan.next();
		
		System.out.println("Digite a velocidade do veículo: ");
		double velV = scan.nextDouble();
		
		double diferenca = (velV - velM);
		
		double resultado = (diferenca * 5) ;
		
		if(velV > velM) {
			if(resultado<=190){
			System.out.println("A multa do motorista será de: " + resultado);
			}else {
				System.out.println("A multa do motorista será de: 190 ");
			}
		}else {
			System.out.println("O motorista não ultrassou a velocidade");
		}
		
		
	
	}
	

}
