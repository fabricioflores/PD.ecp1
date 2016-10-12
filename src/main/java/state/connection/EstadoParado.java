package state.connection;

public class EstadoParado extends State {

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
		conection.setEstado(Estado.PREPARADO, new EstadoPreparado());
	}

	@Override
	public void enviar(Conexion conection, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conection, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
