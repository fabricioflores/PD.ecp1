package mementable.calculator;

import command.calculator.Calculator;
import upm.jbb.IO;

public class GuardarCommand extends MementableComando {

	private GestorMementos<MementoCalculadora> gm;

	public GuardarCommand(Calculator calculator, GestorMementos<MementoCalculadora> gm) {
		super(calculator);
		this.gm = gm;
	}

	@Override
	public void execute() {
		MementoCalculadora mc = new MementoCalculadora(this.getCalculator().getTotal());
		gm.addMemento(IO.getIO().readString("Key memento"), mc);
	}

	@Override
	public String name() {
		return "Crear memento";
	}

}
