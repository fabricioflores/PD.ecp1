package mementable.calculator;

import command.calculator.AddCommand;
import command.calculator.CommandManager;
import command.calculator.PrintCommand;
import command.calculator.ResetCommand;
import command.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainCalculatorMementos {
    private CommandManager commandManager;

    public MainCalculatorMementos() {
        CalculadoraMementable calculator = new CalculadoraMementable();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new GuardarCommand(calculator));
        this.commandManager.add(new DeshacerCommand(calculator));

    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculatorMementos());
    }
}
