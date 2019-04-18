package model;

public class Carro extends Veiculo{
	
	private String tipoCombustivel;
	private int qntPortas;
	
	public Carro(double autonomia, double velocidade, String tipoCombustivel, int qntPortas) {
		super(autonomia, velocidade);
		this.tipoCombustivel = tipoCombustivel;
		this.qntPortas = qntPortas;
	}
	public Carro() {
		super();
	}


	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public int getQntPortas() {
		return qntPortas;
	}
	public void setQntPortas(int qntPortas) {
		this.qntPortas = qntPortas;
	}
	@Override
	public String toString() {
		return super.toString() + "Carro [tipoCombustivel=" + tipoCombustivel + ", qntPortas=" + qntPortas + "]";
	}
	
	

}
