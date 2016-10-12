package composite.expression;

public class Multiplicacion extends ExpresionComposite {

	public Multiplicacion(Expresion exp1, Expresion exp2) {
		super(exp1, exp2, "*");
	}

	@Override
	public int resolve() {
		return this.getExp1().resolve() * this.getExp2().resolve();
	}

}
