package mementable.calculator;

public interface Mementable {
	MementoCalculadora createMementable();
	void restoreMemento(MementoCalculadora mementoCalculadora);

}
