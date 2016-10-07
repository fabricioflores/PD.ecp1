package state.connection;

public class EstadoCerrado extends State{

	@Override
	public void abrir(Conexion conection) {
		conection.setEstado(Estado.PREPARADO);
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
	public void enviar(Conexion conection, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

}
