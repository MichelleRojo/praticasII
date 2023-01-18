package practicasII;


public abstract class  Animal {

	protected String nombre;
	protected String comida;
	protected int edad;
	protected String raza;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, String comida, int edad, String raza) {
		super();
		this.nombre = nombre;
		this.comida = comida;
		this.edad = edad;
		this.raza = raza;
	}
	
	public void mostrarDatos() {
		System.out.println(nombre);
	}
		
	
public void Alimentacion() {
		
	}

	public void Info() {
		System.out.println(nombre + comida + edad + raza );
	}
	
	
	
	
	
	
	
	
	
	
}
