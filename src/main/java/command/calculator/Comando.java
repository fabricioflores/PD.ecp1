package command.calculator;

public abstract class Comando implements ComandoInterface{
	private Calculator calculator;
	
	public Comando(Calculator calculator){
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
}
