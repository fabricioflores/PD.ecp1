package factoryMethod.naturalNumber;

public class Ejecutable {

	public static void main(String[] args) {
		NaturalNumberManager naturalNumberFactory= new NaturalNumberManager();
		naturalNumberFactory.setNaturalNumberCreator(new NaturalNumberCreatorEs());
		System.out.println(naturalNumberFactory.getNaturalNumber().getTextValue());;
	}

}
