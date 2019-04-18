package model;

public class Mamifero extends Animal {
	
	private String habitat;

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public Mamifero() {
		super();
	}

	public Mamifero(String nomenclatura, int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao, String habitat) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.habitat = habitat;
	}
	
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println("Pulmonar");
		
	}
	
	public void temperaturaCorporal() {
		System.out.println("Temperatura Corporal: Homeotérmico");
	}
	
	@Override
	public void exibir() {
		System.out.println("\n\nCaraterísticas do animal selecionado:\n");
		System.out.println("Nomenclatura: " + super.getNomenclatura());
		System.out.println("Número de Patas: " + super.getNumeroDePatas());		
		System.out.println("Coberto Por: " + super.getCobertoPor());
		System.out.println("Reprodução: " + super .getReproducao());
		System.out.println("Alimentação: " + super . getAlimentacao());
		System.out.println("Habitat: " + this.habitat);
		tipoDeRespiracao();
		temperaturaCorporal();
	}
	

}
