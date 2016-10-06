package mementable.calculator;

import command.calculator.Calculator;

public class CalculadoraMementable extends Calculator implements Mementable{
	
	private int valorTotal;

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public MementoCalculadora createMementable() {
		return new MementoCalculadora();
	}

	@Override
	public void restoreMemento(MementoCalculadora mementoCalculadora) {
		this.setTotal(mementoCalculadora.getTotal());
	}

}
