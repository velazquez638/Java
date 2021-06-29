package Factory_Method;
import java.time.LocalTime;

public class Reloj12H extends Reloj {
	
	 public String getHora() {
		 
		 LocalTime hora = LocalTime.now();
		 
		 int h12 = (hora.getHour() <= 12) ?hora.getHour() : hora.getHour() - 12;
		 String hora12H = ((h12 < 10) ? "0" + h12 : h12) + ":" + ((hora.getMinute() < 10) ? "0" + hora.getMinute() : hora.getMinute()) + ":" +
				 ((hora.getSecond() < 10) ? "0" + hora.getSecond() : hora.getSecond());
		
		 return ((hora.getHour() < 12) ?(hora12H + " AM") : (hora12H + " PM"));
	 }
}