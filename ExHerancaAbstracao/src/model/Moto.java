package model;

public class Moto extends Veiculo {
	
	private String cilindrada;
	private double consumoMedio;
	
	public Moto(String cilindrada, double consumoMedio) {
		super();
		this.cilindrada = cilindrada;
		this.consumoMedio = consumoMedio;
	}
		
	public Moto() {
		super();
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	@Override
	public String toString() {
		return super.toString() + "Moto [cilidrada=" + cilindrada + ", consumoMedio=" + consumoMedio + "]";
	}
	

	
	
}
