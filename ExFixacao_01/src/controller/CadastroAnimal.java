package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
		
		Reptil jacare = new Reptil ("Jacar�", 4, "Escamas", "Ov�paro", "Carn�voros", false);
		Reptil lagartixa = new Reptil ("Lagartixa", 4, "Escamas", "Ov�paro", "Carn�voros", true);
		Mamifero cachorro = new Mamifero ("Cachorro", 4, "Pelos", "V�viparo", "Carn�voros", "Terrestre");
		Mamifero baleia = new Mamifero ("Baleia", 0, "Pele", "Viv�paro", "Carn�voros", "Aqu�tico");
				
		jacare.exibir();
		lagartixa.exibir();
		cachorro.exibir();
		baleia.exibir();
	}

}
