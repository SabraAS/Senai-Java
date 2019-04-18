package model;

public class Reptil extends Animal {
	
	private boolean capacidadeRegenerativa;

	public boolean isCapacidadeRegenerativa() {
		return capacidadeRegenerativa;
	}

	public void setCapacidadeRegenerativa(boolean capacidadeRegenerativa) {
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}

	public Reptil() {
		super();
	}

	public Reptil(String nomenclatura, int numeroDePatas, String cobertoPor,
			String reproducao, String alimentacao,
			boolean capacidadeRegenerativa) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.capacidadeRegenerativa = capacidadeRegenerativa;
	}
	
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println("Traqueal");
}
	
	public void temperaturaCorporal() {
		System.out.println("Temperatura Corporal: Pecilot�rmico");
		
	}
	
	@Override
	public void exibir() {
		System.out.println("\n\nCarater�sticas do animal selecionado:\n");
		System.out.println("Nomenclatura: " + super.getNomenclatura());
		System.out.println("N�mero de Patas: " + super.getNumeroDePatas());		
		System.out.println("Coberto Por: " + super.getCobertoPor());
		System.out.println("Reprodu��o: " + super .getReproducao());
		System.out.println("Alimenta��o: " + super . getAlimentacao());
		System.out.println("Capacidade Regenerativa: " + this.capacidadeRegenerativa);
		tipoDeRespiracao();
		temperaturaCorporal();
	}
		
	}
