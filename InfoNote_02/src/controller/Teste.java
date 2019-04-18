package controller;

import model.Usuario;
import model.Endereco;
import model.Pedido;
import model.ItemDePedido;
import model.Notebook;

public class Teste {
	
	public static void main(String[] args) {
		
		//Criando todos os Objetos
		Usuario user = new Usuario(1, "Joseph", "Climber", "Joseph Climber", "josephclimber@gmail.com", "2222-3344");
		Endereco end = new Endereco("Rua São Francisco Xavier", "451", "Apartamento 506", "Copacabana", "Rio de Janeiro", "RJ", "2222-5584");
		Notebook note1 = new Notebook("Notebook 1", 15, "Samsung", "All in one de 18 polegadas da Samsung", 135, 1650.50, "C:/Computador/Imagens/Samsung", "16/02/2015");
		Notebook note2 = new Notebook("Notebook 2", 10, "LG", "Notebook de 16 polegadas com tela touchscreen", 250, 1230.99, "C:/Computador/Imagens/LG", "01/08/2014");
		Notebook note3 = new Notebook("Notebook 3", 38, "Apple", "MAC de 20 polegadas", 45, 2259.99, "C:/Computador/Imagens/Apple", "29/04/2016S");
		Pedido pedir = new Pedido(122, "02/11/2016", "Cartão de Crédito", 1235.55, "Entregue e Pago");
		ItemDePedido item1 = new ItemDePedido("Item 1", 3, 652.50);
		ItemDePedido item2 = new ItemDePedido("Item 2", 5, 1230.20);
		
		//CHAMANDO OS MÉTODOS PARA IMPRIMIR NA TELA
		user.mostrar();
		end.mostrar();
		note1.mostrar();
		note2.mostrar();
		note3.mostrar();
		pedir.mostrar();
		item1.mostrar();
		item2.mostrar();
		
	}
}