package command.calculator;

public class ResetCommand extends Comando{

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		this.getCalculator().reset();
	}

	@Override
	public String name() {
		return "Reset";
	}

}
