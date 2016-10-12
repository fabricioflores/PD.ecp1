package composite.expression;

public abstract class ExpresionComposite extends Expresion {
	private Expresion exp1;
	private Expresion exp2;
	private String operacion;

	public ExpresionComposite(Expresion exp1, Expresion exp2, String operacion) {
		this.exp1 = exp1;
		this.exp2 = exp2;
		this.operacion = operacion;
	}

	public String toString() {
		return "(" + exp1.toString() + this.operacion + exp2.toString() + ")";
	}

	public Expresion getExp1() {
		return exp1;
	}

	public void setExp1(Expresion exp1) {
		this.exp1 = exp1;
	}

	public Expresion getExp2() {
		return exp2;
	}

	public void setExp2(Expresion exp2) {
		this.exp2 = exp2;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

}
