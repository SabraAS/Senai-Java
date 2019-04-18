package model;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private int mesesEmpresa;
	
	public Funcionario(int matricula, String nome, String sexo, String dtNasc, String cargo, int mesesEmpresa) {
		super(matricula, nome, sexo, dtNasc);
		this.cargo = cargo;
		this.mesesEmpresa = mesesEmpresa;
	}
	public Funcionario() {
		super();
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getMesesEmpresa() {
		return mesesEmpresa;
	}
	public void setMesesEmpresa(int mesesEmpresa) {
		this.mesesEmpresa = mesesEmpresa;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Funcionario [cargo=" + cargo + ", mesesEmpresa=" + mesesEmpresa + "]";
	}

}
