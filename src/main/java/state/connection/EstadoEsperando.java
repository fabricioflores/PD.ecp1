package state.connection;

public class EstadoEsperando extends State {

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
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(Conexion conection, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conection, int respuesta) {
		if (respuesta == 0) {
			conection.setEstado(Estado.PREPARADO, new EstadoPreparado());
		} else {
			conection.setEstado(Estado.CERRADO, new EstadoCerrado());
		}
	}

}
