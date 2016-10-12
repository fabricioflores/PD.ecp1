package mementable.calculator;

import command.calculator.Calculator;

public class CalculadoraMementable extends Calculator implements Mementable<MementoCalculadora> {

	private int valorTotal;

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(this.getTotal());
	}

	@Override
	public void restoreMemento(MementoCalculadora mementoCalculadora) {
		this.setTotal(mementoCalculadora.getTotal());
	}

}
