package factoryMethod.naturalNumber;

public class NaturalNumberManager {
	private NaturalNumber naturalNumber;
	private NaturalNumberCreator creator;
	
	public void createNaturalNumber(){
		this.naturalNumber = this.creator.createNaturalNumber(1);
	}
	
	public void setNaturalNumberCreator(NaturalNumberCreator creator){
		this.creator = creator;
	}

	public NaturalNumber getNaturalNumber() {
		return naturalNumber;
	}

}
