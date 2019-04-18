package model;

public class Aluno extends Pessoa {

	private String nomeResponsavel;

	public Aluno(int matricula, String nome, String sexo, String dtNasc, String nomeResponsavel) {
		super(matricula, nome, sexo, dtNasc);
		this.nomeResponsavel = nomeResponsavel;
	}
	private boolean vaiPassar;

	
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public boolean isVaiPassar() {
		return vaiPassar;
	}

	public void setVaiPassar(boolean vaiPassar) {
		this.vaiPassar = vaiPassar;
	}

	public Aluno() {
		super();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Aluno [nomeResponsavel=" + nomeResponsavel + ", vaiPassar=" + vaiPassar + "]";
	}

	
	
	
	
}
