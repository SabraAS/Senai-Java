package model;

public class Aluno {

	private String nome;
	private String telefone;
	private String cpf;
	private String dataDeNascimento;
	private int matricula;

	public Aluno(String nome, String telefone, String cpf, String dataDeNascimento, int matricula) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.matricula = matricula;
	}

	public void mostrar() {
		System.out.println("Alunos: \n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data de Nascimento: " + this.dataDeNascimento);
		System.out.println("Matrícula: " + this.matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}