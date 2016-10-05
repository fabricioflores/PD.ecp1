package decorator;

public class ExtrasAros extends Extras{

	public ExtrasAros(Componente componente) {
		super(componente);
	}

	@Override
	public int getValor() {
		return this.getComponente().getValor() + 200;
	}

	@Override
	public String getDescripcion() {
		return this.getComponente().getDescripcion() + "\tAros\n";
	}

}
