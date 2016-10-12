package mementable.calculator;

import command.calculator.Calculator;
import upm.jbb.IO;

public class DeshacerCommand extends MementableComando {

	private GestorMementos<MementoCalculadora> gm;

	public DeshacerCommand(Calculator calculator, GestorMementos<MementoCalculadora> gm) {
		super(calculator);
		this.gm = gm;
	}

	@Override
	public void execute() {
		MementoCalculadora cm = gm.getMemento(IO.getIO().readString("Memento key"));
		this.getCalculator().reset();
		this.getCalculator().add(cm.getTotal());
	}

	@Override
	public String name() {
		return "Regresar memento";
	}

}
