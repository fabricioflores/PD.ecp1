package expression;

public class Resta extends ExpresionComposite{

	public Resta(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
		this.operacion = "-";
	}

	@Override
	public int resolve() {
		return this.exp1.resolve() - this.exp2.resolve();
	}

}
