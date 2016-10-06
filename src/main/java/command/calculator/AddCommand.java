package command.calculator;

import upm.jbb.IO;

public class AddCommand extends Comando{

	public AddCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		this.getCalculator().add(IO.getIO().readInt());
	}

	@Override
	public String name() {
		return "Sumar";
	}

}
