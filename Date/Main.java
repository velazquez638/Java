package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
 public static void main(String[] args) {
	 
      LocalDate fechaHoy = LocalDate.now();
      
      System.out.println("La fecha de hoy es " + fechaHoy);
      System.out.println("El a�o es " + fechaHoy.getYear() +
        ", el mes " + fechaHoy.getMonthValue() + " (" + fechaHoy.getMonth() + ") y el d�a " + fechaHoy.getDayOfMonth());
      System.out.println("El d�a de la semana es " + fechaHoy.getDayOfWeek() + " y el d�a del a�o " + fechaHoy.getDayOfYear());
      
      
      LocalDate fecha1 = LocalDate.parse("2020-01-20");
      
      System.out.println("");
      System.out.println("La fecha 1 es " + fecha1);
      System.out.println("El a�o es " + fecha1.getYear() + ", el mes " + fecha1.getMonthValue() + " (" + fecha1.getMonth() + ") y el d�a " +
          fecha1.getDayOfMonth());
      
      
      DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      
      
      LocalDate fecha2 = LocalDate.parse("10-10-2000", formatoFecha);
      System.out.println("");
      System.out.println("La fecha 2 es " + fecha2);
      System.out.println("El a�o es " + fecha2.getYear() + ", el mes " + fecha2.getMonthValue() + " (" + fecha2.getMonth() + ") y el d�a " +
          fecha2.getDayOfMonth());
 
            
   }
 
 
}