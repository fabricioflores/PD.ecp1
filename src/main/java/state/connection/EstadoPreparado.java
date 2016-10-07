package state.connection;

public class EstadoPreparado extends State{

	@Override
	public void abrir(Conexion conection) {
	}

	@Override
	public void cerrar(Conexion conection) {
		conection.setEstado(Estado.CERRADO);
		conection.setState(new EstadoCerrado());	
	}

	@Override
	public void parar(Conexion conection) {
		conection.setEstado(Estado.PARADO);
		conection.setState(new EstadoParado());
	}

	@Override
	public void iniciar(Conexion conection) {		
	}
	
	@Override
	public void enviar(Conexion conection, String msg) {
		conection.getLink().enviar(msg);
		conection.setEstado(Estado.ESPERANDO);
		conection.setState(new EstadoEsperando());
	}

	@Override
	public void recibir(Conexion conection, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

}
