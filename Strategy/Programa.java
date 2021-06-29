package Strategy;

public class Programa {

	public static void main(String[] args) {

		CondicionesTiempo t1 = new CondicionesTiempo(25, 40, new MaratonStrategy());
		CondicionesTiempo t2 = new CondicionesTiempo(15, 50, new SenderismoStrategy());
		CondicionesTiempo t3 = new CondicionesTiempo(-5, 50, new GimnasioStrategy());
		
		System.out.println(((t1.getRecomendacion() ? "Se aconseja" : "Evite"))
				+ " correr un marat�n con " + t1.getTemperatura() + "�C y " + t1.getHumedad() + "% humedad");
		
		System.out.println(((t2.getRecomendacion() ? "Se aconseja" : "Evite"))
				 + " hacer senderismo con " + t2.getTemperatura() + "�C y " + t2.getHumedad() + "% humedad");
		
		t2.setEstrategia(new MaratonStrategy());
		System.out.println(((t2.getRecomendacion() ? "Se aconseja" : "Evite"))
				 + " correr un marat�n con " + t2.getTemperatura() + "�C y " + t2.getHumedad() + "% humedad");
		
		System.out.println(((t3.getRecomendacion() ? "Se aconseja" : "Evite"))
				 + " hacer senderismo con " + t3.getTemperatura() + "�C y " + t3.getHumedad() + "% humedad");
				 
		t3.setEstrategia(new MaratonStrategy());
		System.out.println(((t3.getRecomendacion() ? "Se aconseja" : "Evite"))
				 + " correr un marat�n con " + t3.getTemperatura() + "�C y " + t3.getHumedad() + "% humedad");
				 
		t3.setEstrategia(new GimnasioStrategy());
		System.out.println(((t3.getRecomendacion() ? "Se aconseja" : "Evite"))
				 + " ir al gimnasio con " + t3.getTemperatura() + "�C y " + t3.getHumedad() + "% humedad");
		
	}

}


