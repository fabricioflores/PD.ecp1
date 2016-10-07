package factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {

    public NaturalNumberEn(int value) {
		super(value);
		String[] lang ={"zero", "one", "two", "tree", "four", "five"};
		this.setTextValue(lang);
	}
    
}
