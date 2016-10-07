package state.connection;

public class Conexion {
    private Estado state;
    private Link link;

    public Conexion(Link link) {
    	assert link != null;
        this.link = link;
        this.setState(new EstadoCerrado());
    }

    protected void setState(Estado state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Context[" + state.toString() + "]";
    }
    
    public Estado getEstado(){
    	return this.state;
    }

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}
 
}
