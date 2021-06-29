package Clases_Objetos;
import java.util.Vector;


public class Universidad {
	
	private String Web;
	private Vector <Persona> Personas;
	
	public Universidad(String Web) {
		super();
		this.Web = Web;
		this.Personas = new Vector<Persona>();
	}

	
	
	public String getWeb() {
		return Web;
	}



	public void altaPersonas(Persona p) {
		this.Personas.add(p);
	}
	
	 public String consultaPersonas() {
		 
		
		for (int i = 0; i< Personas.size()-1; i++) {
			 System.out.println(Personas.get(i).getNombre() +" "+ Personas.get(i).getApellidos()+"\n");
			
		}
		
		return consultaPersonas();
		
		
	}
	 
	 
	 public String consultaPersonas(String tipo) {
		 
			
			for (int i = 0; i< Personas.size()-1; i++) {
				 System.out.println(Personas.get(i).getNombre() +" "+ Personas.get(i).getApellidos()+"\n");
				
			}
			
			return consultaPersonas();
			
			
		}
	 

}
