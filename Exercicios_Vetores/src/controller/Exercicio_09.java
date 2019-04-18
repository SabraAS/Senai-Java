package controller;

import util.Teclado;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		String nome[] = new String[10];
		String nomePesquisa;
		int x = 0;
		int c = 0;
		
		for(int i = 0; i < nome.length; i++){
			nome[i] = Teclado.lerTexto("Digite o " + (i + 1) + "° nome: ");
		}
		
		String resp = Teclado.lerTexto("Você gostaria de fazer uma pesquisa de nomes no vetor?");
		
		if(resp.equals("Sim")){
			
			nomePesquisa = Teclado.lerTexto("Digite o nome que gostaria de pesquisar: ");
			
			for(int y = 0; y < nome.length; y++){
				
				if(nome[y].equals(nomePesquisa)){
					
					System.out.println("Este nome está contido no vetor de nomes!!");
					c = 1;
					
				}else if(x == 9 && c == 0){
					
					System.out.println("Esse nome não foi encontrado no vetor!!");					
				
				}else{
					x++;
				}
			}
			
		}else{
			System.out.println("Obrigado por utilizar o programa:");
		}

	}

}
