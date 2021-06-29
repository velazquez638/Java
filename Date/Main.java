package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
 public static void main(String[] args) {
	 
      LocalDate fechaHoy = LocalDate.now();
      
      System.out.println("La fecha de hoy es " + fechaHoy);
      System.out.println("El año es " + fechaHoy.getYear() +
        ", el mes " + fechaHoy.getMonthValue() + " (" + fechaHoy.getMonth() + ") y el día " + fechaHoy.getDayOfMonth());
      System.out.println("El día de la semana es " + fechaHoy.getDayOfWeek() + " y el día del año " + fechaHoy.getDayOfYear());
      
      
      LocalDate fecha1 = LocalDate.parse("2020-01-20");
      
      System.out.println("");
      System.out.println("La fecha 1 es " + fecha1);
      System.out.println("El año es " + fecha1.getYear() + ", el mes " + fecha1.getMonthValue() + " (" + fecha1.getMonth() + ") y el día " +
          fecha1.getDayOfMonth());
      
      
      DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      
      
      LocalDate fecha2 = LocalDate.parse("10-10-2000", formatoFecha);
      System.out.println("");
      System.out.println("La fecha 2 es " + fecha2);
      System.out.println("El año es " + fecha2.getYear() + ", el mes " + fecha2.getMonthValue() + " (" + fecha2.getMonth() + ") y el día " +
          fecha2.getDayOfMonth());
 
            
   }
 
 
}