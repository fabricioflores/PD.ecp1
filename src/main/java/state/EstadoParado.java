package state;

public class EstadoParado extends Estado {

	@Override
	public void abrir(Conexion conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion conection) {
	}

	@Override
	public void iniciar(Conexion conection) {
		conection.setState(new EstadoPreparado());
	}

	@Override
	public void enviar(Conexion conection, Link link, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conection, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public String toString() {
		return "PARADO";
	}

}
