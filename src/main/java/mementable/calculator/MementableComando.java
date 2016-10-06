package mementable.calculator;

import command.calculator.Calculator;
import command.calculator.Comando;

public abstract class MementableComando extends Comando {
	
	private GestorMementos gestorMementos;

	public MementableComando(Calculator calculator) {
		super(calculator);
		gestorMementos = new GestorMementos();
	}

	public GestorMementos getGestorMementos() {
		return gestorMementos;
	}

	public void setGestorMementos(GestorMementos gestorMementos) {
		this.gestorMementos = gestorMementos;
	}

}
