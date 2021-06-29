package Decorator;

public class MascotaNadadora extends MascotaDecorator {
	
	 public MascotaNadadora(Mascota mascota) {
		 
		 super(mascota);
	 }
	 
	 public String masCaracteristicas() {
		 
		 return ", me gusta nadar";
	 }
}
