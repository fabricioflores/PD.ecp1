package factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {
	
	private static final String[] lang ={"uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
		super(value);
		this.setTextValue(lang);
	}
    
}
