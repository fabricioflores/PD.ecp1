package command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends Comando {

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		this.getCalculator().subtract(IO.getIO().readInt());
	}

	@Override
	public String name() {
		return "Subtract";
	}

}
