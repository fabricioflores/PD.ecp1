package factoryMethod.naturalNumber;

public class NaturalNumberCreatorEs extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int valor) {
		return new NaturalNumberEs(valor);
	}

}
