package factoryMethod.naturalNumber;

import upm.jbb.IO;

public class Ejecutable {

	public static void main(String[] args) {
		NaturalNumberManager naturalNumberFactory= new NaturalNumberManager();
		naturalNumberFactory.setNaturalNumberCreator(new NaturalNumberCreatorEs());
		naturalNumberFactory.createNaturalNumber(1);
		IO.getIO().println(naturalNumberFactory.getNaturalNumber().getTextValue());
		naturalNumberFactory.setNaturalNumberCreator(new NaturalNumberCreatorEn());
		naturalNumberFactory.createNaturalNumber(5);
		IO.getIO().println(naturalNumberFactory.getNaturalNumber().getTextValue());;
	}

}
