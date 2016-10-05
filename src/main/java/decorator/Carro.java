package decorator;

public class Carro extends Componente{
	
	private int valor;
	private String descripcion;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getDescripcion() {
		return descripcion + "\n";
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
