package Command;

public class CalefaccionEncender implements Comando{
	
	
	private Calefaccion calefaccion;
	
	public CalefaccionEncender(Calefaccion calefaccion) {
		this.calefaccion = calefaccion;
	}
	@Override
	public void ejecuta() {
		this.calefaccion.encender();
	}


}
