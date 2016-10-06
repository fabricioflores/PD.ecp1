package state;

public class EstadoCerrado extends Estado{

	@Override
	public void abrir(Conexion conection) {
		conection.setState(new EstadoPreparado());
	}

	@Override
	public void cerrar(Conexion conection) {		
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
	public void recibir(Conexion conection, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

	@Override
	public String toString() {
		return "CERRADO";
	}

	@Override
	public void enviar(Conexion conection, Link link, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

}
