package InterfazGenericos;

public interface IBuffer <T> {

	public boolean vacio();
	public void inserta (T e);
	public T elimina() 	throws Exception;
	public int inicio();
	public int fin();
	public int sucesor(int p);
	public T elemento(int p) throws Exception;
}
