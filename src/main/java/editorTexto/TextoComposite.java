package editorTexto;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoComposite extends TextoComponente {
	private List<TextoComponente> list;

	public TextoComposite() {
		list = new ArrayList<TextoComponente>();
	}

	public List<TextoComponente> getList() {
		return list;
	}

	public void setList(List<TextoComponente> list) {
		this.list = list;
	}

	public abstract void remove(TextoComponente component);

	public boolean isComposite() {
		return true;
	}
}
