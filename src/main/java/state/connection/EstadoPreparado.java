package state.connection;

public class EstadoPreparado extends Estado{

	@Override
	public void abrir(Conexion conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

	@Override
	public void cerrar(Conexion conection) {
		conection.setState(new EstadoCerrado());	
	}

	@Override
	public void parar(Conexion conection) {
		conection.setState(new EstadoParado());
	}

	@Override
	public void iniciar(Conexion conection) {		
	}
	
	@Override
	public void enviar(Conexion conection, Link link, String msg) {
		link.enviar(msg);
        conection.setState(new EstadoEsperando());
	}


	@Override
	public void recibir(Conexion conection, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

	@Override
	public String toString() {
		return "PREPARADO";
	}

}
