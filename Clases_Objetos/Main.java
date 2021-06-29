package Clases_Objetos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Universidad nebrija = new Universidad("nebrija.com");
		 
		 nebrija.altaPersonas(new Profesor("23432t", "Juan", "Martin", 2, 4, 2342, 748, 388));
		 
		 
		 nebrija.altaPersonas(new Profesor("45318921V", "Juan","Martin Lopez", 2, 5, 1972, 654, 2000));
		 
		 nebrija.altaPersonas(new Profesor("45289177M", "Mario", "Lara Gomez", 10, 11, 1977, 600, 1999));
		 
		 nebrija.altaPersonas(new Profesor("46291264X", "Laura","Rios Valle", 5, 3, 1978, 50457, 2008));
		 
		 nebrija.altaPersonas(new Alumno("51927663H", "Belen", "Llano Gamez", 5, 10, 2000, 12555, "INF"));
		 
		 nebrija.altaPersonas(new Alumno("52879130M", "Jesus","Perez Lopez", 12, 9, 2001, 5029788, "IND"));
		 
		 nebrija.altaPersonas(new Alumno("52189335N", "Luisa","Salas Rojo", 14, 4, 2001, 655157, "INF"));
		 
		
		
		  
		 
		 System.out.println(nebrija.consultaPersonas());
		 
		 System.out.println("------------------------------Profesores-------------------------------\n");
		 System.out.println(nebrija.consultaPersonas("Profesor"));
		 
		 System.out.println("------------------------------Alumnos-------------------------------\n");
		 System.out.println(nebrija.consultaPersonas("Alumno"));

		 
	}

}
