package mementable.calculator;

import java.util.HashMap;
import java.util.Map;

public class GestorMementos {
	private Map<String, MementoCalculadora> mementos = new HashMap<>();
	
	public void addMemento(String key, MementoCalculadora memento){
		this.mementos.put(key, memento);
	}
	
	public MementoCalculadora getMemento(String key){
		return this.mementos.get(key);
	}
	
	public String[] claves(){
		return this.mementos.keySet().toArray(new String[0]);
	}
}
