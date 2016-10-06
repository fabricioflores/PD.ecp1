package mementable.calculator;

import command.calculator.Calculator;
import upm.jbb.IO;

public class DeshacerCommand extends MementableComando{

	public DeshacerCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		CalculadoraMementable cm = (CalculadoraMementable) this.getCalculator();
		this.getGestorMementos().getMemento(IO.getIO().readString());
		this.getCalculator().reset();
		this.getCalculator().add(cm.getValorTotal());
	}

	@Override
	public String name() {
		return "Regresar memento";
	}

}
