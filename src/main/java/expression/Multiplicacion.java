package expression;

public class Multiplicacion extends ExpresionComposite{

	public Multiplicacion(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int resolve() {
		return this.exp1.resolve() * this.exp2.resolve();
	}

}
