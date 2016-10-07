package factoryMethod.naturalNumber;

public class NaturalNumberManager {
	
	private NaturalNumber naturalNumber;
	private NaturalNumberCreator creator;
	
	public void createNaturalNumber(int valor){
		this.naturalNumber = this.creator.createNaturalNumber(valor);
	}
	
	public void setNaturalNumberCreator(NaturalNumberCreator creator){
		this.creator = creator;
	}

	public NaturalNumber getNaturalNumber() {
		return naturalNumber;
	}

}
