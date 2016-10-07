package factoryMethod.naturalNumber;

public class NaturalNumberCreatorEn extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int valor) {
		return new NaturalNumberEn(valor);
	}

}
