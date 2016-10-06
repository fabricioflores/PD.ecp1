package editorTexto;

public class Parrafo extends TextoComposite{

	@Override
	public void remove() {		
	}

	@Override
	public void add(TextoComponente component) {	
		if(component.getClass().isInstance(Parrafo.class) || component.getClass().isInstance(Texto.class)){
			new UnsupportedOperationException();
		}
	}

	@Override
	public String print(boolean toUppercase) {
		return null;
	}

}
