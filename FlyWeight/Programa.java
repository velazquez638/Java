package FlyWeight;

public class Programa {

	 public static void main(String[] args) {
		 
		 Lapiz lapizFinoRojo = LapizFactory.getLapizFino(ColorLapiz.ROJO);
		 lapizFinoRojo.escribe("Hola de color rojo");
		 
		 Lapiz lapizFinoAzul = LapizFactory.getLapizFino(ColorLapiz.AZUL);
		 lapizFinoAzul.escribe("Hola de color azul");
		 
		 Lapiz lapizMedioAmarillo =LapizFactory.getLapizMedio(ColorLapiz.AMARILLO);
		 lapizMedioAmarillo.escribe("Hola de color amarillo");
		 
		 Lapiz lapizGruesoMagenta1 = LapizFactory.getLapizGrueso(ColorLapiz.MAGENTA);
		 lapizGruesoMagenta1.escribe("Hola de color magenta");
		 
		 Lapiz lapizGruesoMagenta2 = LapizFactory.getLapizGrueso(ColorLapiz.MAGENTA);
		 lapizGruesoMagenta2.escribe("Hola de color magenta");
	}
}
