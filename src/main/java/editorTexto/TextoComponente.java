package editorTexto;

public abstract class TextoComponente {
	public abstract void add(TextoComponente component);

	public abstract String print(boolean toUpperCase);

	public abstract boolean isComposite();

}
