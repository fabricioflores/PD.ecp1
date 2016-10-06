package mementable.calculator;

import command.calculator.Calculator;
import upm.jbb.IO;

public class GuardarCommand extends MementableComando{

	public GuardarCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		CalculadoraMementable cm = (CalculadoraMementable) this.getCalculator();
		this.getGestorMementos().addMemento(IO.getIO().readString(), cm.createMementable());
	}

	@Override
	public String name() {
		return "Crear memento";
	}

}
