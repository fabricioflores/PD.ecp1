package factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

    public NaturalNumberEs(int value) {
		super(value);
		String[] lang ={"cero", "uno", "dos", "tres", "cuatro", "cinco"};
		this.setTextValue(lang);
	}
    
}
