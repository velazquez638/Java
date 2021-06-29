package Observer;

public interface Subject {

	public void aņadirObservador(Observer o);
	public void eliminarObservador(Observer o);
	public void notificarObservadores(String mensaje);
}
