package editorTexto;

public class Caracter extends TextoComponente {
	private char c;

	public Caracter(char c) {
		this.c = c;
	}

	@Override
	public void add(TextoComponente component) {
	}

	@Override
	public String print(boolean toUppercase) {
		if (toUppercase) {
			return "" + Character.toUpperCase(c);
		}
		return "" + c;
	}

	@Override
	public boolean isComposite() {
		return false;
	}

}
