package Command;

public class CalefaccionApagar implements Comando{
	
	 private Calefaccion calefaccion;
	 
	 public CalefaccionApagar(Calefaccion calefaccion) {
		 this.calefaccion = calefaccion;
	 }
	 
	@Override
	public void ejecuta() {
		this.calefaccion.apagar();
	}

}
