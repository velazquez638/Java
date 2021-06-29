package Decorator;

public class MascotaSaltadora extends MascotaDecorator {
	
	 public MascotaSaltadora(Mascota mascota) {
		 super(mascota);
	 }
	 
	 public String masCaracteristicas() {
		 
		 return ", me gusta saltar";
	 }
}
