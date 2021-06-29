package Factory_Method;

import java.time.LocalTime;

public class Reloj24H extends Reloj{

	public String getHora() {
		
		LocalTime hora = LocalTime.now();
		return ((hora.getHour() < 10) ? "0" + hora.getHour() : hora.getHour()) + ":" +
					((hora.getMinute() < 10) ? "0" + hora.getMinute() : hora.getMinute()) + ":" +
							((hora.getSecond() < 10) ? "0" + hora.getSecond() : hora.getSecond());
		
	}
}
