package NewAdapter;

public class TestAdaptadorObjetos {

	public static void main(String[] args) {
		
		ObjetoAntiguo antiguo = new ObjetoAntiguo("Juan Fern�ndez");
		AdaptadorObjeto nuevo = new AdaptadorObjeto(antiguo);
		System.out.println("Objeto antiguo " + antiguo.getNombre());
		System.out.println("Objeto nuevo " + nuevo.getNombre() + nuevo.getApellidos());
	}

}
