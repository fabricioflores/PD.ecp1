package editorTexto;

public class Texto extends TextoComposite {

	@Override
	public void remove(TextoComponente component) {
		if (component.isComposite()) {
			this.getList().remove(component);
		}
	}

	@Override
	public void add(TextoComponente component) {
		if (component.isComposite()) {
			this.getList().add(component);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public String print(boolean toUppercase) {
		String result = "";
		for (TextoComponente component : this.getList()) {
			result = result + component.print(toUppercase);
		}
		result = result + "---o---\n";
		return result;
	}

}
