package FlyWeight;

public class LapizMediano implements Lapiz{
	
	final GrosorLapiz grosor = GrosorLapiz.MEDIO;
	private ColorLapiz color = null;
	
	public void setColor(ColorLapiz color) {
		
		this.color = color;
	}
	
	@Override
	public void escribe(String texto) {
		System.out.println("Escribiendo con el lapiz medio " + color + ": " + texto);
	}


}
