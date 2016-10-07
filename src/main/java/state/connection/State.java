package state.connection;

public abstract class State {
	public abstract void abrir(Conexion conection);
	public abstract void cerrar(Conexion conection);
	public abstract void parar(Conexion conection);
	public abstract void iniciar(Conexion conection);
	public abstract void enviar(Conexion conection, String msg);
	public abstract void recibir(Conexion conection, int respuesta);
}
