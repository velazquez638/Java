package Facade;

public class EmpresaFranquiciadora {
	
	private Franquicia hamburgueseria;
	private Franquicia cafeteria;
	private Franquicia pizzeria;
	
	public EmpresaFranquiciadora() {
		
		this.hamburgueseria = new Hamburgueseria();
		this.cafeteria = new Cafeteria();
		this.pizzeria = new Pizzeria();
		
	}
	
	public String getCosteHamburgueseria() {
		
		return this.hamburgueseria.getNombre() + "\t" + this.hamburgueseria.getCoste();
	}
	
	public String getCosteCafeteria() {
		
		return this.cafeteria.getNombre() + "\t" + this.cafeteria.getCoste();
		
	}
	
	public String getCostePizzeria() {
		
		return this.pizzeria.getNombre() + "\t" + this.pizzeria.getCoste();
	}


}
