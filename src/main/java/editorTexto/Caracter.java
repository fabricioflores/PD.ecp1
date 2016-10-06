package editorTexto;

public class Caracter extends TextoComponente{
	private char c;
	@Override
	public void add(TextoComponente component) {		
	}

	@Override
	public String print(boolean toUppercase) {	
		if(toUppercase){
			return "" + Character.toUpperCase(c);
		}
		return "" + c;
	}

}
