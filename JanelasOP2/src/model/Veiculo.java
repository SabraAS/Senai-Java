package model;

public class Veiculo {
	
	private String placa;
	private String chassi;
	private String tipo;
	private String combustivel;
	private String marca;
	private String modelo;
	public Veiculo(String placa, String chassi, String tipo, String combustivel, String marca, String modelo) {
		super();
		this.placa = placa;
		this.chassi = chassi;
		this.tipo = tipo;
		this.combustivel = combustivel;
		this.marca = marca;
		this.modelo = modelo;
	}
	public Veiculo() {
		super();
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", chassi=" + chassi + ", tipo=" + tipo + ", combustivel=" + combustivel
				+ ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
}
