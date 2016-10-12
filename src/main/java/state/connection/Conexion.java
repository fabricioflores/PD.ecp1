package state.connection;

public class Conexion {
	private Estado estado;
	private State state;
	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.estado = Estado.CERRADO;
		this.state = new EstadoCerrado();
	}

	@Override
	public String toString() {
		return "Context[" + state.toString() + "]";
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado, State state) {
		this.estado = estado;
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public void abrir() {
		this.state.abrir(this);
	}

	public void cerrar() {
		this.state.cerrar(this);
	}

	public void parar() {
		this.state.parar(this);
	}

	public void iniciar() {
		this.state.iniciar(this);
	}

	public void enviar(String message) {
		this.state.enviar(this, message);
	}

	public void recibir(int response) {
		this.state.recibir(this, response);
	}

}
