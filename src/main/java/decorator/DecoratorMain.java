package decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.setValor(10000);
		c.setDescripcion("Alfa Romeo");
		Componente e1 = new ExtrasMp3(c);
		Componente e2 = new ExtrasAros(e1);
		System.out.print(e2.getDescripcion());
		System.out.print("\tTotal: " +  + e2.getValor());
	}

}
