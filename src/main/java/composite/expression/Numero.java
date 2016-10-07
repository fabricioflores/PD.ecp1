package composite.expression;

public class Numero extends Expresion {
	private int valor;
	
	public Numero(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		return valor;
	}

	@Override
	public int resolve() {
		return this.valor;
	}

	@Override
	public String toString() {
		return "" + this.valor;
	}

}
