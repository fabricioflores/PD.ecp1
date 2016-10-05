package decorator;

public abstract class Extras extends Componente{
	private Componente componente;
	
	public Extras(Componente componente){
		this.componente = componente;
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	
}
