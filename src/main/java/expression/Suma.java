package expression;

public class Suma extends ExpresionComposite{

	public Suma(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int resolve() {
		return this.exp1.resolve() + this.exp2.resolve();
	}

}
