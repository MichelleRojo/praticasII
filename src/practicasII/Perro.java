package practicasII;

public class Perro extends Animal {

	public Perro() {
		
	}

	public Perro(String nombre, String comida, int edad, String raza) {
		super(nombre,comida,edad,raza);
	}

	
	public void mostrarDatos() {
		System.out.println("perro" );
	}
	
	
	@Override
	public void Alimentacion() {
		System.out.println("Se alimenta de comida balanceada marca Eukanuba");
	}

	public void Info() {
		System.out.println(nombre + comida + edad + raza );
	}
	
}
