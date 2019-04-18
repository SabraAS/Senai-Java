package controller;

import model.Aluno;
import model.Curso;
import model.Matricula;
import model.Turma;

public class Cadastro {

	public static void main(String[] args) {
		
		//INSTANCIANDO OS OBJETOS
		Aluno alu = new Aluno();
		Aluno alu2 = new Aluno();
		Aluno alu3 = new Aluno();
		
		Curso cur = new Curso();
		Curso cur2 = new Curso();
		Curso cur3 = new Curso();
		
		Matricula mat = new Matricula();
		Matricula mat2 = new Matricula();
		Matricula mat3 = new Matricula();
		
		Turma tur = new Turma();
		Turma tur2 = new Turma();
		Turma tur3 = new Turma();
		
		
		
		//CLASSE ALUNO
		//ESTABELECENDO OS VALORES DO 1º OBJETO DA CLASSE ALUNO
		alu.cpf = "2315-5628";
		alu.rg = "254-25646";
		alu.nome = "Lucas Fernandes";
		alu.fone = "+55 (21) 98564-4521";
		alu.endereco = "Rua São Francisco Xavier, 428";
		
		//CLASSE ALUNO
		//ESTABELECENDO OS VALORES DO 2º OBJETO DA CLASSE ALUNO
		alu2.cpf = "4556-6201";
		alu2.rg = "320-36956";
		alu2.nome = "João Marcos";
		alu2.fone = "+55 (21) 92015-8596";
		alu2.endereco = "Rua Nossa Senhora de Copacabana, 201";
		
		//ESTABELECENDO OS VALORES DO 3º OBJETO DA CLASSE ALUNO
		alu3.cpf = "6565-4256";
		alu3.rg = "452-25344";
		alu3.nome = "Pedro Marconcelos";
		alu3.fone = "+55 (21) 95684-4468";
		alu3.endereco = "Rua Uruguai, 820";
		
		
		
		//CLASSE CURSO
		//ESTABELECENDO OS VALORES DO 1º OBJETO DA CLASSE CURSO
		cur.codigo = 6565;
		cur.nome = "CG";
		cur.preRequisito = "Doutorado em Ciência da Computação";
		cur.cargaHora = 520;
		cur.valor = 350.00;
		
		//ESTABELECENDO OS VALORES DO 2º OBJETO DA CLASSE CURSO
		cur2.codigo = 2150;
		cur2.nome = "Animação 2D";
		cur2.preRequisito = "Doutorado em Artes";
		cur2.cargaHora = 480;
		cur2.valor = 420.00;
		
		//ESTABELECENDO OS VALORES DO 3º OBJETO DA CLASSE CURSO
		cur3.codigo = 2256;
		cur3.nome = "Manutenção de Redes";
		cur3.preRequisito = "Doutorado em Redes";
		cur3.cargaHora = 300;
		cur3.valor = 210.00;
		
		
		
		//CLASSE MATRICULA
		//ESTABELECENDO OS VALORES DO 1º OBJETO DA CLASSE MATRÍCULA
		mat.data = "22/05/2014";
		mat.formaPagto = "Boleto";
		mat.numMat = 281566;
		
		//ESTABELECENDO OS VALORES DO 2º OBJETO DA CLASSE MATRÍCULA
		mat2.data = "12/09/2013";
		mat2.formaPagto = "Cartão de Crédito";
		mat2.numMat = 281056;
		
		//ESTABELECENDO OS VALORES DO 3º OBJETO DA CLASSE MATRÍCULA
		mat3.data = "09/01/2016";
		mat3.formaPagto = "Serviços";
		mat3.numMat = 254658;
		
		
		
		//CLASSE TURMA
		//ESTABELECENDO OS VALORES DO 1º OBJETO DA CLASSE MATRÍCULA
		tur.cod = 205;
		tur.turno = "Manhã";
		tur.dtIni = "04/03/2016";
		tur.dtFim = "15/12/2016";
		tur.hrIni = "08:00";
		tur.hrFim = "12:00";
		tur.qtdVagas = 200;
		
		//ESTABELECENDO OS VALORES DO 2º OBJETO DA CLASSE MATRÍCULA
		tur2.cod = 205;
		tur2.turno = "Manhã/Tarde";
		tur2.dtIni = "29/02/2016";
		tur2.dtFim = "18/12/2016";
		tur2.hrIni = "08:00";
		tur2.hrFim = "15:00";
		tur2.qtdVagas = 80;
		
		//ESTABELECENDO OS VALORES DO 3º OBJETO DA CLASSE MATRÍCULA
		tur3.cod = 205;
		tur3.turno = "Tarde";
		tur3.dtIni = "20/03/2016";
		tur3.dtFim = "28/01/2017";
		tur3.hrIni = "12:00";
		tur3.hrFim = "19:00";
		tur3.qtdVagas = 45;
		
		
		
		//IMPRIMINDO ALUNO
		//IMPRIMINDO NA TELA OS VALORES DO 1º OBJETO DA CLASSE ALUNO
		System.out.println("ALUNO 1:");
		System.out.println("\nNOME: " + alu.nome);
		System.out.println("CELULAR: " + alu.fone);
		System.out.println("CPF: " + alu.cpf);
		System.out.println("RG: " + alu.rg);
		System.out.println("ENDEREÇO: " + alu.endereco);
		
		//IMPRIMINDO NA TELA OS VALORES DO 2º OBJETO DA CLASSE ALUNO
		System.out.println("\nALUNO 2:");
		System.out.println("\nNOME: " + alu2.nome);
		System.out.println("CELULAR: " + alu2.fone);
		System.out.println("CPF: " + alu2.cpf);
		System.out.println("RG: " + alu2.rg);
		System.out.println("ENDEREÇO: " + alu2.endereco);
		
		//IMPRIMINDO NA TELA OS VALORES DO 3º OBJETO DA CLASSE ALUNO
		System.out.println("\nALUNO 3:");
		System.out.println("\nNOME: " + alu3.nome);
		System.out.println("CELULAR: " + alu3.fone);
		System.out.println("CPF: " + alu3.cpf);
		System.out.println("RG: " + alu3.rg);
		System.out.println("ENDEREÇO: " + alu3.endereco);	
		
		
		
		//IMPRIMINDO CURSO
		//IMPRIMINDO NA TELA OS VALORES DO 1º OBJETO DA CLASSE CURSO
		System.out.println("\n\n\nCURSO 1:");
		System.out.println("\nNOME: " + cur.nome);
		System.out.println("CARGA HORÁRIA: " + cur.cargaHora);
		System.out.println("PRÉ REQUISITO: " + cur.preRequisito);
		System.out.println("CÓDIGO: " + cur.codigo);
		System.out.println("VALOR: " + cur.valor);
		
		//IMPRIMINDO NA TELA OS VALORES DO 2º OBJETO DA CLASSE CURSO
		System.out.println("\nCURSO 2:");
		System.out.println("\nNOME: " + cur2.nome);
		System.out.println("CARGA HORÁRIA: " + cur2.cargaHora);
		System.out.println("PRÉ REQUISITO: " + cur2.preRequisito);
		System.out.println("CÓDIGO: " + cur2.codigo);
		System.out.println("VALOR: " + cur2.valor);
		
		//IMPRIMINDO NA TELA OS VALORES DO 3º OBJETO DA CLASSE CURSO
		System.out.println("\nCURSO 3:");
		System.out.println("\nNOME: " + cur3.nome);
		System.out.println("CARGA HORÁRIA: " + cur3.cargaHora);
		System.out.println("PRÉ REQUISITO: " + cur3.preRequisito);
		System.out.println("CÓDIGO: " + cur3.codigo);
		System.out.println("VALOR: " + cur3.valor);
		
		
		
		//IMPRIMINDO MATRÍCULA
		//IMPRIMINDO NA TELA OS VALORES DO 1º OBJETO DA CLASSE MATRÍCULA
		System.out.println("\n\n\nMATRÍCULA 1:");
		System.out.println("\nFORMA DE PAGAMENTO: " + mat.formaPagto);
		System.out.println("DATA DE MATRÍCULA: " + mat.data);
		System.out.println("NÚMERO DE MATRÍCULA: " + mat.numMat);
		
		//IMPRIMINDO NA TELA OS VALORES DO 2º OBJETO DA CLASSE MATRÍCULA
		System.out.println("\nMATRÍCULA 2:");
		System.out.println("\nFORMA DE PAGAMENTO: " + mat2.formaPagto);
		System.out.println("DATA DE MATRÍCULA: " + mat2.data);
		System.out.println("NÚMERO DE MATRÍCULA: " + mat2.numMat);
		
		//IMPRIMINDO NA TELA OS VALORES DO 3º OBJETO DA CLASSE MATRÍCULA
		System.out.println("\nMATRÍCULA 3:");
		System.out.println("\nFORMA DE PAGAMENTO: " + mat3.formaPagto);
		System.out.println("DATA DE MATRÍCULA: " + mat3.data);
		System.out.println("NÚMERO DE MATRÍCULA: " + mat3.numMat);
		
		
		
		//IMPRIMINDO TURMA
		//IMPRIMINDO NA TELA OS VALORES DO 1º OBJETO DA CLASSE TURMA
		System.out.println("\n\n\nTURMA 1:");
		System.out.println("\nCÓDIGO: " + tur.cod);
		System.out.println("TURNO: " + tur.turno);
		System.out.println("DATA DE INÍCIO: " + tur.dtIni);
		System.out.println("DATA DE ENCERRAMENTO: " + tur.dtFim);
		System.out.println("HORA DE INÍCIO: " + tur.hrIni);
		System.out.println("HORA DE ENCERRAMENTO: " + tur.hrFim);
		System.out.println("QUANTIDADE DE VAGAS: " + tur.qtdVagas);
		
		//IMPRIMINDO NA TELA OS VALORES DO 2º OBJETO DA CLASSE TURMA
		System.out.println("\nTURMA 2:");
		System.out.println("\nCÓDIGO: " + tur2.cod);
		System.out.println("TURNO: " + tur2.turno);
		System.out.println("DATA DE INÍCIO: " + tur2.dtIni);
		System.out.println("DATA DE ENCERRAMENTO: " + tur2.dtFim);
		System.out.println("HORA DE INÍCIO: " + tur2.hrIni);
		System.out.println("HORA DE ENCERRAMENTO: " + tur2.hrFim);
		System.out.println("QUANTIDADE DE VAGAS: " + tur2.qtdVagas);
		
		//IMPRIMINDO NA TELA OS VALORES DO 3º OBJETO DA CLASSE TURMA
		System.out.println("\nTURMA 3:");
		System.out.println("\nCÓDIGO: " + tur3.cod);
		System.out.println("TURNO: " + tur3.turno);
		System.out.println("DATA DE INÍCIO: " + tur3.dtIni);
		System.out.println("DATA DE ENCERRAMENTO: " + tur3.dtFim);
		System.out.println("HORA DE INÍCIO: " + tur3.hrIni);
		System.out.println("HORA DE ENCERRAMENTO: " + tur3.hrFim);
		System.out.println("QUANTIDADE DE VAGAS: " + tur3.qtdVagas);

		
		
		
		
		
		
		
		
		
		

	}
}
