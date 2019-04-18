package model;

public abstract class Veiculo {
	
	private double  autonomia;
	private double VelocidadeM;
	public Veiculo(double autonomia, double velocidadeM) {
		super();
		this.autonomia = autonomia;
		VelocidadeM = velocidadeM;
	}
	public Veiculo() {
		super();
	}
	public double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	public double getVelocidadeM() {
		return VelocidadeM;
	}
	public void setVelocidadeM(double velocidadeM) {
		VelocidadeM = velocidadeM;
	}
	@Override
	public String toString() {
		return "Veiculo [autonomia=" + autonomia + ", VelocidadeM=" + VelocidadeM + "]";
	}
	
	

}
