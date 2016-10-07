package composite.expression;

public class Resta extends ExpresionComposite{

	public Resta(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
		this.setOperacion("-");
	}

	@Override
	public int resolve() {
		return this.getExp1().resolve() - this.getExp2().resolve();
	}

}
