package decorator;

public class ExtrasMp3 extends Extras{
	

	public ExtrasMp3(Componente componente) {
		super(componente);
	}

	@Override
	public int getValor() {
		return this.getComponente().getValor() + 10;
	}

	@Override
	public String getDescripcion() {
		return this.getComponente().getDescripcion() + "\tMP3\n";
	}

}
