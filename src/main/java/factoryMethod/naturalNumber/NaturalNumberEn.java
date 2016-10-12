package factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {

	private static final String[] lang = { "zero", "one", "two", "tree", "four", "five" };

	public NaturalNumberEn(int value) {
		super(value, lang);
	}

}
