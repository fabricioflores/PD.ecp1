package editorTexto;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {

	private static CaracterFactory factory = null;

	private Map<Character, Caracter> charMap;

	private CaracterFactory() {
		charMap = new HashMap<Character, Caracter>();
	}

	public Caracter get(char key) {
		if (charMap.containsKey(key)) {
			return charMap.get(key);
		} else {
			Caracter c = new Caracter(key);
			charMap.put(key, c);
			return c;
		}
	}

	public static CaracterFactory getFactory() {
		if (CaracterFactory.factory == null) {
			CaracterFactory.factory = new CaracterFactory();
		}
		return CaracterFactory.factory;
	}
}
