package Ficheros;

public class Persona implements java.io.Serializable {
	
	 private static final long serialVersionUID = 1L;
	 private String dni;
	 private String nombre;
	 private String apellidos;
	 
	 public Persona(String dni, String nombre, String apellidos) {
	 this.dni = dni;
	 this.nombre = nombre;
	 this.apellidos = apellidos;
	 }
	 
	 public String getDNI() {
	 return this.dni;
	 }
	 
	 public String getNombre() {
	 return this.nombre;
	 }
	 
	 public String getApellidos() {
	 return this.apellidos;
	 }
	 
	 public String getDatos() {
	 return this.dni + " " + this.apellidos + ", " + this.nombre;
	 
	 }
	 
}
