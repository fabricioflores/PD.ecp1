package composite.expression;

public class Suma extends ExpresionComposite{

	public Suma(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
		this.setOperacion("+");
	}

	@Override
	public int resolve() {
		return this.getExp1().resolve() + this.getExp2().resolve();
	}

}
