package expression;

public abstract class ExpresionComposite extends Expresion{
	protected Expresion exp1;
	protected Expresion exp2;
	protected String operacion;
	
	public ExpresionComposite(Expresion exp1, Expresion exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
	public String toString(){
		return "(" + exp1.toString() + this.operacion + exp2.toString() + ")";
	}

}
