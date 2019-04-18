package model;

public abstract class Pessoa {

	private int matricula;
	private String nome;
	private String sexo;
	private String dtNasc;
	public Pessoa(int matricula, String nome, String sexo, String dtNasc) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.dtNasc = dtNasc;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	@Override
	public String toString() {
		return "Pessoa [matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", dtNasc=" + dtNasc + "]";
	}
	
	
	
	
	
	
}
