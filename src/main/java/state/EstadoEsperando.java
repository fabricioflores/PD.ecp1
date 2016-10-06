package state;

public class EstadoEsperando extends Estado {

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
	public void enviar(Conexion conection, Link link, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conection, int respuesta) {
        if (respuesta == 0) {
            conection.setState(new EstadoPreparado());
        } else {
            conection.setState(new EstadoCerrado());
        }
	}

	@Override
	public String toString() {
		return "ESPERANDO";
	}

}
