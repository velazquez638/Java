package Observer;

public interface Subject {

	public void a�adirObservador(Observer o);
	public void eliminarObservador(Observer o);
	public void notificarObservadores(String mensaje);
}
