package model;

public abstract class Pessoa {
	
	private int matricula;
	private String nome;
		
	public Pessoa(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}	
	public Pessoa() {
		super();
	}
	
public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [matricula=" + matricula + ", nome=" + nome + "]";
	}
	
	public abstract void calculaSalario();
	
}