package controller;

public class ExemploVetorString {

	public static void main(String[] args) {
		
		String paises[] = new String[10];
		
		for (int i = 0; i < paises.length; i++){
			//Colocando a palavra Brasil em todas as posi��es 
			paises[i] = new String("Brasil");
			
		}

		//Substituindo algumas posi��es por estas palavras
		paises[0] = "Jap�o";
		paises[2] = "It�lia";
		paises[3] = "Argentina";
		paises[8] = "Peru";
		
		for (int i = 0; i < paises.length; i++){
			//Imprimindo todas as posi��es 
			System.out.println("paises[" + i + "] = " + paises[i]);
			
		}
		
	}

}
