package controller;

import model.Usuario;
import model.Endereco;
import model.Pedido;
import model.ItemDePedido;
import model.Notebook;

public class Teste {
	
	public static void main(String[] args) {
		
		//Criando todos os Objetos
		Usuario user = new Usuario();
		Endereco endereco = new Endereco();
		Notebook note1 = new Notebook();
		Notebook note2 = new Notebook();
		Notebook note3 = new Notebook();
		Pedido pedir = new Pedido();
		ItemDePedido item1 = new ItemDePedido();
		ItemDePedido item2 = new ItemDePedido();
		
		//Estabelcendo os valores do Objeto da Classe Usuario
		//OBJETO USUÁRIO
		user.matricula = 25633;
		user.login = "Lucas Maranhães";
		user.senha = "25081995";
		user.nome = "Lucas Fernandes Maranhães";
		user.email = "lucasm95@gmail.com";
		user.telefone = "5521954468521";
		
		//Mostrando na Tela os valores do Objeto da Classe Usuário
		//IMPRIMINDO USUÁRIO
		System.out.println("Usuário:");
		System.out.println("Nome: " + user.nome);
		System.out.println("Login: " + user.login);
		System.out.println("Senha: " + user.senha);
		System.out.println("E-mail: " + user.email);
		System.out.println("Telefone: " + user.telefone);
		System.out.println("Matrícula: " + user.matricula);
		
		//Estabelcendo os valores do Objeto da Classe Endereço
		//OBJETO ENDEREÇO
		endereco.logradouro = "Leme";
		endereco.numero = "450";
		endereco.complemento = "3º andar, apartamento 305";
		endereco.bairro = "Copacabana";
		endereco.cidade = "Rio de Janeiro";
		endereco.estado = "RJ";
		endereco.cep = "200245";
		
		//Mostrando na Tela os valores do Objeto da Classe Endereço
		//IMPRIMINDO ENDEREÇO
		System.out.println("\n\n\nEndereço:");
		System.out.println("Estado: " + endereco.estado);
		System.out.println("Cidade: " + endereco.cidade);
		System.out.println("Bairro: " + endereco.bairro);
		System.out.println("Logradouro: " + endereco.logradouro);
		System.out.println("Número: " + endereco.numero);
		System.out.println("Complemento: " + endereco.complemento);
		System.out.println("CEP: " + endereco.cep);
		
		//Estabelecendo os valores do 1º Objeto da Classe Notebook
		//OBJETO NOTE 1
		note1.numeroNote = 15;
		note1.modelo = "Samsung";
		note1.descricao = "All in one de 18 polegadas da Samsung";
		note1.estoque = 135;
		note1.precoUnitario = 1650.50;
		note1.figura = "C:/Computador/Imagens/Samsung";
		note1.dataCadastro = "16/02/2015";
		
		//Estabelecendo os valores do 2º Objeto da Classe Notebook
		//OBJETO NOTE 2
		note2.numeroNote = 10;
		note2.modelo = "LG";
		note2.descricao = "Notebook de 16 polegadas com tela touchscreen";
		note2.estoque = 250;
		note2.precoUnitario = 1230.99;
		note2.figura = "C:/Computador/Imagens/LG";
		note2.dataCadastro = "01/08/2014";
		
		//Estabelecendo os valores do 3º Objeto da Classe Notebook
		//OBJETO NOTE 3
		note3.numeroNote = 38;
		note3.modelo = "Apple";
		note3.descricao = "MAC de 20 polegadas";
		note3.estoque = 45;
		note3.precoUnitario = 2259.99;
		note3.figura = "C:/Computador/Imagens/Apple";
		note3.dataCadastro = "29/04/2016";
		
		//Mostrando na Tela os valores dos Objetos da Classe Notebook
		//IMPRIMINDO NOTE 1
		System.out.println("\n\n\nNotebook 1:");
		System.out.println("Modelo: " + note1.modelo);
		System.out.println("Descrição: " + note1.descricao);
		System.out.println("Número do Notebook: " + note1.numeroNote);
		System.out.println("Estoque: " + note1.estoque);
		System.out.println("Preço Unitário: " + note1.precoUnitario);
		System.out.println("Figura: " + note1.figura);
		System.out.println("Data de Cadastro: " + note1.dataCadastro);
		
		//IMPRIMINDO NOTE 2
		System.out.println("\nNotebook 2:");
		System.out.println("Modelo: " + note2.modelo);
		System.out.println("Descrição: " + note2.descricao);
		System.out.println("Número do Notebook: " + note2.numeroNote);
		System.out.println("Estoque: " + note2.estoque);
		System.out.println("Preço Unitário: " + note2.precoUnitario);
		System.out.println("Figura: " + note2.figura);
		System.out.println("Data de Cadastro: " + note2.dataCadastro);
		
		//IMPRIMINDO NOTE 3
		System.out.println("\nNotebook 3:");
		System.out.println("Modelo: " + note3.modelo);
		System.out.println("Descrição: " + note3.descricao);
		System.out.println("Número do Notebook: " + note3.numeroNote);
		System.out.println("Estoque: " + note3.estoque);
		System.out.println("Preço Unitário: " + note3.precoUnitario);
		System.out.println("Figura: " + note3.figura);
		System.out.println("Data de Cadastro: " + note3.dataCadastro);
		
		//Estabelecendo os valores do Objeto da Classe Pedido
		//OBJETO PEDIR
		pedir.numero = 122;
		pedir.dataEmissao = "02/11/2016";
		pedir.formaDePagamento = "Cartão de Crédito";
		pedir.valorTotal = 1235.55;
		pedir.situacao = "Entregue e Pago";
		
		//Mostrando na Tela os valores do Objeto da Classe Pedido
		//IMPRIMINDO PEDIR
		System.out.println("\n\n\nPedido:");
		System.out.println("Nº do pedido: " + pedir.numero);
		System.out.println("Data de emissão: " + pedir.dataEmissao);
		System.out.println("Forma de pagamento: " + pedir.formaDePagamento);
		System.out.println("Valor Total: " + pedir.valorTotal);
		System.out.println("Situação: " + pedir.situacao);
		
		//Estabelecendo os valores dos Objetos da Classe Item de Pedido
		//OBJETO ITEM 1:
		item1.qtde = 3;
		item1.subtotal = 652.50;
		
		//OBJETO ITEM 2:
		item2.qtde = 5;
		item2.subtotal = 1230.20;

		//Mostrando na Tela os valores dos Objetos da Classe Item de Pedido
		//IMPRIMINDO ITEM 1:
		System.out.println("\n\n\nItem Pedido 1:");
		System.out.println("Quantidade: " + item1.qtde);
		System.out.println("Subtotal: " + item1.subtotal);
		
		//IMPRIMINDO ITEM 2:
		System.out.println("\nItem Pedido 2:");
		System.out.println("Quantidade: " + item2.qtde);
		System.out.println("Subtotal: " + item2.subtotal);
	}
}
















