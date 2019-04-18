package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
		
		Reptil jacare = new Reptil ("Jacaré", 4, "Escamas", "Ovíparo", "Carnívoros", false);
		Reptil lagartixa = new Reptil ("Lagartixa", 4, "Escamas", "Ovíparo", "Carnívoros", true);
		Mamifero cachorro = new Mamifero ("Cachorro", 4, "Pelos", "Víviparo", "Carnívoros", "Terrestre");
		Mamifero baleia = new Mamifero ("Baleia", 0, "Pele", "Vivíparo", "Carnívoros", "Aquático");
				
		jacare.exibir();
		lagartixa.exibir();
		cachorro.exibir();
		baleia.exibir();
	}

}
