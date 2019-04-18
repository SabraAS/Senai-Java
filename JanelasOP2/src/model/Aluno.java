package model;

public class Aluno{
	
	private int matricula;
	private String nome;
	private String dtNasc;
	private String EstadoCivil;
	private String sexo;
	
	public Aluno(int matricula, String nome, String dtNasc, String estadoCivil, String sexo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dtNasc = dtNasc;
		EstadoCivil = estadoCivil;
		this.sexo = sexo;
	}

	public Aluno() {
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

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", dtNasc=" + dtNasc + ", EstadoCivil="
				+ EstadoCivil + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
	
	}
	
	
